/**
 * 1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
 * dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
 * Persona con atributos: nombre, apellido, edad, documento y Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
 * que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
 * mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package ree1.Entidades;

import java.util.List;

/**
 *
 * @author nahue
 */
public class Persona {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;

    private Perro perro;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", perro=" + perro + '}';
    }
    
    
}
