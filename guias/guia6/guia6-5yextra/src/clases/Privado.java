package clases;

import enums.TipoMotor;
import interfaces.Privado_I;

import java.util.Objects;

public class Privado extends Avion implements Privado_I {
    private boolean jacuzzi;
    private String claveWifi;

    public Privado(String modelo, String marca, int capacidadLitros, TipoMotor motor, int cantAsientos, boolean jacuzzi, String claveWifi) {
        super(modelo, marca, capacidadLitros, motor, cantAsientos);
        this.jacuzzi = jacuzzi;
        this.claveWifi = claveWifi;
    }

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Privado privado)) return false;
        if (!super.equals(o)) return false;
        return jacuzzi == privado.jacuzzi && Objects.equals(claveWifi, privado.claveWifi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jacuzzi, claveWifi);
    }

    @Override
    public String toString() {
        return "Privado{" + super.toString() +
                ", jacuzzi=" + jacuzzi +
                ", claveWifi='" + claveWifi + '\'' +
                '}';
    }

    @Override
    public void despegar() {
        System.out.println("Despegando. AVION: " + getModelo());
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizando. AVION: " + getModelo());
    }

    @Override
    public void volar() {
        System.out.println("Piloto automatico activado. AVION: " + getModelo());
    }

    @Override
    public void servirComida(String comida) {
        System.out.println("Repartiendo " + comida + ". AVION: " + getModelo());
    }

    @Override
    public void darMantas() {
        System.out.println("Repartiendo mantas. AVION: "+getModelo());
    }

    @Override
    public boolean verMundial() {
        return true;
    }


}
