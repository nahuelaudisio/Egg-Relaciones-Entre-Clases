/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ree1.Servicios;

import java.util.Scanner;
import ree1.Entidades.Perro;
import ree1.Entidades.Persona;

/**
 *
 * @author nahue
 */
public class ServicioPerPerro {
      private Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
          public Persona crearPersona() {
        Persona a = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        a.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        a.setApellido(leer.next());
              System.out.println("Ingrese edad de la persona");
              a.setEdad(leer.nextInt());
              
              System.out.println("Ingrese el DNI de la persona");
              a.setDni(leer.nextInt());
                      
        // de la misma forma se ingresan los demas datos
        return a;

    }
          
          
          
    public Perro crearPerro() {
        Perro b = new Perro();
        System.out.println("Ingrese el nombre del perro");
        b.setNombre(leer.next());
        System.out.println("Ingrese raza");
        b.setRaza(leer.next());
        // de la misma forma se ingresan los demas datos
        
        System.out.println("Ingrese la edad del perro");
        b.setEdad(leer.nextInt());
        
        return b;

    }
}
