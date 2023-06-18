
package jonocio.BBDD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import jonocio.Utiles.MensaEmergentes;


public class Update extends Conexion {
    Select select= new Select();

    public boolean actualizarContacto(String[] info) {
        Conectar();
        boolean actualizado = false;
        try {
            PreparedStatement statement = con.prepareStatement("UPDATE contactos SET nombre = ?, apellidos = ?, telefono = ?, correo = ?, direccion = ?, genero = ?, fecha_nacimiento = ?, notas = ?, idTipocon = ? WHERE id = ?");
            int idtipo=  select.BuscarIdtipo(info[9]);
            statement.setString(1, info[1]);
            statement.setString(2, info[2]);
            statement.setString(3, info[3]);
            statement.setString(4, info[4]);
            statement.setString(5, info[5]);
            statement.setString(6, info[6]);
            statement.setString(7, info[7]);
            statement.setString(8, info[8]);
            statement.setString(9,idtipo+"");
            statement.setString(10, info[0]);

            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                actualizado = true;
            } else {
                actualizado = false;
            }

            statement.close();
            Cerrar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actualizado;
    }

}
