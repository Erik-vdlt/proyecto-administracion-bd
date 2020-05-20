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
    
    
    public static conexionBD getConexionBD(String url,String bd){
        if(miConexionBD == null){
            miConexionBD = new conexionBD(url, bd);
        }
        return miConexionBD;
    }
    
    private conexionBD(String url,String bd){
        this.url=url;
        this.bd=bd;
    }
    
    public boolean conexion(){
        try {
            Class.forName("org.postgresql.Driver");
            con = (DriverManager.getConnection(getUrl()+getBd(), "postgres", "root1"));
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
}
