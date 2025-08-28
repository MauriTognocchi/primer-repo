public class Pantalla extends ProductosElectronico{
    public Pantalla(String nombre, double precio, int stock, String marca) {
        super(nombre, precio, stock, marca);
    }

    @Override
    public String toString() {
        return "Pantalla: {" +
                super.toString();
    }
}
