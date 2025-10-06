import clases.Alumno;
import clases.Colegio;
import enums.Nacionalidad;
import excepciones.ColegioException;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu;
        Colegio listado = new Colegio();

        do {
            pausa(scan);
            System.out.println("""
                    1. Agregar alumno.
                    2. Ver cantidad de alumnos de una nacionalidad.
                    3. Ver cuantas nacionalidades hay en el colegio.
                    4. Borrar alumno.
                    5. Mostrar distintas nacionalidades con cantidad de alumnos.
                    0. Cerrar programa.
                    """);
            try {
                System.out.print("OPCION: ");
                menu = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Ingrese una opcion Numero Entero.");
                scan.nextLine();
                menu = 10;
            }
            switch (menu) {
                case 0: {
                    System.out.println("Cerrando programa.");
                    break;
                }
                case 1: {
                    Alumno alumno = pedirAlumno(scan);

                    try {
                        listado.agregarAlumno(alumno);
                    } catch (ColegioException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                }
                case 2: {
                    System.out.print("Nacionalidades permitidas en la escuela");
                    for (Nacionalidad n : Nacionalidad.values()) {
                        System.out.println(n.ordinal() + "- " + n.name());
                    }
                    Nacionalidad seleccionada = null;

                    boolean flag = false;
                    while (!flag) {
                        try {
                            System.out.print("Ingrese la opcion: ");
                            int opcion = scan.nextInt();
                            scan.nextLine();
                            if (opcion < 0 || opcion > Nacionalidad.values().length) {
                                System.out.println("ERROR: Opcion invalida de nacionalidad");
                            } else {
                                seleccionada = Nacionalidad.values()[opcion];
                                flag = true;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("ERROR: Ingrese una opcion Numero Entero");
                            scan.nextLine();
                        }

                    }

                    try {
                        System.out.println("Cantidad : " + listado.verNacionalidad(seleccionada));
                    } catch (ColegioException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                }
                case 3: {
                    try {
                        Set<Nacionalidad> sett = listado.cuantos();
                        for (Nacionalidad n : sett) {
                            System.out.println(n.name());
                        }
                    } catch (ColegioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 4: {
                    List<Alumno> ver = listado.getListado();
                    for (Alumno alumno : ver) {
                        System.out.println(alumno);
                    }

                    Alumno alumno = pedirAlumno(scan);

                    try {
                        listado.borrar(alumno);
                    } catch (ColegioException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                }
                case 5: {
                    try {
                        Map<Nacionalidad, Integer> resultado = listado.verTodos();

                        for (Map.Entry<Nacionalidad, Integer> entry : resultado.entrySet()){
                            System.out.println("Nacionalidad : "+ entry.getKey());
                            System.out.println("Cantidad de alumnos : "+ entry.getValue());
                        }

                    } catch (ColegioException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                default: {
                    System.out.println("ERROR: Opcion invalida");
                }
            }
        } while (menu != 0);

    }

    public static Alumno pedirAlumno(Scanner scan) {
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scan.nextLine().trim();

        System.out.print("Ingrese el apellido del alumno: ");
        String apellido = scan.nextLine().trim();

        System.out.print("Nacionalidades permitidas en la escuela");
        for (Nacionalidad n : Nacionalidad.values()) {
            System.out.println(n.ordinal() + "- " + n.name());
        }
        Nacionalidad seleccionada = null;

        boolean flag = false;
        while (!flag) {
            try {
                System.out.print("Ingrese la opcion: ");
                int opcion = scan.nextInt();
                scan.nextLine();
                if (opcion < 0 || opcion >= Nacionalidad.values().length) {
                    System.out.println("ERROR: Opcion invalida de nacionalidad");
                } else {
                    seleccionada = Nacionalidad.values()[opcion];
                    flag = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Ingrese una opcion Numero Entero");
                scan.nextLine();
            }
        }

        return new Alumno(nombre, apellido, seleccionada);
    }

    public static void pausa(Scanner scan) {
        System.out.print("\n PRESIONE ENTER PARA CONTINUAR");
        scan.nextLine();
    }
}
