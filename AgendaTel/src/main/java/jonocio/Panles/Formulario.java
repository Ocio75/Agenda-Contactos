
package jonocio.Panles;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import static java.nio.file.Files.delete;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import jonocio.AgendaTel.FRM_informacion;
import jonocio.AgendaTel.Principal;
import static jonocio.AgendaTel.Principal.ShowJPanel;
import jonocio.BBDD.Delete;
import jonocio.BBDD.Insert;
import jonocio.BBDD.Select;
import jonocio.BBDD.Update;
import jonocio.Utiles.MensaEmergentes;

public class Formulario extends javax.swing.JPanel {
    Select select = new Select();
    Update updat = new Update();
    String id = "";

    public Formulario(String _id) throws SQLException {
        id = _id;
        initComponents();
        initEstilos();
        LBLEncabezado.setText("MODIFICAR CONTACTO");
        BT_enviar.setText("Actualiar");
        llenarCa();


    }
    public Formulario() throws SQLException {
        initComponents();
        LBLEncabezado.setText("AÑADIR CONTACTO");
        BT_enviar.setText("Añadir");
        initEstilos();

    }
    private void initEstilos() throws SQLException {
        FlatArcDarkIJTheme.setup();
        CB_genero.removeAllItems();
        CB_genero.addItem("Hombre");
        CB_genero.addItem("Mujer");
        CB_genero.addItem("Otro");
        select.llenarCombo(CB_tipocon);
        LBLEncabezado.putClientProperty("FlatLaf.style", "font: 150% $h1.font");
        LBL_Nombre.putClientProperty("FlatLaf.style", "font: $h3.font");
        LBL_apellidos.putClientProperty("FlatLaf.style", "font: $h3.font");
        LBL_Correo.putClientProperty("FlatLaf.style", "font: $h3.font");
        LBL_telefono.putClientProperty("FlatLaf.style", "font: $h3.font");
        LBL_Fechanacimiento.putClientProperty("FlatLaf.style", "font: $h3.font");
        LBL_genero.putClientProperty("FlatLaf.style", "font: $h3.font");
        LBL_Notas.putClientProperty("FlatLaf.style", "font: $h3.font");
        LBL_direccion.putClientProperty("FlatLaf.style", "font: $h3.font");
        LBL_tipoConta.putClientProperty("FlatLaf.style", "font: $h3.font");
        Color nuevoColor = Color.RED; // Color deseado para el texto
        calendario.setForeground(nuevoColor);

    }
private void llenarCa() throws SQLException {
    String[] _temp = select.extraerInf(id);

    TXT_nombre.setText(_temp[1]);
    TXT_apellido.setText(_temp[2]);
    TXT_telefono.setText(_temp[3]);
    TXT_Correo.setText(_temp[4]);
    TXT_direccion.setText(_temp[5]);

    // Convierte el valor a String antes de asignarlo a los JComboBox
    CB_genero.setSelectedItem(String.valueOf(_temp[6]));
    CB_tipocon.setSelectedItem(String.valueOf(_temp[9]));

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

        setMaximumSize(new java.awt.Dimension(1250, 705));
        setMinimumSize(new java.awt.Dimension(1250, 705));

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
        bg.add(CB_tipocon, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 300, 40));
        bg.add(LBLEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 470, 70));

        TXT_nombre.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        TXT_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_nombreActionPerformed(evt);
            }
        });
        bg.add(TXT_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 230, 50));

        TXT_apellido.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        TXT_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_apellidoActionPerformed(evt);
            }
        });
        bg.add(TXT_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 250, 50));

        TXT_Correo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bg.add(TXT_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 230, 50));

        TXT_notas.setColumns(20);
        TXT_notas.setRows(5);
        bg.add(TXT_notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 470, 140));

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
        bg.add(TXT_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 250, 50));

        BT_enviar.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        BT_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_enviarActionPerformed(evt);
            }
        });
        bg.add(BT_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, 230, 90));

        CB_genero.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        CB_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CB_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_generoActionPerformed(evt);
            }
        });
        bg.add(CB_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 250, 40));

        LBL_genero.setBackground(new java.awt.Color(255, 255, 255));
        LBL_genero.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_genero.setText("Genero:");
        bg.add(LBL_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 150, 30));

        LBL_tipoConta.setBackground(new java.awt.Color(255, 255, 255));
        LBL_tipoConta.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_tipoConta.setText("Etiqueta del contacto");
        bg.add(LBL_tipoConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 260, 30));

        LBL_apellidos.setBackground(new java.awt.Color(255, 255, 255));
        LBL_apellidos.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_apellidos.setText("Apellidos");
        bg.add(LBL_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 180, 40));

        LBL_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        LBL_Nombre.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_Nombre.setText("Nombre");
        bg.add(LBL_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 170, 40));

        LBL_Correo.setBackground(new java.awt.Color(255, 255, 255));
        LBL_Correo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_Correo.setText("Correo electronico");
        bg.add(LBL_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 170, 40));

        LBL_Fechanacimiento.setBackground(new java.awt.Color(255, 255, 255));
        LBL_Fechanacimiento.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_Fechanacimiento.setText("Fecha de nacimiento");
        bg.add(LBL_Fechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 210, 40));

        LBL_telefono.setBackground(new java.awt.Color(255, 255, 255));
        LBL_telefono.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_telefono.setText("Telefono");
        bg.add(LBL_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 180, 40));

        LBL_direccion.setBackground(new java.awt.Color(255, 255, 255));
        LBL_direccion.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_direccion.setText("Direccion");
        bg.add(LBL_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 210, 40));

        LBL_Notas.setBackground(new java.awt.Color(255, 255, 255));
        LBL_Notas.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        LBL_Notas.setText("Notas");
        bg.add(LBL_Notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 140, 40));

        TXT_direccion.setColumns(20);
        TXT_direccion.setRows(5);
        bg.add(TXT_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 320, 160));

        calendario.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 230, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );
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
        try {
            ShowJPanel(new Tabla());
        } catch (SQLException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
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
