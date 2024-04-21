//BY DANIEL DAVID PEÑA ORTEGA
package tallersistemaalojamiento;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    InterfazGestionRegistro registro = new RegistroAlojamientoImMaps();
    public Scanner entrada= new Scanner(System.in);

    public Menu() {
    }
    
    public int selec(){
        
        int num;
        
        do{
            System.out.println("\t\t\tBIEN VENIDO APRECIADO CLIENTE DEL HOTEL XXXX");
            System.out.println("\t\t\t\t MENU");
            System.out.println("OPCION 1.) Agregar nuevo alojamiento");
            System.out.println("OPCION 2.) Cotizar alojamiento");
            System.out.println("OPCION 3.) Eliminar alojamiento");
            System.out.println("OPCION 4.) Lista de alojamientos");
            System.out.println("OPCION 5.) Salir");
            num=entrada.nextInt();
            
        }while((num<1)||(num>5)); 
        
        return num;
    }
    
    public void Agregar(){
        int num, codigo, Nmax;
        String direc, ciudad, pais;
        
        do{
            
            System.out.println(" Que desea agregar: ");
            System.out.println(" 1.) habitacion");
            System.out.println(" 2.) cabaña"); 
            num= entrada.nextInt();
        }while((num<1)||(num>2));

        System.out.println("Codigo: ");
        codigo=entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Direccion: ");
        direc =entrada.nextLine();
        
        System.out.println("Pais: ");
        pais=entrada.nextLine();
        
        System.out.println("Ciudad: ");
        ciudad=entrada.nextLine();
        

      
        if(num==1){
            
            System.out.println("Cantidad de Personas: ");
            Nmax=entrada.nextInt();
            
             Alojamiento hab = new Habitacion(Nmax, codigo,  direc, pais, ciudad); 
             registro.agregarAlojamiento(hab);
            
        }
        if(num==2){
            
            System.out.println("Cantidad de cuartos: ");
            Nmax=entrada.nextInt();
            
            Alojamiento cab = new Cabaña(Nmax, codigo, direc, pais, ciudad); 
            registro.agregarAlojamiento(cab);
            
        } 
    }
    
    public void cotizar(){
        
        System.out.println("\nCotizar alojamiento:");
        System.out.print("Ingrese el código del alojamiento a cotizar: ");
        int codigo = entrada.nextInt();
        entrada.nextLine();

        Alojamiento alojamiento = registro.buscar(codigo);
        if (alojamiento != null) {
        System.out.print("Ingrese la fecha de inicio (YYYY-MM-DD): ");
        String fechaInicioStr = entrada.nextLine();
        LocalDate fechaInicio = LocalDate.parse(fechaInicioStr);

        System.out.print("Ingrese la fecha de fin (YYYY-MM-DD): ");
        String fechaFinStr = entrada.nextLine();
        LocalDate fechaFin = LocalDate.parse(fechaFinStr);

        Cotizacion cotizacion = new Cotizacion(fechaInicio, fechaFin, alojamiento);
        System.out.println(cotizacion);
    } else {
        System.out.println("El alojamiento no está registrado.");
    } 
        
    }
    
    public void eliminar(){
        
        int codigo;

        System.out.println("Favor ingresar el codigo del alojamiento: ");
        codigo = entrada.nextInt();

        Alojamiento delete = registro.buscar(codigo);

        if (delete != null) {
        registro.eliminar(delete);
        System.out.println("Registro eliminado");
        } else {
            System.out.println("El registro no se encontró");
        }

    }
    
 public void lista() {
     
    System.out.println("-----------------------------------------------");
    System.out.println("Alojamientos registrados: \n");
    
    
    ArrayList<Alojamiento> alojamientos = registro.obtenerAlojamientos();
    
     System.out.println("----------------------------------------------");
    if (alojamientos.isEmpty()) {
        System.out.println("No hay alojamientos registrados.");
    } else {
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento);
        }
    }
}
    
    
}
