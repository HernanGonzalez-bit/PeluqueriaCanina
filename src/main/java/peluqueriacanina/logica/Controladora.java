
package peluqueriacanina.logica;

import java.util.List;
import peluqueriacanina.persistencia.ControladoraPersistencia;


public class Controladora {
    
   
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    //conexion entre la controladora de persistencia y la logica

    
    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
     
        
        //Creamos el dueño y asignamos sus valores.
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //Creamos la mascota yasignamos sus valores.
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
       controlPersis.guardar(duenio,masco);
        
    }

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
    }

    public void borrasMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
         return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAtencion_especial(atenEsp);
        masco.setAlergico(alergico);
        
        controlPersis.modificarMascota(masco);
        
        //Metodo aparte para buscar dueño.no tiene que estar atado solo a "buscar mascota".
        //Seteo nuevos valores del dueño. 
        Duenio dueno = this.buscarDuenio (masco.getUnDuenio().getId_duenio());
        dueno.setCelDuenio(celDuenio);
        dueno.setNombre(nombreDuenio);
        
        //Llamar al modificar dueño
        this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id_duenio) {
       return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
      controlPersis.modifcarDuenio(dueno);
    }
    
}
