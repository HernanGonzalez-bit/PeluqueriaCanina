
package peluqueriacanina.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/peluqueria_canina";
    private static final String USER = "root";  // El nombre de usuario de MySQL
    private static final String PASSWORD = "";  // Contraseña de MySQL, vacia,no lleva.
    
    // Método que devuelve la conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
             // Obtener la conexión
             return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
             throw new SQLException("No se pudo cargar el driver JDBC", e);
            
        }
    }
}
