import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("""
                    |===========================================================|
                    | 1: Crear y calcular pago para un empleado tiempo completo.|
                    | 2: Crear y calcular pago para un empleado por horas.      |
                    | 3: Crear y calcular pago para un empleado por proyectos.  |
                    | 4: Salir del programa.                                    |
                    |===========================================================|
                    """);
            System.out.print("Ingrese una opcion: ");
            opcion = Integer.parseInt(scan.nextLine());
            switch (opcion) {
                case 1: {
                    EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto();
                    System.out.print("Ingrese el nombre del empleado : ");
                    emp1.setNombre(scan.nextLine());
                    System.out.print("Ingrese el salario mensual del empleado : ");
                    emp1.setSalario(Integer.parseInt(scan.nextLine()));
                    System.out.println("Salario mensual del empleado = " + emp1.calcularPago());
                    pausa(scan);
                    break;
                }
                case 2: {
                    EmpleadoPorHoras emp1 = new EmpleadoPorHoras();
                    System.out.print("Ingrese el nombre del empleado : ");
                    emp1.setNombre(scan.nextLine());

                    System.out.print("Ingrese lo que gana por hora el empleado : ");
                    emp1.setSalario(Integer.parseInt(scan.nextLine()));

                    System.out.print("Ingrese cuantas horas trabajo en el mes : ");
                    emp1.setHorasTrabajadas(Integer.parseInt(scan.nextLine()));

                    System.out.println("Salario mensual del empleado = " + emp1.calcularPago());
                    pausa(scan);
                    break;
                }
                case 3: {
                    EmpleadoContratista emp1 = new EmpleadoContratista();
                    System.out.print("Ingrese el nombre del empleado : ");
                    emp1.setNombre(scan.nextLine());

                    System.out.print("Ingrese lo que gana por hora en el proyecto : ");
                    emp1.setSalario(Integer.parseInt(scan.nextLine()));

                    System.out.print("Ingrese cuantas horas trabajo en el proyecto : ");
                    emp1.setHorasTrabajadas(Integer.parseInt(scan.nextLine()));

                    System.out.println("Salario del proyecto del empleado = " + emp1.calcularPago());
                    pausa(scan);
                    break;
                }
                case 4: {
                    System.out.println("==== CERRANDO PROGRAMA... ====");
                    break;
                }
                default: {
                    System.out.println("ERROR: OPCION INVALIDA !!!");
                    pausa(scan);
                    break;
                }
            }

        } while (opcion != 4);

    }

    public static void pausa(Scanner scan) {
        System.out.println("==== Presione enter para continuar ====");
        scan.nextLine();
    }
}
