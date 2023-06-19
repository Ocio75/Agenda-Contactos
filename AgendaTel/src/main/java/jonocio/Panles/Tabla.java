
package jonocio.Panles;

import java.awt.Font;
import static java.nio.file.Files.delete;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import jonocio.AgendaTel.FRM_informacion;
import jonocio.AgendaTel.Principal;
import static jonocio.AgendaTel.Principal.ShowJPanel;
import jonocio.BBDD.Delete;
import jonocio.BBDD.Select;
import jonocio.Utiles.MensaEmergentes;

public class Tabla extends javax.swing.JPanel {
     Select select= new Select();
    Delete delete= new Delete();

    public Tabla() throws SQLException {
        initComponents();
        select.llenarTabla(jTable1,"");
        initStyles();
    }
    private void initStyles() throws SQLException{
        LBL_buscar.putClientProperty( "FlatLaf.style", "font:bold  $h2.font" );
        TXT_buscador.putClientProperty( "FlatLaf.style", "font:bold  $h3.font" );
        aumentarTamañoFuenteTabla(jTable1,15);
        jTable1.setEnabled(false); // Desactiva la edición de celdas
        jTable1.setRowSorter(null); // Desactiva la ordenación de columnas
        jTable1.getTableHeader().setReorderingAllowed(false); // Desactiva la ordenación de columnas
        jTable1.getTableHeader().setResizingAllowed(false); // Desactiva la edición del tamaño de columnas
        LBL_total.setText("Total : "+ jTable1.getRowCount());
        LBL_total.putClientProperty( "FlatLaf.style", "font:bold  $h3.font" );
       
        
    }
     private void aumentarTamañoFuenteTabla(JTable tabla, int tamano) {
      Font font= tabla.getFont().deriveFont(Font.PLAIN,tamano);
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
        TXT_buscador = new javax.swing.JTextField();
        LBL_buscar = new javax.swing.JLabel();
        LBL_total = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1250, 705));
        setMinimumSize(new java.awt.Dimension(1250, 705));

        bg.setBackground(new java.awt.Color(28, 64, 87));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Telefono", "Correo", "Direccion", "Genero", "Fecha de naimiento", "Notas", "Etiqueta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        TXT_buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_buscadorActionPerformed(evt);
            }
        });
        TXT_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXT_buscadorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_buscadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_buscadorKeyTyped(evt);
            }
        });

        LBL_buscar.setText("Buscar:");

        LBL_total.setText("wf");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(LBL_total, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBL_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(27, 27, 27))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(LBL_total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXT_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LBL_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila=jTable1.rowAtPoint(evt.getPoint());
        String _id=String.valueOf(jTable1.getValueAt(fila, 0));
        String nombre=String.valueOf(jTable1.getValueAt(fila, 1));
        String apellidos =String.valueOf(jTable1.getValueAt(fila, 2));
        int control= MensaEmergentes.modificarEliminar(3,"Que desea hacer con \n "+nombre+" "+apellidos,"Informacion");
        if (control==0){
            try {
                ShowJPanel(new Formulario(_id));
                
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(control==1){
            if(MensaEmergentes.siNo(2, "Desea eliminara a : "+nombre+" "+apellidos+"?", "ELiminar un contacto")==0){
                try {
                    if(delete.EliminarRegistro(_id)){
                        MensaEmergentes.alerta(1, "Contacto borrado con exito", "Informacion");
                    }else{
                        MensaEmergentes.alerta(4, "Error no se a podido eliminar el contacto", "Error");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                MensaEmergentes.alerta(1,"Operacion cancelada","Informacion");
            }
        }else{
        }
        select.llenarTabla(jTable1, "");
        LBL_total.setText("Total : " + jTable1.getRowCount());

    }//GEN-LAST:event_jTable1MouseClicked

    private void TXT_buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_buscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_buscadorActionPerformed

    private void TXT_buscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_buscadorKeyPressed

    }//GEN-LAST:event_TXT_buscadorKeyPressed

    private void TXT_buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_buscadorKeyReleased
        String aBuscar = TXT_buscador.getText();
        select.llenarTabla(jTable1, aBuscar);
        LBL_total.setText("Total : " + jTable1.getRowCount());
    }//GEN-LAST:event_TXT_buscadorKeyReleased

    private void TXT_buscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_buscadorKeyTyped

    }//GEN-LAST:event_TXT_buscadorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL_buscar;
    private javax.swing.JLabel LBL_total;
    private javax.swing.JTextField TXT_buscador;
    private javax.swing.JPanel bg;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
