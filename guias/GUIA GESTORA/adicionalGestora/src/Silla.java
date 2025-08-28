public class Silla extends ProductoNoElectronico{
    public Silla(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    @Override
    public String toString() {
        return "Silla: "+super.toString();
    }
}
