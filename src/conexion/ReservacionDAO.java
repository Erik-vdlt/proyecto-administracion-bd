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

/**
 *
 * @author erik
 */
public class ReservacionDAO {
    
    
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
