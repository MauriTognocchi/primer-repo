public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Mauri", "tognocchitomas@gmail.com", 25);
        System.out.println(cliente1);

        Factura factura1 = new Factura(1000, cliente1);
        System.out.println(factura1);

        factura1.calcularMontoFinal();
        System.out.println(factura1);
    }
}
