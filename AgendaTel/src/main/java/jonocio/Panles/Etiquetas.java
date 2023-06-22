package jonocio.Panles;

import java.awt.Font;
import static java.nio.file.Files.delete;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import jonocio.AgendaTel.FRM_informacion;
import jonocio.AgendaTel.Principal;
import static jonocio.AgendaTel.Principal.ShowJPanel;
import jonocio.BBDD.Delete;
import jonocio.BBDD.*;
import jonocio.Utiles.MensaEmergentes;

public class Etiquetas extends javax.swing.JPanel {
     Select select= new Select();
    Delete delete = new Delete();
    
    Insert insert = new Insert();
    public Etiquetas() {
        initComponents();
        initEstilos();
    }
       
    private void initEstilos(){
        select.llenarEtiquetas(jTable1);
        LBL_total.setText("Total : " + jTable1.getRowCount());
        LBL_total.putClientProperty("FlatLaf.style", "font:bold  $h3.font");
        LBLEncabezado.putClientProperty("FlatLaf.style", "font: $h1.font");
        txt_campo.putClientProperty("FlatLaf.style", "font: $h3.font");
        bt_enviar.putClientProperty("FlatLaf.style", "font: $h3.font");
        jTable1.setEnabled(false); // Desactiva la edición de celdas
        jTable1.setRowSorter(null); // Desactiva la ordenación de columnas
        jTable1.getTableHeader().setReorderingAllowed(false); // Desactiva la ordenación de columnas
        jTable1.getTableHeader().setResizingAllowed(false); // Desactiva la edición del tamaño de columnas
        establecerAnchoCero(jTable1, 0);
        aumentarTamañoFuenteTabla(jTable1, 18);

        
    }
    private void establecerAnchoCero(JTable table, int columnIndex) {
        TableColumnModel columnModel = table.getColumnModel();
        TableColumn column = columnModel.getColumn(columnIndex);
        column.setMinWidth(0);
        column.setMaxWidth(0);
        column.setPreferredWidth(0);
    }
    private void aumentarTamañoFuenteTabla(JTable tabla, int tamano) {
        Font font = tabla.getFont().deriveFont(Font.PLAIN, tamano);
        JTableHeader header = tabla.getTableHeader();
        tabla.setFont(font);
        header.setFont(font);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LBL_total = new javax.swing.JLabel();
        bt_enviar = new javax.swing.JButton();
        txt_campo = new javax.swing.JTextField();
        LBLEncabezado = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(28, 64, 87));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        LBL_total.setText("jLabel1");

        bt_enviar.setText("Añadir");
        bt_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enviarActionPerformed(evt);
            }
        });

        txt_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_campoActionPerformed(evt);
            }
        });

        LBLEncabezado.setText("Añadir etiqueta");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LBL_total, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LBLEncabezado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)))
                .addGap(179, 179, 179))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(LBLEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(bt_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBL_total)
                .addGap(121, 121, 121))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_campoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_campoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.rowAtPoint(evt.getPoint());
        String _id = String.valueOf(jTable1.getValueAt(fila, 0));
        String _nombre = String.valueOf(jTable1.getValueAt(fila, 1));
        if (MensaEmergentes.siNo(2, "Desea eliminara la etiqueta : " + _nombre+ "?", "ELiminar etiqueta") == 0) {
            try {
                if (delete.EliminarEtiqueta(_id)) {
                    MensaEmergentes.alerta(1, "Etiqueta borrado con exito", "Informacion");
                } else {
                    MensaEmergentes.alerta(4, "Error no se a podido eliminar la ettiqueta", "Error");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Etiquetas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            MensaEmergentes.alerta(1, "Operacion cancelada", "Informacion");
        }
      
        select.llenarEtiquetas(jTable1);
        LBL_total.setText("Total : " + jTable1.getRowCount());    }//GEN-LAST:event_jTable1MouseClicked

    private void bt_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviarActionPerformed
        String nombre = txt_campo.getText();
        try {

            if (insert.insertarEtiqueta(nombre)) {
                MensaEmergentes.alerta(1, "Etiqueta añadida correctamente", "Menaje");
            } else {
                MensaEmergentes.alerta(4, "No se ha podido añadir la etiqueta", "Error");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FRM_informacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        initEstilos();
    }//GEN-LAST:event_bt_enviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLEncabezado;
    private javax.swing.JLabel LBL_total;
    private javax.swing.JPanel bg;
    private javax.swing.JButton bt_enviar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_campo;
    // End of variables declaration//GEN-END:variables
}
