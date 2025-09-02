package clases;

import enums.TipoTransporte;
import interfaces.Transporte;

public class Tranvia implements Transporte {
    private String ruta;
    private int capacidad;
    private TipoTransporte tipo;

    public Tranvia(String ruta, int capacidad) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.tipo = TipoTransporte.TRANVIA;
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
    public int obtenerCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Tranvia{" +
                "ruta='" + ruta + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    public void cambiarVia(int nuevaVia) {
        System.out.println("Cambiando a via : " + nuevaVia);
    }
}
