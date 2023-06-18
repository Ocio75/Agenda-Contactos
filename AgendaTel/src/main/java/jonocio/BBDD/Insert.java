
package jonocio.BBDD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import jonocio.Utiles.MensaEmergentes;


public class Insert extends Conexion {
    /*
    public boolean insertContacto(String Consulta) throws SQLException {
        Conectar();
        try {
            PreparedStatement stmt = con.prepareStatement(Consulta);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            MensaEmergentes.alerta(2, "Error al cargar datos" + ex, "Error");
            return false;
        } finally {
            Cerrar();
        }
    }*/
}
