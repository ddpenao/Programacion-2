//BY DANIEL DAVID PEÑA ORTEGA
package tallersistemaalojamiento;
import java.util.ArrayList;

public interface InterfazGestionRegistro {
    
      boolean agregarAlojamiento(Alojamiento a);
    
      Alojamiento buscar(int codigo);
     
      boolean eliminar(Alojamiento a);
     
      ArrayList<Alojamiento> obtenerAlojamientos();
    
}
