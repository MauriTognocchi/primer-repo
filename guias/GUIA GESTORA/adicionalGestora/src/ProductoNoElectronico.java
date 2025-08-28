public class ProductoNoElectronico extends Producto{
    public ProductoNoElectronico(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", id=" + id +
                '}';
    }
}
