package classes;

import enums.TipoMarca;
import interfaces.I_Vehiculo;
import interfaces.I_VehiculoDeCarga;
import interfaces.I_VehiculoDePasajeros;
import managers.GestorVehiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GestorVehiculos vehiculos = new GestorVehiculos();
        int opcion;
        do {
            System.out.print("""
                    |========================================================|
                    | 0. Cerrar programa                                     |
                    | 1. Registrar vehiculo                                  |
                    | 2. Buscar vehiculo                                     |
                    | 3. Atualizar vehiculo                                  |
                    | 4. Eliminar vehiculo                                   |
                    | 5. Mostrar todos los vehiculos                         |
                    | 6. Mostrar todos las funciones de los vehiculos        |
                    |========================================================|
                    """);

            System.out.print("OPTION : ");
            opcion = Integer.parseInt(scan.nextLine());

            switch (opcion) {
                case 0: {
                    System.out.println("=== FINALIZING PROGRAM EXECUTION... ===");
                    break;
                }
                case 1: {
                    System.out.print("""
                            |========================================================|
                            | Que tipo de vehiculo desea registrar?                  |
                            | 1. Auto                                                |
                            | 2. Bicicleta                                           |
                            | 3. Camion                                              |
                            | 4. Autobus                                             |
                            |========================================================|
                            """);
                    System.out.print("OPTION : ");
                    int option = Integer.parseInt(scan.nextLine());

                    System.out.println("Marcas disponibles");

                    TipoMarca[] marcas = TipoMarca.values();
                    for (int i = 0; i < marcas.length; i++) {
                        System.out.println((i + 1) + ". " + marcas[i]);
                    }

                    System.out.print("Select the option : ");
                    int imarca = Integer.parseInt(scan.nextLine()) - 1;

                    String marca = (imarca >= 0 && imarca < marcas.length) ? marcas[imarca].toString() : "Marca desconocida";

                    System.out.print("Modelo : ");
                    String modelo = scan.nextLine();

                    System.out.print("Velocidad : ");
                    double vel = Double.parseDouble(scan.nextLine());

                    Vehiculo v = null;

                    switch (option) {
                        case 1: {
                            v = new Auto(marca, vel, modelo);
                            break;
                        }
                        case 2: {
                            v = new Bicicleta(marca, vel, modelo);
                            break;
                        }
                        case 3: {
                            v = new Camion(marca, vel, modelo);
                            break;
                        }
                        case 4: {
                            v = new Autobus(marca, vel, modelo);
                            break;
                        }
                        default: {
                            System.out.println("ERROR: INVALIDE OPTION ");
                            pausa(scan);
                            break;
                        }
                    }
                    vehiculos.registrarVehiculo(v);
                    pausa(scan);
                    break;
                }
                case 2: {
                    System.out.print("Ingrese el id del auto : ");
                    int id = Integer.parseInt(scan.nextLine());
                    Vehiculo v = vehiculos.buscarVehiculo(id);
                    System.out.println(v);
                    pausa(scan);
                    break;
                }
                case 3: {
                    System.out.print("Ingrese el id del auto : ");
                    int id = Integer.parseInt(scan.nextLine());
                    Vehiculo v = vehiculos.buscarVehiculo(id);
                    System.out.println(v);
                    System.out.println("ACTUALICE LOS VALORES O DEJELOS IGUAL");
                    pausa(scan);
                    System.out.println("Marcas disponibles");
                    TipoMarca[] marcas = TipoMarca.values();
                    for (int i = 0; i < marcas.length; i++) {
                        System.out.println((i + 1) + ". " + marcas[i]);
                    }

                    System.out.print("Select the option : ");
                    int imarca = Integer.parseInt(scan.nextLine()) - 1;

                    String marca = (imarca >= 0 && imarca < marcas.length) ? marcas[imarca].toString() : "Marca desconocida";

                    System.out.print("Modelo : ");
                    String modelo = scan.nextLine();

                    System.out.print("Velocidad : ");
                    double vel = Double.parseDouble(scan.nextLine());

                    System.out.print("Capacidad : ");
                    double capacidad = Double.parseDouble(scan.nextLine());

                    vehiculos.actualizarVehiculo(id, marca, modelo, vel, capacidad);
                    pausa(scan);
                    break;
                }
                case 4: {
                    System.out.print("Ingrese el id del vehiculo a eliminar : ");
                    int id = Integer.parseInt(scan.nextLine());
                    vehiculos.eliminarVehiculo(id);
                    break;
                }
                case 5: {
                    vehiculos.mostrarVehiculos();
                    pausa(scan);
                    break;
                }
                case 6: {
                    for (Vehiculo v : vehiculos.getVehiculos()) {

                        if (v instanceof I_Vehiculo c) {
                            c.abrir();
                            c.cerrar();
                            c.arrancar();
                            c.detener();
                        }

                        if (v instanceof I_VehiculoDePasajeros c) {
                            System.out.println("Ingrese la parada : ");
                            String parada = scan.nextLine();
                            c.anunciarParada(parada);
                        } else if (v instanceof I_VehiculoDeCarga c) {
                            System.out.println("Que cargara en el camion : ");
                            String carga = scan.nextLine();
                            c.cargarCamion(carga);
                            c.descargarCamion(carga);
                        }

                    }
                    pausa(scan);
                    break;
                }
                default: {
                    System.out.println("ERROR: INVALIDE OPTION ");
                    pausa(scan);
                    break;
                }
            }
        } while (opcion != 0);
    }


    public static void pausa(Scanner scan) {
        System.out.println("\nPress Enter To Continue : ");
        scan.nextLine();
    }

}
