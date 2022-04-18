/**
 *  Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
 * trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
 * carga de agua, se dispara y se moja. Las clases a hacer del juego son las siguientes:
 */
/**
 * Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
 * jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
 * (indica si está mojado o no el jugador). El número de jugadores será decidido por el
 * usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
 * Métodos:
 * 8
 * • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
 * mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
 * revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
 * devuelve true, sino false
 */
package ree02.Entidades;

/**
 *
 * @author nahue
 */
public class Jugador {

    private Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id) {
       
        this.id = id;
        String ids = id.toString();
        ids = "Jugador ".concat(ids);
        this.nombre = ids;
        this.mojado = false;
    
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    //METODOS

    /**
     *  * • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
 * mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
 * revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
 * devuelve true, sino false
     * @param r
     * @return 
     */
    public boolean disparo(RevolverDeAgua r){
        boolean vof=false;
        if (r.mojar()) {
            mojado = true;
            vof = true;
        }
        r.siguienteChorro();
        return vof;  //da valor de verdadero si el jugador se mojo
    }

    
}
