/*
2. Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
carga de agua, se dispara y se moja. Las clases a hacer del juego son las siguientes:
 */
package ree02;

import java.util.ArrayList;
import java.util.Scanner;
import ree02.Entidades.Juego;
import ree02.Entidades.Jugador;
import ree02.Entidades.RevolverDeAgua;

/**
 *
 * @author nahue
 */
public class REE02 {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList();

        System.out.println("Se va a iniciar el juego. Seleccione la cantidad de jugadores:");
        int cantidadJugadores = leer.nextInt();
        if (cantidadJugadores < 1 || cantidadJugadores > 6) {
            cantidadJugadores = 6;
        }
        for (int i = 0; i < cantidadJugadores; i++) {
            Jugador a = new Jugador(i + 1);
            jugadores.add(a);
        }

        System.out.println("Se va a preparar el revolver para el juego");
        RevolverDeAgua r = new RevolverDeAgua();
        r.llenarRevolver();

        System.out.println("Revolver cargado. Se da inicio al juego");
        Juego j = new Juego();
        j.llenarJuego(jugadores, r);

        
        
        boolean juegoSigue = true;
        int turno = 0;
        
        
        
            while (juegoSigue) {
            if (turno == (cantidadJugadores)){
                turno = 0;
            }
            System.out.println("El " + j.getJugadores().get(turno).getNombre() + " procede a disparar");
            juegoSigue = j.ronda(turno);
            if (juegoSigue) {
                System.out.println("El " + j.getJugadores().get(turno).getNombre() + " se salva");
            } else {
                System.out.println("El " + j.getJugadores().get(turno).getNombre() + " ha sido mojado");
                System.out.println("Juego finalizado");
            }
            turno++;
        }
        System.out.println("");
    }
    }


