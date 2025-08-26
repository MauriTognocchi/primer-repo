import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Factura {
    private final String id;
    private double montoTotal;
    private final LocalDateTime fecha;
    private Cliente clienteBuy;
    private double montoFinal;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Factura(double montoTotal, Cliente clienteBuy) {
        this.montoTotal = montoTotal;
        this.fecha = LocalDateTime.now();
        this.clienteBuy = clienteBuy;
        this.id = UUID.randomUUID().toString();
    }

    public void calcularMontoFinal() {
        montoFinal = montoTotal-(montoTotal*clienteBuy.getDescuento()/100) ;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id='" + id + '\'' +
                ", montoTotal=" + montoTotal +
                ", fecha=" + fecha.format(formatter) +
                ", clienteBuy=" + clienteBuy +
                '}';
    }

    /** ========== SETTERS AND GETTERS ========== */

    public String getId() {
        return id;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Cliente getClienteBuy() {
        return clienteBuy;
    }

    public double getMontoFinal() {
        return montoFinal;
    }
}
