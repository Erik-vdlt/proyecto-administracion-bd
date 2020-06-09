/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import modelo.Huesped;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author erik
 */
public class HuespedDAO {
    
    
    public boolean agregarHuesped(conexionBD conexion,Huesped hp){
       /* String sql = "insert into huesped(nombre_huesped,primer_ap_huesped,"
                + "segundo_ap_huesped,correo_huesped,telefono_huesped,ciudad,identificacion) values('"+hp.getNombreHuesped()+"',"
                + "'"+hp.getPrimerApellido()+"','"+hp.getSegundoApellido()+"','"+hp.getEmail()+"',"
                +"'"+hp.getTelefono()+"','"+hp.getPais()+"',"+String.valueOf(hp.isIdentificacion())+");";*/
       String sql = "insert into  huesped(nombre_huesped,primer_ap_huesped,segundo_ap_huesped,correo_huesped,"
               + "telefono_huesped,ciudad,identificacion,fk_huesped_usuario) values(?,?,?,?,?,?,?,?)";
        return conexion.ejecutarInstruccionInjecction(sql,hp);
    }
    
    public boolean eliminarHuesped(conexionBD conexion,int id){
        String sql = "delete from huesped where id_huesped = ?";
        return conexion.eliminaHuesped(sql,id);
    }
    
    public boolean actualizarHuesped(conexionBD conexion,Huesped h){
        /*String sql = "update huesped set nombre_huesped = '"+h.getNombreHuesped()+"',primer_apellido_huesped = '"+h.getPrimerApellido()
                +"',segundo_apellido_huesped = '"+h.getSegundoApellido()+"',direccion = '"+h.getDireccion()+"',email = '"+h.getEmail()
                +"',telefono = '"+h.getTelefono()+"',pais = '"+h.getPais()+"',identificacion = "+h.isIdentificacion()
                +" where id_huesped = "+h.getIdHuesped()+";";*/
        String sql = "update huesped set nombre_huesped = ?,primer_ap_huesped = ?,segundo_ap_huesped = ?,"
                + "correo_huesped = ?,telefono_huesped = ?,ciudad = ?, identificacion = ? where id_huesped = ?";
        
        return conexion.actualizarHuespedInjection(sql, h);    
    }
    
    public ArrayList huespedes(conexionBD conexion){
        ArrayList h = new ArrayList();
        try {
            String sql = "select id_huesped,nombre_huesped,primer_ap_huesped,segundo_ap_huesped from huesped";
            ResultSet resultado = conexion.consultarRegistros(sql);
            
            while(resultado.next()){
                h.add(resultado.getInt(1)+" "+resultado.getString(2)+" "+resultado.getString(3)+" "+resultado.getString(4));
            }

        } catch (SQLException ex) {
            Logger.getLogger(HuespedDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return h;
    }
    
    
}
