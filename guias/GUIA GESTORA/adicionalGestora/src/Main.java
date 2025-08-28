import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GestorVentasFacturacion gestor = new GestorVentasFacturacion();
        GestorInventarioProductos inventory = new GestorInventarioProductos();
        List<Producto> carrito = new ArrayList<>();

        int opcion;

        Cliente cl1 = new Cliente("45923395", "Mauri", "Tognocchi", "tognocchitomas@gmail.com");
        Cliente cl2 = new Cliente("47832743", "Tomas", "Tognocchi", "tomas@gmail.com");
        Teclado tecl1 = new Teclado("tcd450", 300, 10, "MSI", true, false);
        Teclado tecl2 = new Teclado("lunaSoft", 200, 10, "Microsoft", false, true);
        Silla silla1 = new Silla("Silla", 100, 5);
        Silla silla2 = new Silla("Silla Gamer", 500, 13);
        Mouse mouse1 = new Mouse("g63", 250, 1, "Zelotes");
        Mouse mouse2 = new Mouse("r400", 250, 1, "Logitech");
        Pads pad1 = new Pads("Arena", 20, 20);
        Pads pad2 = new Pads("Netmak", 30, 0);
        Pantalla pant1 = new Pantalla("V200", 500, 3, "Valkyrie");
        Pantalla pant2 = new Pantalla("V100", 500, 0, "Valkyrie");

        inventory.registrarProducto(tecl1);
        inventory.registrarProducto(tecl2);
        inventory.registrarProducto(silla1);
        inventory.registrarProducto(silla2);
        inventory.registrarProducto(mouse1);
        inventory.registrarProducto(mouse2);
        inventory.registrarProducto(pad1);
        inventory.registrarProducto(pad2);
        inventory.registrarProducto(pant1);
        inventory.registrarProducto(pant2);

        do {

            System.out.println("""
                    |=======================================================================|
                    | 1. Ver clientes .                                                     |
                    | 2. Ver productos electronico .                                        |
                    | 3. Ver productos no electronicos .                                    |
                    | 4. Buscar producto por id .                                           |
                    | 5. Agregar producto al carrito .                                      |
                    | 6. Registrar factura .                                                |
                    | 7. Ver todas las facturas .                                           |
                    | 8. Ver detalles de factura por id .                                   |
                    | 0. Cerrar programa .                                                  |
                    |=======================================================================|
                    """);
            System.out.print("OPCION :");
            opcion = Integer.parseInt(scan.nextLine());

            switch (opcion) {
                case 1: {
                    System.out.println(cl1);
                    System.out.println(cl2);
                    pausa(scan);
                    break;
                }
                case 2: {
                    System.out.println("\n==== Productos electronicos ====");
                    for (ProductosElectronico p : inventory.getElectronicos()) {
                        System.out.println(p + "\n");
                    }
                    pausa(scan);
                    break;
                }
                case 3: {
                    System.out.println("\n==== Productos no electronicos ====)");
                    for (ProductoNoElectronico p : inventory.getNoElectronicos()) {
                        System.out.println(p + "\n");
                    }
                    pausa(scan);
                    break;
                }
                case 4: {
                    System.out.print("Ingrese un id para buscar un producto: ");
                    Producto p = inventory.buscarProducto(Integer.parseInt(scan.nextLine()));
                    if (p != null) {
                        System.out.println(p);

                    } else {
                        System.out.println("Producto no encontrado");
                    }
                    pausa(scan);
                    break;
                }
                case 5: {
                    System.out.print("Ingrese el id del producto para agregar al carrito: ");
                    Producto p = inventory.buscarProducto(Integer.parseInt(scan.nextLine()));
                    if (p != null) {
                        carrito.add(p);
                        System.out.println("Producto de $" + p.getPrecio() + " agregado al carrito");
                    } else {
                        System.out.println("Producto no encontrado");
                    }
                    pausa(scan);
                    break;
                }
                case 6: {
                    System.out.print("Ingrese el dni : ");
                    String auxdni = scan.nextLine();

                    gestor.registrarFactura(auxdni, carrito);
                    System.out.println("Factura registrada");
                    carrito.clear();
                    pausa(scan);
                    break;
                }
                case 7: {
                    System.out.println("\n==== Facturas ====");
                    for (Factura f : gestor.getFacturas()) {
                        if (f == null) {
                            System.out.println("Aun no hay facturas registradas");
                            break;
                        } else {
                            System.out.println(f + "\n");
                        }
                    }
                    pausa(scan);
                    break;
                }
                case 8: {
                    System.out.print("Ingrese el id de la factura para ver sus detalles: ");
                    Factura f = gestor.buscarFactura(Long.parseLong(scan.nextLine()));

                    if (f != null) {
                        System.out.println(f);
                    } else {
                        System.out.println("Factura no encontrada");
                    }
                    break;
                }
                case 0: {
                    System.out.println("==== CERRANDO PROGRAMA... ====");
                    break;
                }
                default: {
                    System.out.println("ERROR: OPCION INVALIDA");
                    pausa(scan);
                    break;
                }
            }
        } while (opcion != 0);
    }

    public static void pausa(Scanner scan) {
        System.out.print("\n==== Press ENTER for continue ====");
        scan.nextLine();
    }

}
