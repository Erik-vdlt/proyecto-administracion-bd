/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexion.conexionBD;
import java.awt.Component;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erik
 */
public class TablaHuespedReservacion {
    
    public void ver_tabla(JTable tablaReservacion,conexionBD conexion){
        
        tablaReservacion.setDefaultRenderer(Object.class, new Render());
        
        DefaultTableModel tm = new DefaultTableModel(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        String sql = "select id_huesped,nombre_huesped,primer_ap_huesped,segundo_ap_huesped,\n" +
                     "id_reservacion,fecha_reservacion,fecha_entrada,fecha_salida from huesped\n" +
                     "inner join reservacion on id_huesped = fk_huesped_reservacion;";
        
        
        ResultSet result = conexion.consultarRegistros(sql);
        JButton btn_eliminar = new JButton("Eliminar");
        btn_eliminar.setName("elm");
        JButton btn_actualizar = new JButton("Acutalizar");
        btn_actualizar.setName("act");
        
        tm.setColumnIdentifiers(new Object[] {"Id Huesped","Nombre","Primer Ap","Segundo Ap","Id Reservacion","Reservacion",
            "Ingreso","Salida","Eliminar","Actualizar"});
        
        try{
            while(result.next()){
                tm.addRow(new Object[]{
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getInt(5),
                        result.getString(6),
                        result.getString(7),
                        result.getString(8),
                        btn_eliminar,
                        btn_actualizar});
            }
            tablaReservacion.setModel(tm);
            tablaReservacion.setRowHeight(30);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}


class Render1 extends DefaultTableCellRenderer {

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