
package jonocio.BBDD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import jonocio.Utiles.MensaEmergentes;


public class Update extends Conexion {
    Select select= new Select();

   public boolean actualizarContacto(String[] datos) {
    Conectar();
    boolean actualizado = false;
    try {
        PreparedStatement statement = con.prepareStatement("UPDATE contactos SET nombre = ?, apellidos = ?, telefono = ?, correo = ?, direccion = ?, genero = ?, fecha_nacimiento = ?, notas = ?, idTipocon = ? WHERE id = ?");
        int idtipo = select.BuscarIdtipo(datos[8]);
        statement.setString(1, datos[0]);
        statement.setString(2, datos[1]);
        statement.setString(3, datos[2]);
        statement.setString(4, datos[3]);
        statement.setString(5, datos[4]);
        statement.setString(6, datos[5]);
        statement.setString(7, datos[6]);
        statement.setString(8, datos[7]);
        statement.setInt(9, idtipo);
        statement.setString(10, datos[9]);
        
        for (String dato : datos) {
            System.out.println(dato);
        }

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
