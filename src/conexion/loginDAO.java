/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.LoginModelo;
import java.sql.ResultSet;

/**
 *
 * @author erik
 */
public class loginDAO {
    
    public void buscarUsuario(conexionBD conexion,ArrayList usuarios,ArrayList password,ArrayList tipo){
        LoginModelo lm = new LoginModelo();
        String sql = "select usuario,contraseña,fk_tipo_usuario from usuarios";
        ResultSet rs = conexion.consultarRegistros(sql);
        try {
            
            while(rs.next()){
                usuarios.add(rs.getString(1));
                password.add(rs.getString(2));
                tipo.add(rs.getInt(3));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
