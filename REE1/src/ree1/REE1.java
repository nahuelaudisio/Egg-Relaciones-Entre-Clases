/**
 * 1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package ree1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ree1.Entidades.Perro;
import ree1.Entidades.Persona;
import ree1.Servicios.ServicioPerPerro;

/**
 *
 * @author nahue
 */
public class REE1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");   
        ServicioPerPerro spp = new ServicioPerPerro();
    List<Persona> personas = new ArrayList();
    List<Perro> perrosAdoptables = new ArrayList();
    
    //El ejercicio pide que se ingresen dos personas y dos perros 
        System.out.println("Ahora se le pedira la informacion de las personas");
        
        for (int i = 0; i < 2;i++) {
            System.out.println("Ingrese los datos de la "+(i+1)+" ° Persona");
            personas.add(spp.crearPersona());
            
        }
        System.out.println("-------------------------------");
        
        System.out.println("Ahora se le pedira la informacion de los perros");
        for (int i = 0; i < 2; i++) {
             System.out.println("Ingrese los datos del "+(i+1)+" ° PERRO");
             perrosAdoptables.add(spp.crearPerro());
        }
        
        System.out.println("///////////////////////");
        
                for (Persona aux : personas) {
            System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido() + " \nseleccione el nombre de uno de los siguientes perros en adopción: ");
            for (Perro aux2 : perrosAdoptables) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
                    System.out.println("Ingrese el nombre del perro a adoptar:");
                     String adoptable = leer.next();
                 
                  int ctrol = 0;
                  for (int i = 0;i<perrosAdoptables.size(); i++) {
                      if (adoptable.equalsIgnoreCase(perrosAdoptables.get(i).getNombre())) {
                          aux.setPerro(perrosAdoptables.get(i));
                          
                          ctrol +=1;
                          perrosAdoptables.remove(i);

                      }
        }
                    if (ctrol == 0) {
                System.out.println("No se ha adoptado un perro válido");
            }
    }
                
            System.out.println("");
        System.out.println("Las siguientes personas han adoptado: ");
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " a adoptado a " + aux.getPerro().getNombre() + " de raza " + aux.getPerro().getRaza());
            }

        }      

    
}
}