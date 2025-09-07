package classes;

import interfaces.I_VehiculoDePasajeros;

public class Autobus extends Vehiculo implements I_VehiculoDePasajeros {

    public Autobus(String marca, double velMax, String modelo) {
        super(marca, velMax, modelo);
    }

    /**
     * METODOS --------------------------------------------------------------------------------------------------
     */

    @Override
    public String toString() {
        return "Autobus"+super.toString();
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo autobus");
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrando autobus");
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando autobus");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo autobus");
    }

    @Override
    public void anunciarParada(String parada) {
        System.out.println("Proxima parada en : "+parada);
    }
}
