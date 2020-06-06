/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JComboBox;
import modelo.Reservacion;
import conexion.ReservacionDAO;
import modelo.Huesped;
import conexion.HuespedDAO;
import conexion.conexionBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author erik
 */
public class VistaAgregarReservacion extends javax.swing.JFrame {

    conexion.conexionBD con;
    
    /**
     * Creates new form VistaAgregarReservacion
     */
    public VistaAgregarReservacion() {
        initComponents();
    }
    
    public VistaAgregarReservacion(conexion.conexionBD conexion) {
        initComponents();
        con = conexion;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        yearsCombo(cmb_year_entra);
        yearsCombo(cmb_year_reser);
        yearsCombo(cmb_year_sal);
        diasCombo(cmb_dia_sal);
        diasCombo(cmb_dia_entra);
        diasCombo(cmb_dia_reser);
        huespedes(cmb_huesped);
    }
    
    public void yearsCombo(JComboBox combo){
        for (int i = 2000; i < 2021; i++) {
            combo.addItem(i);
        }
    }
    
    public void diasCombo(JComboBox combo){
        for (int i = 1; i < 31; i++) {
            combo.addItem(i);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmb_habitacion = new javax.swing.JComboBox<>();
        cmb_dia_reser = new javax.swing.JComboBox<>();
        cmb_mes_reser = new javax.swing.JComboBox<>();
        cmb_year_reser = new javax.swing.JComboBox<>();
        cmb_dia_entra = new javax.swing.JComboBox<>();
        cmb_mes_entra = new javax.swing.JComboBox<>();
        cmb_year_entra = new javax.swing.JComboBox<>();
        cmb_dia_sal = new javax.swing.JComboBox<>();
        cmb_mes_sal = new javax.swing.JComboBox<>();
        cmb_year_sal = new javax.swing.JComboBox<>();
        sp_adulto = new javax.swing.JSpinner();
        sp_nino = new javax.swing.JSpinner();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmb_huesped = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setText("Reservacion");

        jLabel2.setText("Habitacion");

        jLabel3.setText("Fecha reservacion");

        jLabel4.setText("Fecha entrada");

        jLabel5.setText("Fecha salida");

        jLabel6.setText("Adultos");

        jLabel7.setText("Niños");

        cmb_habitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matrimoniales", "Familiares", "Compartidas", "Suite Principal" }));

        cmb_mes_reser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        cmb_mes_entra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        cmb_mes_sal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");

        jLabel8.setText("Huesped");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmb_dia_entra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmb_dia_reser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmb_dia_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmb_mes_entra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmb_year_entra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmb_mes_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmb_year_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmb_mes_reser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmb_year_reser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(cmb_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sp_adulto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sp_nino, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_huesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmb_huesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_dia_reser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_mes_reser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_year_reser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_dia_entra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmb_mes_entra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_year_entra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmb_dia_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_mes_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_year_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sp_adulto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sp_nino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aceptar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
        Reservacion r = new Reservacion();
        ReservacionDAO rdao = new ReservacionDAO();
        
        
        r.setIdHabitacion(habitaciones((String) cmb_habitacion.getSelectedItem()));
        String fechaReservacion = String.valueOf(cmb_year_reser.getSelectedItem())+'-'+
                meses(String.valueOf(cmb_mes_reser.getSelectedItem()))
                +'-'+String.valueOf(cmb_dia_reser.getSelectedItem());
        r.setFechaReservacion(fechaReservacion);
        String fechaEntrada = String.valueOf(cmb_year_entra.getSelectedItem())+"-"+
                meses(String.valueOf(cmb_mes_entra.getSelectedItem()))+"-"+String.valueOf(cmb_dia_entra.getSelectedItem());
        r.setFechaIngreso(fechaEntrada);
        String fechaSalida = String.valueOf(cmb_year_sal.getSelectedItem())+"-"+
                meses(String.valueOf(cmb_mes_sal.getSelectedItem()))+"-"+String.valueOf(cmb_dia_sal.getSelectedItem());
        r.setFechaSalida(fechaSalida);
        r.setAdultos(Byte.parseByte(sp_adulto.getValue().toString()));
        r.setNinos(Byte.parseByte(sp_nino.getValue().toString()));
        r.setIdHuesped(Integer.parseInt(cmb_huesped.getSelectedItem().toString().substring(0, 1)));
        
        rdao.agregarReservacion(con,r);
    }//GEN-LAST:event_btn_aceptarActionPerformed

    public int habitaciones(String hab){
        int valor = 0;
        if(hab.equalsIgnoreCase("Matrimoniales")){
            valor = 1;
        }
        else if(hab.equalsIgnoreCase("Familiares")){
            valor = 2;
        }
        else if(hab.equalsIgnoreCase("Compartidas")){
            valor = 3;
        }
        else if(hab.equalsIgnoreCase("Suite principal")){
            valor = 4;
        }
        return valor;
    }
    
    public int meses(String mes){
        int m = 0;
        switch(mes){
            case "Enero":
                m=1;
                break;
            case "Febrero":
                m=2;
                break;
            case "Marzo":
                m=3;
                break;
            case "Abril":
                m=4;
                break;
            case "Mayo":
                m=5;
                break;
            case "Junio":
                m=6;
                break;
            case "Julio":
                m=7;
                break;
            case "Agosto":
                m=8;
                break;
            case "Septiembre":
                m=9;
                break;
            case "Octubre":
                m=10;
                break;
            case "Noviembre":
                m=11;
                break;
            case "Diciembre":
                m=12;
                break;
        }
        return m;
    }
    
    public void huespedes(JComboBox huesped){
        ArrayList cmbHues = new ArrayList();
        HuespedDAO hdao = new HuespedDAO();
        cmbHues = hdao.huespedes(con);
        for (int i = 0; i < cmbHues.size(); i++) {
            huesped.addItem(cmbHues.get(i));
        }
    }
    
    public void actualizarReservacion(conexionBD conexion, Reservacion reser){
        cmb_huesped.setSelectedItem(reser.getIdHuesped());
        JButton actualizar = new JButton("Actualizar");
        actualizar.setBounds(190, 395, 130, 30);
        btn_aceptar.setVisible(false);
        add(actualizar);
        
        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Reservacion r = new Reservacion();
                ReservacionDAO rdao = new ReservacionDAO();
        
        
                r.setIdHabitacion(habitaciones((String) cmb_habitacion.getSelectedItem()));
                String fechaReservacion = String.valueOf(cmb_year_reser.getSelectedItem())+'-'+
                    meses(String.valueOf(cmb_mes_reser.getSelectedItem()))
                    +'-'+String.valueOf(cmb_dia_reser.getSelectedItem());
                r.setFechaReservacion(fechaReservacion);
                String fechaEntrada = String.valueOf(cmb_year_entra.getSelectedItem())+"-"+
                    meses(String.valueOf(cmb_mes_entra.getSelectedItem()))+"-"+String.valueOf(cmb_dia_entra.getSelectedItem());
                r.setFechaIngreso(fechaEntrada);
                String fechaSalida = String.valueOf(cmb_year_sal.getSelectedItem())+"-"+
                    meses(String.valueOf(cmb_mes_sal.getSelectedItem()))+"-"+String.valueOf(cmb_dia_sal.getSelectedItem());
                r.setFechaSalida(fechaSalida);
                r.setAdultos(Byte.parseByte(sp_adulto.getValue().toString()));
                r.setNinos(Byte.parseByte(sp_nino.getValue().toString()));
                r.setIdHuesped(Integer.parseInt(cmb_huesped.getSelectedItem().toString().substring(0, 1)));
                rdao.actualizarHuesped(con, r);
            }
        });
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAgregarReservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JComboBox<String> cmb_dia_entra;
    private javax.swing.JComboBox<String> cmb_dia_reser;
    private javax.swing.JComboBox<String> cmb_dia_sal;
    private javax.swing.JComboBox<String> cmb_habitacion;
    private javax.swing.JComboBox<String> cmb_huesped;
    private javax.swing.JComboBox<String> cmb_mes_entra;
    private javax.swing.JComboBox<String> cmb_mes_reser;
    private javax.swing.JComboBox<String> cmb_mes_sal;
    private javax.swing.JComboBox<String> cmb_year_entra;
    private javax.swing.JComboBox<String> cmb_year_reser;
    private javax.swing.JComboBox<String> cmb_year_sal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner sp_adulto;
    private javax.swing.JSpinner sp_nino;
    // End of variables declaration//GEN-END:variables
}