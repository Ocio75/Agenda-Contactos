
package jonocio.BBDD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import jonocio.Utiles.MensaEmergentes;

// Delete delete= new Delete();
public class Delete extends Conexion {
   
    public boolean EliminarContacto(String id) throws SQLException {
        Conectar();
        String query="Delete from contactos where id ="+id;
        System.out.println(query);
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.execute();
            Cerrar();
            return true;
        } catch (SQLException e) {
            Cerrar();
            return false;
        }
    }
    public boolean EliminarEtiqueta(String id) throws SQLException {
        Conectar();
        String query = "Delete from tipocontacto where id =" + id;
        System.out.println(query);
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.execute();
            Cerrar();
            return true;
        } catch (SQLException e) {
            Cerrar();
            return false;
        }
    }
}
