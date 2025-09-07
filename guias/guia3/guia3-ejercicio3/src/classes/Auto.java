package classes;

import interfaces.I_Vehiculo;
import interfaces.I_VehiculoDePasajeros;

public class Auto extends Vehiculo implements I_Vehiculo {

    public Auto(String marca, double velMax, String modelo) {
        super(marca, velMax, modelo);
    }

    /**
     * METODOS --------------------------------------------------------------------------------------------------
     */

    @Override
    public String toString() {
        return "Auto"+super.toString();
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo auto");
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrando auto");
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando auto");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo auto");
    }

}
