/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import modelo.Huesped;
/**
 *
 * @author erik
 */
public class HuespedDAO {
    
    
    public boolean agregarHuesped(conexionBD conexion,Huesped hp){
        String sql = "insert into huesped(nombre_huesped,primer_apellido_huesped,"
                + "segundo_apellido_huesped,direccion,email,telefono,pais,identificacion) values('"+hp.getNombreHuesped()+"',"
                + "'"+hp.getPrimerApellido()+"','"+hp.getSegundoApellido()+"','"+hp.getDireccion()+"',"
                +"'"+hp.getEmail()+"','"+hp.getTelefono()+"','"+hp.getPais()+"',"
                +String.valueOf(hp.isIdentificacion())+");";
        return conexion.ejecutarInstruccionSQL(sql);
    }
    
    public boolean eliminarHuesped(conexionBD conexion,int id){
        String sql = "delete from huesped where id_huesped = "+id;
        return conexion.ejecutarInstruccionSQL(sql);
    }
    
    
}
