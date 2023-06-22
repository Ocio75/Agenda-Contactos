package jonocio.BBDD;

import java.sql.*;
public class Conexion {
    
   private final String ip = "127.0.0.1";
	private final int port = 3306;
	private final String BBDD = "BD_Agendatelefonica";
	private final String user = "ConexionAgenda";
	private final String passwd = "";
	private final String cadena = "jdbc:mysql://" + ip + ":" + port + "/" + BBDD;
	private final String driver = "com.mysql.jdbc.Driver";
	protected Connection con;
    
    protected void Conectar(){
        try {
		Class.forName(driver);
		System.out.println("paso instrucción");
		con = DriverManager.getConnection(cadena, user, passwd);
			if (con != null) {
				System.out.println("Conexion a BD " + ip + " con exito");
			} else {
				System.out.println("Imposible conexión con " + ip);
				 // fin de programa
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("Excepción de clase no encontrada " + ex);
		} catch (SQLException ex) {
			System.out.println("Excepción de SQL " + ex);
		}
    }
    
    protected void Cerrar() throws SQLException{
        if (con != null) {
            if (!con.isClosed()) {
                con.close();
            }
        }
    }
    
   
}
