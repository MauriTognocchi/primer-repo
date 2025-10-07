package clases;

import enums.TipoMotor;
import interfaces.Comercial_I;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Comercial extends Avion implements Comercial_I {
    private int cantAzafatas;
    private List<String> servicios = new ArrayList<>();

    public Comercial(String modelo, String marca, int capacidadLitros, TipoMotor motor, int cantAsientos, int cantAzafatas, List<String> servicios) {
        super(modelo, marca, capacidadLitros, motor, cantAsientos);
        this.cantAzafatas = cantAzafatas;
        this.servicios = servicios;
    }

    public int getCantAzafatas() {
        return cantAzafatas;
    }

    public void setCantAzafatas(int cantAzafatas) {
        this.cantAzafatas = cantAzafatas;
    }

    public List<String> getServicios() {
        return servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Comercial comercial)) return false;
        if (!super.equals(o)) return false;
        return cantAzafatas == comercial.cantAzafatas && Objects.equals(servicios, comercial.servicios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cantAzafatas, servicios);
    }

    @Override
    public String toString() {
        return "Comercial{" + super.toString() +
                ", cantAzafatas=" + cantAzafatas +
                ", servicios=" + servicios +
                '}';
    }

    @Override
    public void servirComida(String comida) {
        System.out.println("Repartiendo "+comida+". Avion: "+getModelo());
    }

    @Override
    public void darMantas() {
        System.out.println("Repartiendo mantas. AVION: "+getModelo());
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
}
