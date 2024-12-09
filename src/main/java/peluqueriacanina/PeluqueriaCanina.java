
package peluqueriacanina;

import peluqueriacanina.igu.Principal;
import peluqueriacanina.persistencia.UsuarioDAO;


public class PeluqueriaCanina {

    public static void main(String[] args) {
        /*Instanciamos la clase Principal*/
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
         UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.agregarUsuario("Juan Pérez", "juan.perez@email.com");
        
    }
}
