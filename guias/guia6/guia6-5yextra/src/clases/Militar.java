package clases;

import enums.TipoArma;
import enums.TipoMotor;
import interfaces.DeCargaYMilitar_I;

import java.util.Objects;

public class Militar extends Avion implements DeCargaYMilitar_I {
    private TipoArma armas;
    private int cantBalas;

    public Militar(String modelo, String marca, int capacidadLitros, TipoMotor motor, int cantAsientos, TipoArma armas, int cantBalas) {
        super(modelo, marca, capacidadLitros, motor, cantAsientos);
        this.armas = armas;
        this.cantBalas = cantBalas;
    }

    public TipoArma getArmas() {
        return armas;
    }

    public void setArmas(TipoArma armas) {
        this.armas = armas;
    }

    public int getCantBalas() {
        return cantBalas;
    }

    public void setCantBalas(int cantBalas) {
        this.cantBalas = cantBalas;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Militar militar)) return false;
        if (!super.equals(o)) return false;
        return cantBalas == militar.cantBalas && armas == militar.armas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), armas, cantBalas);
    }

    @Override
    public String toString() {
        return "Militar{" + super.toString() +
                ", armas=" + armas +
                ", cantBalas=" + cantBalas +
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
