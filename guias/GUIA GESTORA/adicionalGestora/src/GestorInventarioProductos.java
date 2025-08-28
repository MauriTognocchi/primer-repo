import java.util.ArrayList;
import java.util.List;

public class GestorInventarioProductos {
    private List<ProductosElectronico> electronicos = new ArrayList<>();
    private List<ProductoNoElectronico> noElectronicos = new ArrayList<>();


    public void registrarProducto(Producto p) {
        if (p instanceof ProductosElectronico) {
            electronicos.add((ProductosElectronico) p);
        } else if (p instanceof ProductoNoElectronico) {
            noElectronicos.add((ProductoNoElectronico) p);
        }
    }

    public Producto buscarProducto(int idProducto) {
        for (ProductosElectronico p : electronicos) {
            if (p.id == idProducto) {
                return p;
            }
        }
        for (ProductoNoElectronico p : noElectronicos) {
            if (p.id == idProducto) {
                return p;
            }
        }
        return null;
    }

    public List<ProductosElectronico> getElectronicos() {
        return electronicos;
    }

    public List<ProductoNoElectronico> getNoElectronicos() {
        return noElectronicos;
    }
}
