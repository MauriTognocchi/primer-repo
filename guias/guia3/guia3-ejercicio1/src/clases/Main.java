package clases;

import interfaces.Transporte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Transporte autobus1 = new Autobus(552, 40);
        Transporte tranvia1 = new Tranvia("MDP", 200);
        Transporte bici1 = new Bicicleta("1331");

        List<Transporte> transportes = new ArrayList<>();

        transportes.add(autobus1);
        transportes.add(tranvia1);
        transportes.add(bici1);

        for (Transporte t1 : transportes){
            System.out.print("=================================================");
            pausa(scan);
            System.out.println("====================="+t1.getClass().getSimpleName()+"=====================");
            System.out.println(t1);
            System.out.println("-------------------------------------------------");
            t1.arrancar();
            t1.detener();
            System.out.println("Capacidad = "+t1.obtenerCapacidad());

            switch (t1) {
                case Autobus a -> a.anunciarParada("Plaza central");
                case Tranvia t -> t.cambiarVia(13);
                case Bicicleta b -> b.ajustarAsiento(10);
                default -> {
                }
            }
        }
    }

    public static void pausa(Scanner s1){
        System.out.print("\nPress Enter To Continue :");
        s1.nextLine();
    }
}
