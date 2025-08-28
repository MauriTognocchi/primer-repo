public class Pads extends ProductoNoElectronico{
    public Pads(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    @Override
    public String toString() {
        return "Pads: "+super.toString();
    }
}
