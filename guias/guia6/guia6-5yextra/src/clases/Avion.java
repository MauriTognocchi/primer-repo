package clases;

import enums.TipoMotor;

import java.util.Objects;

public abstract class Avion {
    private String modelo;
    private String marca;
    private int capacidadLitros;
    private TipoMotor motor;
    private int cantAsientos;

    public Avion(String modelo, String marca, int capacidadLitros, TipoMotor motor, int cantAsientos) {
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadLitros = capacidadLitros;
        this.motor = motor;
        this.cantAsientos = cantAsientos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public TipoMotor getMotor() {
        return motor;
    }

    public void setMotor(TipoMotor motor) {
        this.motor = motor;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Avion avion)) return false;
        return capacidadLitros == avion.capacidadLitros && cantAsientos == avion.cantAsientos && Objects.equals(modelo, avion.modelo) && Objects.equals(marca, avion.marca) && Objects.equals(motor, avion.motor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, marca, capacidadLitros, motor, cantAsientos);
    }

    @Override
    public String toString() {
        return "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadLitros=" + capacidadLitros +
                ", motor=" + motor +
                ", cantAsientos=" + cantAsientos +
                '}';
    }

    public abstract void despegar ();
    public abstract void aterrizar ();
    public abstract void volar ();


}
