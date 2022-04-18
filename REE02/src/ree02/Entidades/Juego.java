package ree02.Entidades;


import java.util.ArrayList;
import java.util.List;
import ree02.Entidades.Jugador;
import ree02.Entidades.RevolverDeAgua;

/*
2. Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
carga de agua, se dispara y se moja. Las clases a hacer del juego son las siguientes:
 */

/**
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de 
Jugadores) y Revolver
Métodos: 
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
 */
/**
 *
 * @author nahue
 */
public class Juego {
     
    private RevolverDeAgua r;
    private List<Jugador> jugadores;

    public Juego() {
    }

    public Juego(RevolverDeAgua r, List<Jugador> jugadores) {
        this.r = r;
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getR() {
        return r;
    }

    public void setR(RevolverDeAgua r) {
        this.r = r;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
        // METODOS
    
    public void llenarJuego(ArrayList<Jugador>js2,RevolverDeAgua r2){
        jugadores=js2;
        r=r2;
    }
    
    public boolean ronda(int i){
        boolean juegoSigue = true;
        jugadores.get(i).disparo(r);
        if (jugadores.get(i).isMojado()) {
            juegoSigue=false;
        }
        return juegoSigue;
    }

    @Override
    public String toString() {
        return "Juego{" + "r=" + r + ", jugadores=" + jugadores + '}';
    }
    
    
}
