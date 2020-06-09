/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.postgresql.jdbc.PgResultSet;
import conexion.conexionBD;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author erik
 */
public class TablaHuesped {
    
    public void ver_tabla(JTable tablaHuesped,conexionBD conexion){
        
        tablaHuesped.setDefaultRenderer(Object.class, new Render());
        
        DefaultTableModel tm = new DefaultTableModel(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        String sql = "select id_huesped,nombre_huesped,primer_ap_huesped,segundo_ap_huesped,"
                + "correo_huesped,telefono_huesped,ciudad,identificacion,puntos from huesped;";
        ResultSet result = conexion.consultarRegistros(sql);
        JButton btn_eliminar = new JButton("Eliminar");
        btn_eliminar.setName("elm");
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eliminar.png")));
        JButton btn_actualizar = new JButton("Acutalizar");
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/actualizar.png")));
        btn_actualizar.setName("act");
        
        tm.setColumnIdentifiers(new Object[] {"Id","Nombre","Primer Ap","Segundo Ap","Correo",
            "Telefono","Pais","Identificacion","Puntos","Eliminar","Actualizar"});
        
        try{
            while(result.next()){
                tm.addRow(new Object[]{
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5),
                        result.getString(6),
                        result.getString(7),
                        result.getBoolean(8),
                        result.getInt(9),
                        btn_eliminar,
                        btn_actualizar});
            }
            tablaHuesped.setModel(tm);
            tablaHuesped.setRowHeight(30);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public void actualizar_tabla(JTable tablaHuesped,conexionBD conexion,String clave,String valor){
        
        tablaHuesped.setDefaultRenderer(Object.class, new Render());
        
        DefaultTableModel tm = new DefaultTableModel(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        String sql = "select * from huesped where "+clave+" like '%"+valor+"%';";
        ResultSet result = conexion.consultarRegistros(sql);
        JButton btn_eliminar = new JButton("Eliminar");
        btn_eliminar.setName("elm");
        JButton btn_actualizar = new JButton("Acutalizar");
        btn_actualizar.setName("act");
        
        tm.setColumnIdentifiers(new Object[] {"Id","Nombre","Primer Ap","Segundo Ap","Correo",
            "Telefono","Pais","Identificacion","Puntos","Eliminar","Actualizar"});
        
        try{
            while(result.next()){
                tm.addRow(new Object[]{
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5),
                        result.getString(6),
                        result.getString(7),
                        result.getBoolean(8),
                        result.getInt(9),
                        btn_eliminar,
                        btn_actualizar});
            }
            tablaHuesped.setModel(tm);
            tablaHuesped.setRowHeight(50);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}

class Render extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        if(value instanceof JButton){
            JButton btn = (JButton)value;
            return btn;
        }
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
    }
    
    
}
