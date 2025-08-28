public class ProductosElectronico extends Producto {
    private String marca;

    public ProductosElectronico(String nombre, double precio, int stock, String marca) {
        super(nombre, precio, stock);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "marca='" + marca + '\'' +
                super.toString();
    }
}
