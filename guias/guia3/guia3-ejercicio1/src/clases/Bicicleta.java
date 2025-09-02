package clases;

import enums.TipoTransporte;
import interfaces.Transporte;

public class Bicicleta implements Transporte {
    private String numeroSerie;
    private TipoTransporte tipo;

    public Bicicleta(String numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.tipo = TipoTransporte.BICICLETA;
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando... ");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo... ");
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "numeroSerie='" + numeroSerie + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    public int obtenerCapacidad() {
        return 1;
    }

    public void ajustarAsiento(int altura) {
        System.out.println("Ajustando altura del asiento a " + altura);
    }
}
