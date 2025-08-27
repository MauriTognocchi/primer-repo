import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Cilindro cilindro1 = new Cilindro();
        System.out.println(cilindro1);
        pausa(scan);

        Cilindro cilindro2 = new Cilindro(13, "verde", 133);
        System.out.println(cilindro2);
        pausa(scan);
    }

    public static void pausa(Scanner scan) {
        System.out.println("===PRESIONE ENTER PARA CONTINUAR===");
        scan.nextLine();
    }
}
