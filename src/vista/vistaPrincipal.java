/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author erik
 */
public class vistaPrincipal extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form vistaPrincipal
     */
    
    Huesped hp = new Huesped();
    vistaHabitacion vh = new vistaHabitacion();
    vistaPago vp = new vistaPago();
    
    
    public vistaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        btn_huesped.addActionListener(this);
        btn_habitacion.addActionListener(this);
        btn_pago.addActionListener(this);
        //panelGeneral.add(hp,java.awt.BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        btn_huesped = new javax.swing.JButton();
        btn_habitacion = new javax.swing.JButton();
        btn_pago = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGeneral.setLayout(new java.awt.BorderLayout());

        panelPrincipal.setLayout(new javax.swing.BoxLayout(panelPrincipal, javax.swing.BoxLayout.PAGE_AXIS));

        btn_huesped.setText("Huesped");
        panelPrincipal.add(btn_huesped);

        btn_habitacion.setText("Habitacion");
        panelPrincipal.add(btn_habitacion);

        btn_pago.setText("Pago");
        panelPrincipal.add(btn_pago);

        panelGeneral.add(panelPrincipal, java.awt.BorderLayout.LINE_START);

        getContentPane().add(panelGeneral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_habitacion;
    private javax.swing.JButton btn_huesped;
    private javax.swing.JButton btn_pago;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equalsIgnoreCase("huesped")){
            System.out.println("funciona");
            //Huesped h = new Huesped();
            vh.setVisible(false);
            vp.setVisible(false);
            hp.setVisible(true);
            panelGeneral.add(hp,java.awt.BorderLayout.CENTER);
            panelGeneral.validate();
        }
        else if(ae.getActionCommand().equalsIgnoreCase("habitacion")){
            hp.setVisible(false);
            vp.setVisible(false);
            vh.setVisible(true);
            panelGeneral.add(vh,java.awt.BorderLayout.CENTER);
            panelGeneral.validate();
        }
        else if(ae.getActionCommand().equalsIgnoreCase("pago")){
            hp.setVisible(false);
            vh.setVisible(false);
            vp.setVisible(true);
            panelGeneral.add(vp,java.awt.BorderLayout.CENTER);
            panelGeneral.validate();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
