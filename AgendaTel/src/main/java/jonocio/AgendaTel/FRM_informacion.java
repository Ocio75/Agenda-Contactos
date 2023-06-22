
package jonocio.AgendaTel;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import java.awt.Color;
import java.awt.Dialog;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import jonocio.Utiles.MensaEmergentes;
import jonocio.BBDD.*;
import jonocio.BBDD.Select;
import jonocio.BBDD.Update;
public class FRM_informacion extends javax.swing.JFrame {
     Select select= new Select();
    Update updat=new Update();
    String id="";
    public FRM_informacion(String _id) throws SQLException {
        id=_id;
        initComponents();
        llenarCa();
        initEstilos();
        setTitle("Formulario Modificar Contacto");
        LBLEncabezado.setText("Modificar Contacto");
        BT_enviar.setText("Actualiar");

    }
     public FRM_informacion() throws SQLException{
         initComponents();
         setTitle("Formulario Añadir Contacto ");
         LBLEncabezado.setText("Añadir Contacto");
         BT_enviar.setText("Añadir");
         initEstilos();
     }

     private void initEstilos() throws SQLException{
        this.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        FlatArcDarkIJTheme.setup();
        CB_genero.removeAllItems();
        CB_genero.addItem("Hombre");
        CB_genero.addItem("Mujer");
        CB_genero.addItem("Otro");
        select.llenarCombo(CB_tipocon);
        LBLEncabezado.putClientProperty( "FlatLaf.style", "font: $h1.font" );
        LBL_Nombre.putClientProperty( "FlatLaf.style", "font: $h4.font" );
        LBL_apellidos.putClientProperty( "FlatLaf.style", "font: $h4.font" );
        LBL_Correo.putClientProperty( "FlatLaf.style", "font: $h4.font" );
        LBL_telefono.putClientProperty( "FlatLaf.style", "font: $h4.font" );
        LBL_Fechanacimiento.putClientProperty("FlatLaf.style", "font: $h4.font");
        LBL_genero.putClientProperty("FlatLaf.style", "font: $h4.font");
        LBL_Notas.putClientProperty("FlatLaf.style", "font: $h4.font");
        LBL_direccion.putClientProperty("FlatLaf.style", "font: $h4.font");
        LBL_tipoConta.putClientProperty("FlatLaf.style", "font: $h4.font");
               
    }
    private void llenarCa() throws SQLException {
        String[] _temp = select.extraerInf(id);

        TXT_nombre.setText(_temp[1]);
        TXT_apellido.setText(_temp[2]);
        TXT_telefono.setText(_temp[3]);
        TXT_Correo.setText(_temp[4]);
        TXT_direccion.setText(_temp[5]);
        CB_genero.setSelectedItem(_temp[6]);

        try {
            Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse(_temp[7]);
            calendario.setDate(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        CB_tipocon = new javax.swing.JComboBox<>();
        LBLEncabezado = new javax.swing.JLabel();
        TXT_nombre = new javax.swing.JTextField();
        TXT_apellido = new javax.swing.JTextField();
        TXT_Correo = new javax.swing.JTextField();
        TXT_notas = new javax.swing.JTextArea();
        TXT_telefono = new javax.swing.JTextField();
        BT_enviar = new javax.swing.JButton();
        CB_genero = new javax.swing.JComboBox<>();
        LBL_genero = new javax.swing.JLabel();
        LBL_tipoConta = new javax.swing.JLabel();
        LBL_apellidos = new javax.swing.JLabel();
        LBL_Nombre = new javax.swing.JLabel();
        LBL_Correo = new javax.swing.JLabel();
        LBL_Fechanacimiento = new javax.swing.JLabel();
        LBL_telefono = new javax.swing.JLabel();
        LBL_direccion = new javax.swing.JLabel();
        LBL_Notas = new javax.swing.JLabel();
        TXT_direccion = new javax.swing.JTextArea();
        calendario = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setResizable(false);
        setSize(new java.awt.Dimension(670, 420));
        setType(java.awt.Window.Type.POPUP);

        bg.setBackground(new java.awt.Color(28, 64, 87));
        bg.setToolTipText("");
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg.setMinimumSize(new java.awt.Dimension(760, 510));
        bg.setPreferredSize(new java.awt.Dimension(760, 530));
        bg.setRequestFocusEnabled(false);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CB_tipocon.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        CB_tipocon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CB_tipocon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_tipoconActionPerformed(evt);
            }
        });
        bg.add(CB_tipocon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 210, 32));
        bg.add(LBLEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 250, 56));

        TXT_nombre.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        TXT_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_nombreActionPerformed(evt);
            }
        });
        bg.add(TXT_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 175, 39));

        TXT_apellido.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        TXT_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_apellidoActionPerformed(evt);
            }
        });
        bg.add(TXT_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 190, 39));

        TXT_Correo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bg.add(TXT_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 175, 39));

        TXT_notas.setColumns(20);
        TXT_notas.setRows(5);
        bg.add(TXT_notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 390, 130));

        TXT_telefono.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        TXT_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_telefonoActionPerformed(evt);
            }
        });
        TXT_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_telefonoKeyTyped(evt);
            }
        });
        bg.add(TXT_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 190, 39));

        BT_enviar.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        BT_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_enviarActionPerformed(evt);
            }
        });
        bg.add(BT_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 160, 60));

        CB_genero.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        CB_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CB_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_generoActionPerformed(evt);
            }
        });
        bg.add(CB_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 190, 34));

        LBL_genero.setBackground(new java.awt.Color(255, 255, 255));
        LBL_genero.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_genero.setText("Genero:");
        bg.add(LBL_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 90, 20));

        LBL_tipoConta.setBackground(new java.awt.Color(255, 255, 255));
        LBL_tipoConta.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_tipoConta.setText("Etiqueta del contacto");
        bg.add(LBL_tipoConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 170, 20));

        LBL_apellidos.setBackground(new java.awt.Color(255, 255, 255));
        LBL_apellidos.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_apellidos.setText("Apellidos");
        bg.add(LBL_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 115, 24));

        LBL_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        LBL_Nombre.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_Nombre.setText("Nombre");
        bg.add(LBL_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 115, 24));

        LBL_Correo.setBackground(new java.awt.Color(255, 255, 255));
        LBL_Correo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_Correo.setText("Correo electronico");
        bg.add(LBL_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 115, 24));

        LBL_Fechanacimiento.setBackground(new java.awt.Color(255, 255, 255));
        LBL_Fechanacimiento.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_Fechanacimiento.setText("Fecha de nacimiento");
        bg.add(LBL_Fechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, 24));

        LBL_telefono.setBackground(new java.awt.Color(255, 255, 255));
        LBL_telefono.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_telefono.setText("Telefono");
        bg.add(LBL_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 115, 24));

        LBL_direccion.setBackground(new java.awt.Color(255, 255, 255));
        LBL_direccion.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_direccion.setText("Direccion");
        bg.add(LBL_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 115, 24));

        LBL_Notas.setBackground(new java.awt.Color(255, 255, 255));
        LBL_Notas.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_Notas.setText("Notas");
        bg.add(LBL_Notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 115, 24));

        TXT_direccion.setColumns(20);
        TXT_direccion.setRows(5);
        bg.add(TXT_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, 110));

        calendario.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        bg.getAccessibleContext().setAccessibleName("");
        bg.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CB_tipoconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_tipoconActionPerformed

    }//GEN-LAST:event_CB_tipoconActionPerformed

    private void TXT_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_nombreActionPerformed

    private void TXT_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_apellidoActionPerformed

    private void TXT_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_telefonoActionPerformed

    private void TXT_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_telefonoKeyTyped
        char c = evt.getKeyChar();
        boolean numero = c >=48 && c<=57;
        if(!numero){
            evt.consume();
            MensaEmergentes.alerta(4, "Valor inroducido en el campo telefono incorrecto", "Error");
        }
    }//GEN-LAST:event_TXT_telefonoKeyTyped

    private void BT_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_enviarActionPerformed
        String[] datos = new String[]{
            TXT_nombre.getText(),
            TXT_apellido.getText(),
            TXT_telefono.getText(),
            TXT_Correo.getText(),
            TXT_direccion.getText(),
            CB_genero.getSelectedItem().toString(),
            new SimpleDateFormat("yyyy-MM-dd").format(calendario.getDate()),
            TXT_notas.getText(),
            CB_tipocon.getSelectedItem().toString(),
            id
        };
        if(id!=""){    
            if (updat.actualizarContacto(datos)) {
                MensaEmergentes.alerta(1, "Contacto actualizado correctamente", "Menaje");
            } else {
                MensaEmergentes.alerta(4, "No se ha podido actualizar el contacto", "Error");
            }
        }else{
            Insert insert =new Insert();
            try {
              
                if (insert.insertContacto(datos)) {
                    MensaEmergentes.alerta(1, "Contacto añadido correctamente", "Menaje");
                } else {
                    MensaEmergentes.alerta(4, "No se ha podido añadir el contacto", "Error");
                }
            } catch (SQLException ex) {
                Logger.getLogger(FRM_informacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_BT_enviarActionPerformed
       
    private void CB_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_generoActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_enviar;
    private javax.swing.JComboBox<String> CB_genero;
    private javax.swing.JComboBox<String> CB_tipocon;
    private javax.swing.JLabel LBLEncabezado;
    private javax.swing.JLabel LBL_Correo;
    private javax.swing.JLabel LBL_Fechanacimiento;
    private javax.swing.JLabel LBL_Nombre;
    private javax.swing.JLabel LBL_Notas;
    private javax.swing.JLabel LBL_apellidos;
    private javax.swing.JLabel LBL_direccion;
    private javax.swing.JLabel LBL_genero;
    private javax.swing.JLabel LBL_telefono;
    private javax.swing.JLabel LBL_tipoConta;
    private javax.swing.JTextField TXT_Correo;
    private javax.swing.JTextField TXT_apellido;
    private javax.swing.JTextArea TXT_direccion;
    private javax.swing.JTextField TXT_nombre;
    private javax.swing.JTextArea TXT_notas;
    private javax.swing.JTextField TXT_telefono;
    private javax.swing.JPanel bg;
    private com.toedter.calendar.JDateChooser calendario;
    // End of variables declaration//GEN-END:variables
}
