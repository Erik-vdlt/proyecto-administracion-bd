/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Reservacion;

/**
 *
 * @author erik
 */
public class ReservacionDAO {
    
    public void agregarReservacion(conexionBD conexion,Reservacion reservacion){
        String sql = "insert into reservacion(fecha_reservacion,fecha_entrada,fecha_salida,adultos,"
                + "niños,fk_huesped_reservacion,fk_habitacion_reservacion) values('"
                +reservacion.getFechaReservacion()+"','"
                +reservacion.getFechaIngreso()+"','"+reservacion.getFechaSalida()+"',"
                +reservacion.getAdultos()+","+reservacion.getNinos()+","
                +reservacion.getIdHuesped()+","+reservacion.getIdHabitacion()+");";
        System.out.println(sql);
        conexion.ejecutarInstruccionSQL(sql);
    }
    
    public void busquedaReservacion(conexionBD conexion,int id){
        ArrayList r = new ArrayList();
        try {
            String sql = "select adultos,niños from reservacion where id_reservacion = "+id;
            ResultSet rs = conexion.consultarRegistros(sql);
            
            while(rs.next()){
                r.add(rs.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarHuesped(conexionBD conexion,Reservacion reser){
        String sql = "update reservacion set fecha_reservacion = '"+reser.getFechaReservacion()+
                "',fecha_entrada = '"+reser.getFechaIngreso()+"',fecha_salida = '"+reser.getFechaSalida()+
                "',adultos = "+reser.getAdultos()+",niños = "+reser.getNinos()+";";
        conexion.ejecutarInstruccionSQL(sql);
    }
    
    public void eliminarReservacion(conexionBD conexion,int valor){
        String sql = "delete from reservacion where id_reservacion = "+valor;
        conexion.ejecutarInstruccionSQL(sql);
    }
    
    
    public void datosGrafica(conexionBD conexion,ArrayList meses,ArrayList huespedes){
        try {
            String sql = "select count(fecha_reservacion),fk_huesped_reservacion from reservacion group by fk_huesped_reservacion;";
            
            ResultSet rs = conexion.consultarRegistros(sql);
            
            while(rs.next()){
                meses.add(rs.getInt(1));
                huespedes.add(rs.getInt(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
