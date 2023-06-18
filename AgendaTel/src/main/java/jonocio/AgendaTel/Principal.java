
package jonocio.AgendaTel;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.*;
import java.awt.Font;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;
import jonocio.BBDD.*;
import jonocio.Utiles.MensaEmergentes;

public class Principal extends javax.swing.JFrame {
    Select select= new Select();
    Delete delete= new Delete();
    public Principal() {
        com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme.setup();
        initComponents();
        select.llenarTabla(jTable1,"");
        initStyles();
        setFecha(LBL_fecha);
    }
    private void initStyles(){
        LBL_fecha.putClientProperty( "FlatLaf.style", "font:bold  $h1.font" );
        LBL_buscar.putClientProperty( "FlatLaf.style", "font:bold  $h2.font" );
        TXT_buscador.putClientProperty( "FlatLaf.style", "font:bold  $h3.font" );
        aumentarTamañoFuenteTabla(jTable1,15);
        jTable1.setEnabled(false); // Desactiva la edición de celdas
        jTable1.setRowSorter(null); // Desactiva la ordenación de columnas
        jTable1.getTableHeader().setReorderingAllowed(false); // Desactiva la ordenación de columnas
        jTable1.getTableHeader().setResizingAllowed(false); // Desactiva la edición del tamaño de columnas

        
        
    }
   private void aumentarTamañoFuenteTabla(JTable tabla, int tamano) {
      Font font= tabla.getFont().deriveFont(Font.PLAIN,tamano);
      JTableHeader header = tabla.getTableHeader();
      tabla.setFont(font);
      header.setFont(font);
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

        bg = new javax.swing.JPanel();
        LBL_fecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TXT_buscador = new javax.swing.JTextField();
        LBL_buscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contactos");
        setBackground(new java.awt.Color(28, 64, 87));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        bg.setBackground(new java.awt.Color(28, 64, 87));

        LBL_fecha.setText("jLabel1");

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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
        }

        TXT_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXT_buscadorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_buscadorKeyTyped(evt);
            }
        });

        LBL_buscar.setText("Buscar:");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(LBL_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(LBL_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LBL_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_buscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_buscadorKeyTyped
        String aBuscar= TXT_buscador.getText();
        select.llenarTabla(jTable1, aBuscar);
    }//GEN-LAST:event_TXT_buscadorKeyTyped

    private void TXT_buscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_buscadorKeyPressed
    }//GEN-LAST:event_TXT_buscadorKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila=jTable1.rowAtPoint(evt.getPoint());
        String _id=String.valueOf(jTable1.getValueAt(fila, 0));
        String nombre=String.valueOf(jTable1.getValueAt(fila, 1));
        String apellidos =String.valueOf(jTable1.getValueAt(fila, 2));
        int control= MensaEmergentes.modificarEliminar(3,"Que desea hacer con \n "+nombre+" "+apellidos,"Informacion");
        if (control==0){
            try {
                FRM_informacion p1= new FRM_informacion(_id);
                p1.setVisible(true);
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
            MensaEmergentes.alerta(1, "Operacion cancelada", "Informacion");      
        }
    }//GEN-LAST:event_jTable1MouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL_buscar;
    private javax.swing.JLabel LBL_fecha;
    private javax.swing.JTextField TXT_buscador;
    private javax.swing.JPanel bg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
