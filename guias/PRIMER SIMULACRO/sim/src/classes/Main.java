package classes;

import enums.EstadoPrestamo;
import enums.Genero;
import enums.TipoEbook;
import enums.TipoMaterial;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        GestorLibros biblioteca = new GestorLibros();

        Usuario adm1 = new Admin();
        Usuario cli1 = new Cliente();

        biblioteca.agregarMaterial(new Libro("Cien Años de Soledad", "Gabriel García Márquez", "1967", TipoMaterial.LIBRO, "417", Genero.NOVELA), adm1);
        biblioteca.agregarMaterial(new Libro("1984", "George Orwell", "1949", TipoMaterial.LIBRO, "328", Genero.DISTOPIA), adm1);
        biblioteca.agregarMaterial(new Libro("El Quijote", "Miguel de Cervantes", "1605", TipoMaterial.LIBRO, "863", Genero.CLASICO), adm1);
        biblioteca.agregarMaterial(new Libro("Crimen y Castigo", "Fiódor Dostoyevski", "1866", TipoMaterial.LIBRO, "671", Genero.NOVELA), adm1);
        biblioteca.agregarMaterial(new Libro("Orgullo y Prejuicio", "Jane Austen", "1813", TipoMaterial.LIBRO, "279", Genero.ROMANCE), adm1);

        biblioteca.agregarMaterial(new Ebook("El Hobbit", "J.R.R. Tolkien", "1937", TipoMaterial.EBOOK, TipoEbook.PDF), adm1);
        biblioteca.agregarMaterial(new Ebook("El Señor de los Anillos", "J.R.R. Tolkien", "1954", TipoMaterial.EBOOK, TipoEbook.EPUB), adm1);
        biblioteca.agregarMaterial(new Ebook("Juego de Tronos", "George R.R. Martin", "1996", TipoMaterial.EBOOK, TipoEbook.MOBI), adm1);
        biblioteca.agregarMaterial(new Ebook("El Nombre del Viento", "Patrick Rothfuss", "2007", TipoMaterial.EBOOK, TipoEbook.PDF), adm1);
        biblioteca.agregarMaterial(new Ebook("Dune", "Frank Herbert", "1965", TipoMaterial.EBOOK, TipoEbook.AZW3), adm1);

        biblioteca.agregarMaterial(new Revista("National Geographic", "Varios Autores", "2023", TipoMaterial.REVISTA, EstadoPrestamo.DISPONIBLE), adm1);
        biblioteca.agregarMaterial(new Revista("TIME", "Varios Autores", "2023", TipoMaterial.REVISTA, EstadoPrestamo.PRESTADO), adm1);
        biblioteca.agregarMaterial(new Revista("Forbes", "Varios Autores", "2023", TipoMaterial.REVISTA, EstadoPrestamo.DISPONIBLE), adm1);
        biblioteca.agregarMaterial(new Revista("Nature", "Varios Autores", "2023", TipoMaterial.REVISTA, EstadoPrestamo.DISPONIBLE), adm1);
        biblioteca.agregarMaterial(new Revista("Scientific American", "Varios Autores", "2023", TipoMaterial.REVISTA, EstadoPrestamo.PRESTADO), adm1);

        do {
            System.out.println("""
                    0. Cerrar programa.
                    1. Eliminar material por id.
                    2. Hacer busqueda por filtro.
                    """);
            System.out.print("OPCION : ");
            opcion = Integer.parseInt(scan.nextLine());
            switch (opcion) {
                case 0: {
                    System.out.println("Cerrando programa.");
                    break;
                }
                case 1: {
                    System.out.println("Ingrese el id : ");
                    int id = Integer.parseInt(scan.nextLine());

                    biblioteca.eliminarMaterial(id, adm1);
                    pausa(scan);
                    break;
                }
                case 2: {
                    System.out.println("1. Filtrar por fecha.");
                    System.out.println("2. Filtrar por titulo. ");
                    System.out.print("OPCION :");
                    int opc = Integer.parseInt(scan.nextLine());
                    if (opc == 2) {
                        System.out.print("Ingrese el titulo : ");
                        String titulo = scan.nextLine();
                        List<Material> filtrados = biblioteca.buscar(material -> material.getTitulo().toLowerCase().contains(titulo.toLowerCase()));
                        filtrados.forEach(System.out::println);
                    } else if (opc == 1) {
                        System.out.print("Ingrese la fecha : ");
                        String fecha = scan.nextLine();
                        List<Material> filtrados = biblioteca.buscar(material -> material.getFecha().equalsIgnoreCase(fecha));
                        filtrados.forEach(System.out::println);
                    }
                    pausa(scan);
                    break;
                }
                case 3: {

                }
            }
        } while (opcion != 0);

    }

    public static void pausa(Scanner scan) {
        System.out.println("PRESS ENTER TO CONTINUE");
        scan.nextLine();
    }

}
