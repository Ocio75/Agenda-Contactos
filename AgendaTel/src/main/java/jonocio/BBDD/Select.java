
package jonocio.BBDD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import jonocio.Utiles.MensaEmergentes;

// Select select= new Select();
public class Select extends Conexion {
    String[] columnas = {"ID", "Nombre", "Apellidos", "Teléfono", "Correo", "Dirección", "Género", "Fecha de Nacimiento", "Notas", "Tipo de Contacto"};

    public void llenarTabla(JTable tabla,String aBuscar) {
         Conectar();
         String query ="SELECT c.id, c.nombre, c.apellidos, c.telefono, c.correo, c.direccion, c.genero, c.fecha_nacimiento, c.notas, t.nombre AS nombre_tipo FROM contactos c, tipocontacto t WHERE c.idTipocon = t.id ORDER BY c.id";
         if(aBuscar!=""){query="SELECT c.id, c.nombre, c.apellidos, c.telefono, c.correo, c.direccion, c.genero, c.fecha_nacimiento, c.notas, t.nombre AS nombre_tipo FROM contactos c, tipocontacto t WHERE c.idTipocon = t.id AND (c.nombre LIKE '%" + aBuscar + "%' OR c.telefono LIKE '%" + aBuscar + "%') ORDER BY c.id";}
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
            modelo.setRowCount(0);
            while (resultSet.next()) {
                Object[] fila = new Object[10];
                fila[0] = resultSet.getInt("id");
                fila[1] = resultSet.getString("nombre");
                fila[2] = resultSet.getString("apellidos");
                fila[3] = resultSet.getString("telefono");
                fila[4] = resultSet.getString("correo");
                fila[5] = resultSet.getString("direccion");
                fila[6] = resultSet.getString("genero");
                fila[7] = resultSet.getString("fecha_nacimiento");
                fila[8] = resultSet.getString("notas");
                fila[9] = resultSet.getString("nombre_tipo");

                modelo.addRow(fila);
            }
            tabla.setModel(modelo);

            statement.close();
            resultSet.close();
            Cerrar();
            establecerAnchoCeroPrimeraColumna(tabla);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     private void establecerAnchoCeroPrimeraColumna(JTable table) {
        TableColumnModel columnModel = table.getColumnModel();
        TableColumn column = columnModel.getColumn(0); // Primera columna
        column.setMinWidth(0);
        column.setMaxWidth(0);
        column.setPreferredWidth(0);
    }
    public int BuscarIdtipo(String tipo_dato) throws SQLException {
        Conectar();
        String query = "SELECT * FROM tipocontacto WHERE nombre LIKE ?";
        int codigo = 1;

        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, "%" + tipo_dato + "%");
            ResultSet resultado = stmt.executeQuery();

            if (resultado.next()) {
                codigo = resultado.getInt(1);
            }

            resultado.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Cerrar();
        return codigo;
    }

    public void llenarCombo(JComboBox c) throws SQLException {
        String sql = "Select * from tipocontacto";
        Statement st;
        Conectar();
        c.removeAllItems();
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                c.addItem(rs.getString(2));
            }

        } catch (SQLException ex) {
            MensaEmergentes.alerta(2, "Error al cargar datos" + ex, "Error");
        }
        Cerrar();
    }
    public String[] extraerInf(String id) {
        Conectar();
        String[] info = new String[10];
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT c.id, c.nombre, c.apellidos, c.telefono, c.correo, c.direccion, c.genero, c.fecha_nacimiento, c.notas, t.nombre AS nombre_tipo FROM contactos c, tipocontacto t WHERE c.idTipocon = t.id AND c.id = '" + id + "'");

            if (resultSet.next()) {
                info[0] = resultSet.getString("id");
                info[1] = resultSet.getString("nombre");
                info[2] = resultSet.getString("apellidos");
                info[3] = resultSet.getString("telefono");
                info[4] = resultSet.getString("correo");
                info[5] = resultSet.getString("direccion");
                info[6] = resultSet.getString("genero");
                info[7] = resultSet.getString("fecha_nacimiento");
                info[8] = resultSet.getString("notas");
                info[9] = resultSet.getString("nombre_tipo");
            }

            statement.close();
            resultSet.close();
            Cerrar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return info;
    }

}
