import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Estudiante estudiante1 = new Estudiante(45923395, "Mauri", "Tognocchi", "tognocchitomas@gmail.com", "Echeverria 1926", 2024, 80000, "Tecnicatura en Programacion");
        Estudiante estudiante2 = new Estudiante(49584630, "Juan", "Mariscal", "juanmariscal@gmail.com", "William Morris 6500", 2024, 80000, "Tecnicatura en Programacion");
        Estudiante estudiante3 = new Estudiante(39575467, "Martin", "Rodriguez", "rodriguezmartin@gmail.com", "Santiago del Estero 1300", 2024, 80000, "Tecnicatura en Programacion");
        Estudiante estudiante4 = new Estudiante(48575944, "Lautaro", "Orellano", "lautaroorellano@gmail.com", "Pringles 823", 2024, 80000, "Tecnicatura en Programacion");

        Staff staff1 = new Staff(46373646, "Sergio", "Punk", "sergiopunk@gmail.com", "Cerrito 1244", 800000, "Noche");
        Staff staff2 = new Staff(43784387, "Juan", "Rivadavia", "juanrivadavia@gmail.com", "Alvarado 5677", 800000, "Noche");
        Staff staff3 = new Staff(32984857, "Pablo", "Tognocchi", "pablotognocchi@gmail.com", "Echeverria 1926", 800000, "Noche");
        Staff staff4 = new Staff(29374758, "Matias", "Punk", "matiaspunk@gmail.com", "Cerrito1244", 800000, "Noche");

        Persona[] array = new Persona[8];

        array[0] = estudiante1;
        array[1] = estudiante2;
        array[2] = estudiante3;
        array[3] = estudiante4;
        array[4] = staff1;
        array[5] = staff2;
        array[6] = staff3;
        array[7] = staff4;

        int cantEst = 0, cantStaff = 0;
        double totalIngresos = 0;


        for (Persona p : array) {
            if (p instanceof Estudiante) {
                cantEst++;
                totalIngresos += ((Estudiante) p).getCuotaMensual();
            } else if (p instanceof Staff) {
                cantStaff++;
            }
        }

        System.out.println("Cantidad de estudiantes = " + cantEst);
        System.out.println("Cantidad de Staffs = " + cantStaff);
        pausa(scan);
        System.out.println("Total de ingresos = " + totalIngresos);

    }

    public static void pausa(Scanner scan) {
        System.out.println("==== Press ENTER to continue... ====");
        scan.nextLine();
    }
}
