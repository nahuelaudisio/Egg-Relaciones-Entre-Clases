/**
 * 3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número
entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
clase debe contener un método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
y luego se llama al método, este no mostrara esa primera carta.
 */
package ree03.Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import ree03.Entidades.Baraja;
import ree03.Entidades.Carta;
import ree03.Enums.Palo;

public class BarajaServicio {
        private Baraja mazoInicial = new Baraja();
    private Baraja cartasEntregadas = new Baraja();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Collections c;
    
        public Baraja crearBaraja() {
        System.out.println("Se procede a abrir una baraja");

        ArrayList<Carta> cs = new ArrayList();
        ArrayList<Carta> out = new ArrayList();
        cartasEntregadas.setCartas(out);

        for (Palo aux : Palo.values()) {
            String p = aux.getNombre();
            for (int i = 0; i < 12; i++) {
                if (i + 1 == 8 || i + 1 == 9) {
                    //NADA
                } else {
                    Carta c = new Carta(i + 1, aux);
                    cs.add(c);
                }
            }
        }
        mazoInicial.setCartas(cs);
        System.out.println("Baraja iniciada");

        return mazoInicial;
    }
    
            public void barajar() {
        c.shuffle(mazoInicial.getCartas());
    }

    public Carta siguienteCarta() {
        Carta c = mazoInicial.getCartas().get(0);
        System.out.println("La siguiente carta es el " + mazoInicial.getCartas().get(0).toString());
        return c;
    }

    public void cartasDisponibles() {
        System.out.println("Cartas disponibles: " + mazoInicial.getCartas().size());
    }

    public void darCartas() {
        System.out.println("Seleccione la cantidad de cartas a recibir: ");
        int cant = leer.nextInt();

        if (cant <= mazoInicial.getCartas().size()) {
            for (int i = 0; i < cant; i++) {
                System.out.println("se entrega el " + mazoInicial.getCartas().get(i).toString() + " al jugador");
            }
            for (int i = 0; i < cant; i++) {
                cartasEntregadas.getCartas().add(mazoInicial.getCartas().get(0));
                mazoInicial.getCartas().remove(0);
            }
        } else {
            System.out.println("Cartas insuficientes. No se entregó ninguna carta al jugador");
            cartasDisponibles();
        }
    }

    public void cartasMonton() {
        if (cartasEntregadas.getCartas().size() == 0) {
            System.out.println("Aún no se han retirado cartas del mazo");
        } else {
            System.out.println("Cartas retiradas (del montón): ");
            String parrafo = "";
            int ctrol = 0;
            for (Object aux : cartasEntregadas.getCartas()) {
                parrafo = parrafo.concat(aux.toString());
                parrafo = parrafo.concat(". ");
                ctrol++;
                if (ctrol == 10) {
                    System.out.println(parrafo);
                    parrafo = "";
                    ctrol = 0;
                }
            }
        }
    }

    public void mostrarBaraja() {
        if (mazoInicial.getCartas().size() == 0) {
            System.out.println("No quedan cartas en el mazo");
        } else {
            System.out.println("Cartas del mazo: ");
            String parrafo = "";
            int ctrol = 0;
            for (Object aux : mazoInicial.getCartas()) {
                parrafo = parrafo.concat(aux.toString());
                parrafo = parrafo.concat(". ");
                ctrol++;
        
                if (ctrol == 10) {
                    System.out.println(parrafo);
                    parrafo = "";
                    ctrol = 0;
                }
            }
        }
    }

    public void menu() {
        System.out.println("");
        System.out.println("----- MENU -----");
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Barajar el mazo");
        System.out.println("2. Ver siguiente carta");
        System.out.println("3. Pedir cartas");
        System.out.println("4. Ver cartas ya usadas");
        System.out.println("5. Ver cartas aún en el mazo");
        System.out.println("6. Salir del programa");
        System.out.println("");
        String opc = leer.next();
        switch (opc) {
            case "1":
                barajar();
                System.out.println("Mazo barajado");
                menu();
                break;
            case "2":
                siguienteCarta();
                menu();
                break;
            case "3":
                darCartas();
                menu();
                break;
            case "4":
                cartasMonton();
                menu();
                break;
            case "5":
                mostrarBaraja();
                menu();
                break;
            case "6":
                System.out.println("Ejecución finalizada");
                break;
            default:
                System.out.println("Opcion no válida");
                ;
                menu();
        }

    }
    
}
