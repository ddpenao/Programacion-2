//BY DANIEL DAVID PEÑA ORTEGA
package tallersistemaalojamiento;

import java.util.ArrayList;

public class RegistroAlojamientoImMaps implements InterfazGestionRegistro {
    private ArrayList<Alojamiento> listaAlojamientos = new ArrayList<>();

    @Override
    public boolean agregarAlojamiento(Alojamiento a) {
        // Verificar si el alojamiento ya está registrado
        if (buscar(a.getCodigo()) != null) {
            System.out.println("El alojamiento con el código " + a.getCodigo() + " ya está registrado.");
            return false;
        }
        
        // Agregar el alojamiento a la lista
        listaAlojamientos.add(a);
        System.out.println("Alojamiento registrado correctamente.");
        return true;
    }

    @Override
    public Alojamiento buscar(int codigo) {
        for (Alojamiento alojamiento : listaAlojamientos) {
            if (alojamiento.getCodigo() == codigo) {
                return alojamiento;
            }
        }
        return null;
    }

    @Override
    public boolean eliminar(Alojamiento a) {
        return listaAlojamientos.remove(a);
    }

    @Override
    public ArrayList<Alojamiento> obtenerAlojamientos() {
        return listaAlojamientos;
    }
}