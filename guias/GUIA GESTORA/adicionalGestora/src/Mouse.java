public class Mouse extends ProductosElectronico{
    public Mouse(String nombre, double precio, int stock, String marca) {
        super(nombre, precio, stock, marca);
    }

    @Override
    public String toString() {
        return "Mouse: {" +
                super.toString();
    }
}
