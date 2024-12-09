
package peluqueriacanina.persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    
    // Método para agregar un usuario
    public void agregarUsuario(String nombre, String correo) {
        String sql = "INSERT INTO usuarios (nombre, correo) VALUES (?, ?)";
    
        try (Connection conn = DatabaseConnection.getConnection();  // Usamos la clase DatabaseConnection para obtener la conexión
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            // Asignamos los valores a los parámetros de la consulta
            stmt.setString(1, nombre);
            stmt.setString(2, correo);
            
            // Ejecutamos la consulta
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
        
        
