package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexionSQL {

    Connection conectar = null;

    public Connection conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/crud_escuela", "root", "");

            System.out.println("Conectado a la base de datos correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR de conexion" + "\n" + e);
        }
        return conectar;
    }
}
