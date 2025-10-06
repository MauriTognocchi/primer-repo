import clases.*;
import excepciones.AlmacenamientoExcepcion;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Almacenamiento<Object> inventario = new Almacenamiento<>();

        Enemigo enemigo = new Enemigo("mauri");
        Jugador jugador = new Jugador("jijoje");
        Libro libro = new Libro("hola");

        inventario.agregarElemento(enemigo);
        inventario.agregarElemento(jugador);
        inventario.agregarElemento(libro);

        boolean eliminar = inventario.eliminarElemento(enemigo);
        if (eliminar) {
            System.out.println("Eliminado.");
        } else {
            System.out.println("ERROR. No encontrado");
        }

        System.out.println(inventario.buscarElemento(enemigo));

        List<Object> elementos = inventario.getContenido();

        elementos.forEach(System.out::println);

        inventario.mostrarAlmacenamiento();

        pausa(scan);

        Pila<Object> pila = new Pila<>();

        try {
            boolean b = pila.pilavacia();
            if (b) {
                System.out.println("Pila vacia.");
            } else {
                System.out.println("Pila no vacia.");
            }
        } catch (AlmacenamientoExcepcion e) {
            System.out.println(e.getMessage());
        }

        pila.push(enemigo);
        pila.push(enemigo);
        pila.push(jugador);
        pila.push(jugador);
        pila.push(jugador);
        pila.push(libro);

        int cant = pila.size();
        System.out.println("Cantidad de elementos : " + cant);

        try {
            System.out.println(pila.pop());
            System.out.println(pila.pop());
            System.out.println(pila.pop());
            System.out.println(pila.pop());
            System.out.println(pila.pop());
            System.out.println(pila.pop());
            System.out.println(pila.pop());
        } catch (AlmacenamientoExcepcion e) {
            System.out.println(e.getMessage());
        }

        try {
            boolean b = pila.pilavacia();
            if (b) {
                System.out.println("Pila vacia");
            } else {
                System.out.println("Pila no vacia.");
            }
        } catch (AlmacenamientoExcepcion e) {
            System.out.println(e.getMessage());
        }


    }

    public static void pausa(Scanner scan) {
        System.out.print("PRESIONE ENTER PARA CONTINUAR");
        scan.nextLine();
    }
}
