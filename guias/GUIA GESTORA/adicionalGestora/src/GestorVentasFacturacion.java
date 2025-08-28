import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GestorVentasFacturacion {
    private List<Factura> facturas = new ArrayList<>();
    private long contadorFactura = 1;

    public void registrarFactura(String dniCliente,List<Producto> productos) {
        Factura f = new Factura();

        f.setIdFactura(contadorFactura++);
        f.setDniCliente(dniCliente);
        f.setFecha(LocalDateTime.now());

        for(Producto p : productos){
            f.agregarProducto(p);
        }

        facturas.add(f);
    }

    public Factura buscarFactura(long idFactura) {
        for (Factura f : facturas) {
            if (f.getIdFactura() == idFactura) {
                return f;
            }
        }
        return null;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }
}
