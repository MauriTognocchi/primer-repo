package clases;

import enums.TipoMotor;
import interfaces.DeCargaYMilitar_I;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DeCarga <T> extends Avion implements DeCargaYMilitar_I {
    private double cantKilos;
    private List<T> productos = new ArrayList<>();

    public DeCarga(String modelo, String marca, int capacidadLitros, TipoMotor motor, double cantKilos, List<T> productos) {
        super(modelo, marca, capacidadLitros, motor, 0);
        this.cantKilos = cantKilos;
        this.productos = productos;
    }

    public double getCantKilos() {
        return cantKilos;
    }

    public void setCantKilos(double cantKilos) {
        this.cantKilos = cantKilos;
    }

    public List<T> getProductos() {
        return productos;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof DeCarga<?> deCarga)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(cantKilos, deCarga.cantKilos) == 0 && Objects.equals(productos, deCarga.productos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cantKilos, productos);
    }

    @Override
    public String toString() {
        return "DeCarga{" + super.toString() +
                ", cantKilos=" + cantKilos +
                ", productos=" + productos +
                '}';
    }

    @Override
    public void despegar() {
        System.out.println("Despegando. AVION: "+getModelo());
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizando. AVION: "+getModelo());
    }

    @Override
    public void volar() {
        System.out.println("Piloto automatico activado. AVION: "+getModelo());
    }

    @Override
    public boolean ingresar() {
        return false;
    }
}
