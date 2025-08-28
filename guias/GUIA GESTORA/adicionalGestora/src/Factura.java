import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private long idFactura ;
    private List <Producto> productos = new ArrayList<>();
    private String dniCliente ;
    private LocalDateTime fecha ;
    private double montoTotal ;

    public Factura() {
    }

    public long getIdFactura() {
        return idFactura;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        montoTotal += p.precio;
    }

    public void setIdFactura(long idFactura) {
        this.idFactura = idFactura;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                "\n productos=" + productos +
                "\n dniCliente='" + dniCliente + '\'' +
                ", fecha=" + fecha +
                ", montoTotal=" + montoTotal +
                '}';
    }
}
