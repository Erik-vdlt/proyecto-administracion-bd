/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexion.ReservacionDAO;
import javax.swing.JButton;
import modelo.Huesped;
import modelo.TablaHuespedReservacion;
import modelo.Reservacion;

/**
 *
 * @author erik
 */
public class VistaHuespedReservacion extends javax.swing.JPanel {
    
    conexion.conexionBD con;
    TablaHuespedReservacion tablaHR = new TablaHuespedReservacion();
    ReservacionDAO rdao = new ReservacionDAO();

    /**
     * Creates new form vistaHuespedHabitacion
     */
    public VistaHuespedReservacion() {
        initComponents();
    }
    
    public VistaHuespedReservacion(conexion.conexionBD conexion) {
        initComponents();
        con = conexion;
        tablaHR.ver_tabla(tablaReservaciones, conexion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReservaciones = new javax.swing.JTable();
        btn_agregar_huesped = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        tablaReservaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tablaReservaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaReservacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaReservaciones);

        btn_agregar_huesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/agregar.png"))); // NOI18N
        btn_agregar_huesped.setText("Agregar");
        btn_agregar_huesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_huespedActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(49, 128, 205));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setText("Reservacion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_agregar_huesped)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar_huesped))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregar_huespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_huespedActionPerformed
        // TODO add your handling code here:
        VistaAgregarReservacion var = new VistaAgregarReservacion(con,tablaReservaciones);
        var.setVisible(true);
    }//GEN-LAST:event_btn_agregar_huespedActionPerformed

    private void tablaReservacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReservacionesMouseClicked
        // TODO add your handling code here:
        
        
        int columna = tablaReservaciones.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tablaReservaciones.getRowHeight();
        
        if(row < tablaReservaciones.getRowCount() && row >= 0 && columna < tablaReservaciones.getColumnCount() && columna >= 0){
            Object value = tablaReservaciones.getValueAt(row, columna);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton)value;
                if(boton.getName().equalsIgnoreCase("elm")){
                    int valor = Integer.parseInt(String.valueOf(tablaReservaciones.getValueAt(row, 0)));
                    rdao.eliminarReservacion(con, valor);
                    tablaHR.ver_tabla(tablaReservaciones, con);
                }
                else if(boton.getName().equalsIgnoreCase("act")){
                    VistaAgregarReservacion viar = new VistaAgregarReservacion(con,tablaReservaciones);
                    Reservacion r = new Reservacion();
                    r.setIdReservacion(Integer.parseInt(String.valueOf(tablaReservaciones.getValueAt(row, 4))));
                    r.setFechaReservacion(String.valueOf(tablaReservaciones.getValueAt(row, 5)));
                    r.setFechaIngreso(String.valueOf(tablaReservaciones.getValueAt(row, 6)));
                    r.setFechaSalida(String.valueOf(tablaReservaciones.getValueAt(row, 7)));
                    r.setIdHuesped(Integer.parseInt(String.valueOf(tablaReservaciones.getValueAt(row, 0))));
                    /*h.setIdHuesped(Integer.parseInt(String.valueOf(tablaReservaciones.getValueAt(row, 0))));
                    h.setNombreHuesped(String.valueOf(tablaReservaciones.getValueAt(row, 1)));
                    h.setPrimerApellido(String.valueOf(tablaReservaciones.getValueAt(row, 2)));
                    h.setSegundoApellido(String.valueOf(tablaReservaciones.getValueAt(row, 3)));
                    h.setDireccion(String.valueOf(tablaReservaciones.getValueAt(row, 4)));
                    h.setEmail(String.valueOf(tablaReservaciones.getValueAt(row, 5)));
                    h.setTelefono(String.valueOf(tablaReservaciones.getValueAt(row, 2)));
                    */
                    //ah.accionActualizarRegistro(h,co);
                    //ah.setVisible(true);
                    
                    viar.actualizarReservacion(con, r);
                    viar.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_tablaReservacionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_huesped;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaReservaciones;
    // End of variables declaration//GEN-END:variables
}
