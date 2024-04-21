//BY DANIEL DAVID PEÑA ORTEGA
package tallersistemaalojamiento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jairo F
 */
public class RegistroAlojamientoImArrayList implements InterfazGestionRegistro {
    
    private ArrayList<Alojamiento> listAlojamiento;
    //private Map<String, Alojamiento>listAlojamiento = new HashMap();

    public RegistroAlojamientoImArrayList() {
        this.listAlojamiento = new ArrayList();
    }

    public ArrayList<Alojamiento> getListAlojamiento() {
        return listAlojamiento;
    }

    public void setListAlojamiento(ArrayList<Alojamiento> listAlojamiento) {
        this.listAlojamiento = listAlojamiento;
    }
    
    @Override
    public boolean agregarAlojamiento(Alojamiento a){
        return this.listAlojamiento.add(a);
    }
    
    @Override
    public Alojamiento buscar(int codigo){
        for(Alojamiento a: this.listAlojamiento){
            if(a.getCodigo()==codigo){
                return a;
            }
        }
        return null;
        
//        return this.listAlojamiento.stream()
//                .filter((o) -> o.getCodigo()==codigo)
//                .findFirst()
//                .orElse(null);
    }
    
    @Override
    public boolean eliminar(Alojamiento a){
        return this.listAlojamiento.remove(a);
    }
    
    @Override
    public ArrayList<Alojamiento> obtenerAlojamientos(){
        return this.listAlojamiento;
    }  
    
}