/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Huesped;

/**
 *
 * @author erik
 */
public class conexionBD {
    private static Connection con = null;
    private Statement stm;
    private static conexionBD miConexionBD;
    public static String usuario;
    public static String contra;
    private String url;
    private String bd;
    boolean flag = false;
    ResultSet rs;
    PreparedStatement pstmt;
    

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        conexionBD.usuario = usuario;
    }

    public static String getContra() {
        return contra;
    }

    public static void setContra(String contra) {
        conexionBD.contra = contra;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }
    
    
    public static conexionBD getConexionBD(){
        if(miConexionBD == null){
            miConexionBD = new conexionBD();
        }
        return miConexionBD;
    }
    
    public  Connection conexionReporte(){
        if(con == null){
            try {
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection("jdbc:postgresql://ruby.db.elephantsql.com:5432/xuvjidzf", "xuvjidzf", "EE68TH5LX3aT2JnabC6R3uQ5YPghbe1_");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return con;
    }
    
    private conexionBD(String url,String bd){
        this.url=url;
        this.bd=bd;
    }
    
    private conexionBD(){
        
    }
    
    public boolean conexion(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://ruby.db.elephantsql.com:5432/xuvjidzf","xuvjidzf","EE68TH5LX3aT2JnabC6R3uQ5YPghbe1_");
            //con = (DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Hotel_db","postgresql","root1"));
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERROR EN EL DRIVER");
        }
        return flag;
    }
    
    public boolean ejecutarInstruccionSQL(String sql) {

        int ejecucion;
        try {
            stm = (Statement)con.createStatement();
            ejecucion = stm.executeUpdate(sql);
            return ejecucion==1?true:false;
        }
        catch(SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean ejecutarInstruccionInjecction(String sql,Huesped h) {
        boolean x = false;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, h.getNombreHuesped());
            pstmt.setString(2, h.getPrimerApellido());
            pstmt.setString(3, h.getSegundoApellido());
            pstmt.setString(4, h.getEmail());
            pstmt.setString(5, h.getCiudad());
            pstmt.setString(6, h.getTelefono());
            pstmt.setBoolean(7, h.isIdentificacion());
            pstmt.setInt(8, 1);
            pstmt.executeUpdate();
            //stm = con.prepareStatement(sql);
            //stm.executeUpdate(sql);
            x = true;
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
    
    public boolean actualizarHuespedInjection(String sql,Huesped h) {
        boolean x = false;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, h.getNombreHuesped());
            pstmt.setString(2, h.getPrimerApellido());
            pstmt.setString(3, h.getSegundoApellido());
            pstmt.setString(4, h.getEmail());
            pstmt.setString(5, h.getTelefono());
            pstmt.setString(6, h.getCiudad());
            pstmt.setBoolean(7, h.isIdentificacion());
            pstmt.setInt(8, h.getIdHuesped());
            pstmt.executeUpdate();
            //stm = con.prepareStatement(sql);
            //stm.executeUpdate(sql);
            x = true;
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
    
    public boolean eliminaHuesped(String sql,int id){
        int ejecucion=0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            return ejecucion==1?true:false;
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean instruccionSQL(String sql){
         boolean x = false;
        try {
            stm = con.prepareStatement(sql);
            stm.executeUpdate(sql);
            x = true;
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
    
    public ResultSet consultarRegistros(String sql) {
		
	try {
            stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stm.executeQuery(sql);
	} catch (SQLException e) {
            e.printStackTrace();
	}
	return rs;
    }
    
    public void cerrarConexion(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
