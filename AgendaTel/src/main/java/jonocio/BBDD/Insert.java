
package jonocio.BBDD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import jonocio.Utiles.MensaEmergentes;

//Insert insert =new Insert();
public class Insert extends Conexion {
    Select select= new Select();
    public boolean insertContacto(String[] datos) throws SQLException {
        Conectar();
        try {
            int idTipocon = select.BuscarIdtipo(datos[8]); // Obtener el valor de idTipocon
            String consulta = "INSERT INTO contactos (nombre, apellidos, telefono, correo, direccion, genero, fecha_nacimiento, notas, idTipocon) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setString(1, datos[0]); // nombre
            stmt.setString(2, datos[1]); // apellidos
            stmt.setString(3, datos[2]); // telefono
            stmt.setString(4, datos[3]); // correo
            stmt.setString(5, datos[4]); // direccion
            stmt.setString(6, datos[5]); // genero
            stmt.setString(7, datos[6]); // fecha_nacimiento
            stmt.setString(8, datos[7]); // notas
            stmt.setInt(9, idTipocon); // idTipocon
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            MensaEmergentes.alerta(2, "Error al cargar datos" + ex, "Error");
            return false;
        } finally {
            Cerrar();
        }
    }
    public boolean insertarEtiqueta(String _nom) throws SQLException {
        Conectar();
        try {
            String consulta = "INSERT INTO tipocontacto (nombre) VALUES (?)";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setString(1, _nom); // nombre
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            MensaEmergentes.alerta(2, "Error al cargar datos" + ex, "Error");
            return false;
        } finally {
            Cerrar();
        }
    }

}
