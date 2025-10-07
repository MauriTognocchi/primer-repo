import clases.*;
import enums.TipoArma;
import enums.TipoMotor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aeropuerto aeropuerto = new Aeropuerto();
        aeropuerto.setNombre("Astor Piazzola");
        aeropuerto.setDireccion("Mar del Plata");
        aeropuerto.setCapacidad(5);

        Comercial com1 = new Comercial("Boeing 737", "Boeing", 5000, TipoMotor.JET, 180, 5, List.of("Comida", "Wifi"));
        Comercial com2 = new Comercial("Airbus A320", "Airbus", 4500, TipoMotor.JET, 150, 4, List.of("Comida"));
        Comercial com3 = new Comercial("Embraer E195", "Embraer", 3000, TipoMotor.TURBINA, 120, 3, List.of("Wifi"));

        Privado priv1 = new Privado("Cessna 172", "Cessna", 200, TipoMotor.HELICE, 4, true, "clave123");
        Privado priv2 = new Privado("Gulfstream G650", "Gulfstream", 800, TipoMotor.TURBINA, 12, false, "vip456");
        Privado priv3 = new Privado("Dassault Falcon 7X", "Dassault", 900, TipoMotor.TURBINA, 14, true, "jet789");

        DeCarga<String> carga1 = new DeCarga<>("Antonov An-124", "Antonov", 20000, TipoMotor.TURBINA, 10000, List.of("Electrónica", "Alimentos"));
        DeCarga<String> carga2 = new DeCarga<>("Boeing 747F", "Boeing", 18000, TipoMotor.TURBINA, 12000, List.of("Ropa", "Maquinaria"));
        DeCarga<String> carga3 = new DeCarga<>("Lockheed C-130", "Lockheed", 10000, TipoMotor.TURBINA, 8000, List.of("Medicamentos", "Vehículos"));

        Militar mil1 = new Militar("F-16", "General Dynamics", 1500, TipoMotor.JET, 1, TipoArma.AIRE_AIRE, 500);
        Militar mil2 = new Militar("F-35", "Lockheed Martin", 2000, TipoMotor.JET, 1, TipoArma.AIRE_TIERRA, 600);
        Militar mil3 = new Militar("Eurofighter Typhoon", "Airbus", 1800, TipoMotor.JET, 1, TipoArma.AIRE_AIRE, 550);

        int opcion;
        int menu;

        do {
            pausa(scan);
            System.out.println("""
                    |------------------------------------|
                    |1- Agregar avion.                   |
                    |2- Despegar aviones de un Hangar    |
                    |                                    |
                    |0- Cerrar programa.                 |
                    |------------------------------------|
                    """);
            System.out.print("OPCION : ");
            menu = scan.nextInt();
            scan.nextLine();

            switch (menu) {
                case 0: {
                    System.out.println("CERRANDO PROGRAMA...");
                    break;
                }
                case 1: {
                    if (aeropuerto.agregarAvion(com1) && aeropuerto.agregarAvion(com2) && aeropuerto.agregarAvion(com3)) {
                        System.out.println(com1);
                        System.out.println("Agregado correctamente");

                        System.out.println(com2);
                        System.out.println("Agregado correctamente");

                        System.out.println(com3);
                        System.out.println("Agregado correctamente");
                    }

                    if (aeropuerto.agregarAvion(priv1) && aeropuerto.agregarAvion(priv2) && aeropuerto.agregarAvion(priv3)) {
                        System.out.println(priv1);
                        System.out.println("Agregado correctamente");

                        System.out.println(priv2);
                        System.out.println("Agregado correctamente");

                        System.out.println(priv3);
                        System.out.println("Agregado correctamente");
                    }

                    if (aeropuerto.agregarAvion(carga1) && aeropuerto.agregarAvion(carga2) && aeropuerto.agregarAvion(carga3)) {
                        System.out.println(carga1);
                        System.out.println("Agregado correctamente");

                        System.out.println(carga2);
                        System.out.println("Agregado correctamente");

                        System.out.println(carga3);
                        System.out.println("Agregado correctamente");
                    }

                    if (aeropuerto.agregarAvion(mil1) && aeropuerto.agregarAvion(mil2) && aeropuerto.agregarAvion(mil3)) {
                        System.out.println(mil1);
                        System.out.println("Agregado correctamente");

                        System.out.println(mil2);
                        System.out.println("Agregado correctamente");

                        System.out.println(mil3);
                        System.out.println("Agregado correctamente");
                    }
                    break;
                }
                case 2: {
                    pausa(scan);
                    System.out.println("Ingrese la opcion para despegar aviones de un Hangar.");
                    System.out.println("""
                            |----------------------|
                            |1- Comercial.         |
                            |2- DeCarga.           |
                            |3- Militar.           |
                            |4- Privado            |
                            |                      |
                            |0- Volver al menu     |
                            |----------------------|
                            """);
                    System.out.print("OPCION : ");
                    opcion = scan.nextInt();
                    scan.nextLine();

                    List<? extends Avion> temp; /// Solo de lectura, no puedo agregar ni eliminar nada.

                    /// List<Avion> temp = new ArrayList<>(); Puedo modificar la lista, sin tocar la original

                    switch (opcion) {
                        case 0: {
                            System.out.println("Volviendo al menu...");
                            break;
                        }
                        case 1: {
                            temp = aeropuerto.getHangarComercial(); /// Usar get solo con lista de lectura, sino puedo cagar la original
                            /// case 1 -> temp.addAll(aeropuerto.getHangarComercial()); Y asi copio todo.

                            aeropuerto.despegarHangar(temp);

                            break;
                        }

                        case 2: {
                            temp = aeropuerto.getHangarDeCarga();

                            aeropuerto.despegarHangar(temp);

                            break;
                        }
                        case 3: {
                            temp = aeropuerto.getHangarMilitar();

                            aeropuerto.despegarHangar(temp);

                            break;
                        }
                        case 4: {
                            temp = aeropuerto.getHangarPrivado();

                            aeropuerto.despegarHangar(temp);

                            break;
                        }
                        default: {
                            System.out.println("ERROR: OPCION INVALIDA");
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("ERROR: OPCION INVALIDA");
                }
            }
        } while (menu != 0);

        List<Avion> temporal = new ArrayList<>();
        temporal.addAll(aeropuerto.getHangarComercial());
        temporal.addAll(aeropuerto.getHangarDeCarga());
        temporal.addAll(aeropuerto.getHangarMilitar());
        temporal.addAll(aeropuerto.getHangarPrivado());

        for (Avion avion : temporal) {
            if (avion instanceof Comercial c) {
                c.darMantas();
                c.servirComida("Pollo");
            } else if (avion instanceof DeCarga<?> t) {
                if (t.ingresar()) {
                    System.out.println("Se ingreso correctamente al avion " + t.getModelo());
                } else {
                    System.out.println("No se pudo ingresar a " + t.getModelo());
                }
            } else if (avion instanceof Militar m) {
                if (m.ingresar()) {
                    System.out.println("Se ingreso correctamente al avion " + m.getModelo());
                } else {
                    System.out.println("No se pudo ingresar a " + m.getModelo());
                }
            } else if (avion instanceof Privado p) {
                p.darMantas();
                p.servirComida("Polla");
                if (p.verMundial()) {
                    System.out.println("Viendo el mundial en el avion " + p.getModelo());
                }
            }
        }

    }

    public static void pausa(Scanner scan) {
        System.out.print("PRESIONE ENTER PARA CONTINUAR");
        scan.nextLine();
    }
}
