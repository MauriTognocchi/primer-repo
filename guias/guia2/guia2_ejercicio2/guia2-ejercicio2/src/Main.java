import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Autor autor1 = new Autor("Joshua", "Bloch","josgua@gmail.com", 'M');
        System.out.println(autor1);

        Libro libro1 = new Libro("Effective Java",450,150, autor1);
        System.out.println(libro1);

        System.out.print("Ingrese un precio nuevo para el libro Effective Java : ");
        libro1.modificarPrecioDelLibro(Integer.parseInt(scan.nextLine()));


    }
}