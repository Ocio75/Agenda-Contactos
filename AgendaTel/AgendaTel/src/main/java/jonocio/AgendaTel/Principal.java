
package jonocio.AgendaTel;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import jonocio.BBDD.*;
import jonocio.Panles.*;

public final class Principal extends javax.swing.JFrame {
    Select select= new Select();
    Delete delete= new Delete();
    public Principal() throws SQLException {
        com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme.setup();
        initComponents();
        initStyles();
       
    }
   
    
    private void initStyles() throws SQLException{
        ShowJPanel(new Tabla());
        setFecha(LBL_fecha);
        BT_nuevocon.setText("NUEVO CONTACTO");
        LBL_fecha.putClientProperty( "FlatLaf.style", "font:bold  $h1.font" );
        BT_nuevocon.putClientProperty( "FlatLaf.style", "font:bold  $h2.font" );
        BT_agenda.putClientProperty( "FlatLaf.style", "font:bold  $h2.font" );
        BT_etiquetas.putClientProperty("FlatLaf.style", "font:bold  $h2.font");


              
    }
    public static void ShowJPanel(JPanel p) {
        p.setSize(1250, 705);
        p.setLocation(0,0);
        cuerpo.removeAll();
        cuerpo.add(p, BorderLayout.CENTER);
        cuerpo.revalidate();
        cuerpo.repaint();
    }
    private void setFecha  (JLabel fecha) {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String fechaFormateada = String.format("%02d/%02d/%d", dia, month, year);
        fecha.setText("" + fechaFormateada);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cuerpo = new javax.swing.JPanel();
        Menu_lateral = new javax.swing.JPanel();
        LBL_fecha = new javax.swing.JLabel();
        BT_nuevocon = new javax.swing.JButton();
        BT_agenda = new javax.swing.JButton();
        BT_etiquetas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contactos");
        setBackground(new java.awt.Color(28, 64, 87));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        cuerpo.setBackground(new java.awt.Color(28, 64, 87));

        javax.swing.GroupLayout cuerpoLayout = new javax.swing.GroupLayout(cuerpo);
        cuerpo.setLayout(cuerpoLayout);
        cuerpoLayout.setHorizontalGroup(
            cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        cuerpoLayout.setVerticalGroup(
            cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );

        Menu_lateral.setBackground(java.awt.Color.darkGray);

        LBL_fecha.setText("jLabel1");

        BT_nuevocon.setText("Nuevo contacto");
        BT_nuevocon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_nuevoconActionPerformed(evt);
            }
        });

        BT_agenda.setText("AGENDA");
        BT_agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_agendaActionPerformed(evt);
            }
        });

        BT_etiquetas.setText("ETIQUETAS");
        BT_etiquetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_etiquetasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_lateralLayout = new javax.swing.GroupLayout(Menu_lateral);
        Menu_lateral.setLayout(Menu_lateralLayout);
        Menu_lateralLayout.setHorizontalGroup(
            Menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_lateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BT_agenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_nuevocon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(BT_etiquetas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addGroup(Menu_lateralLayout.createSequentialGroup()
                        .addComponent(LBL_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        Menu_lateralLayout.setVerticalGroup(
            Menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_lateralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LBL_fecha)
                .addGap(104, 104, 104)
                .addComponent(BT_agenda, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(BT_nuevocon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(BT_etiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu_lateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_lateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_agendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_agendaActionPerformed
        try {
            ShowJPanel(new Tabla());
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BT_agendaActionPerformed

    private void BT_nuevoconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_nuevoconActionPerformed
        try {
            ShowJPanel(new Formulario());
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BT_nuevoconActionPerformed

    private void BT_etiquetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_etiquetasActionPerformed
        ShowJPanel(new Etiquetas());
    }//GEN-LAST:event_BT_etiquetasActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_agenda;
    private javax.swing.JButton BT_etiquetas;
    private javax.swing.JButton BT_nuevocon;
    private javax.swing.JLabel LBL_fecha;
    private javax.swing.JPanel Menu_lateral;
    private static javax.swing.JPanel cuerpo;
    // End of variables declaration//GEN-END:variables
}
