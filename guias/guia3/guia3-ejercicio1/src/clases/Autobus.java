package clases;

import enums.TipoTransporte;
import interfaces.Transporte;

public class Autobus implements Transporte {
    private int NumeroLinea;
    private int Capacidad;
    private TipoTransporte tipo;

    public Autobus(int numeroLinea, int capacidad) {
        NumeroLinea = numeroLinea;
        Capacidad = capacidad;
        tipo = TipoTransporte.AUTOBUS;
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando... ");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo... ");
    }

    public int obtenerCapacidad() {
        return Capacidad;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "NumeroLinea=" + NumeroLinea +
                ", tipo=" + tipo +
                '}';
    }

    public void anunciarParada(String parada) {
        System.out.println("Proxima parada : " + parada);
    }


}
