//BY DANIEL DAVID PEÑA ORTEGA
package tallersistemaalojamiento;

import java.time.LocalDate;
import java.time.Month;



public class Ppal {

   public static void main(String[] args) {
    Menu menu = new Menu();
    
    boolean codicion = true;
    while (codicion) {
        int opcion = menu.selec();
        switch (opcion) {
            case 1:
                menu.Agregar();
                break;
            case 2:
                menu.cotizar();
                break;
            case 3:
                
                menu.eliminar();
                break;
            case 4:
                
                menu.lista();
                break;
            case 5:
                
                codicion = false;
                System.out.println("Gracias por usar el software");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                break;
        }
    }
}
}

 

