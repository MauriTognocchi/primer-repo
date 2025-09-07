package classes;

import interfaces.I_Vehiculo;

public class Bicicleta extends Vehiculo implements I_Vehiculo {

    public Bicicleta(String marca, double velMax, String modelo) {
        super(marca, velMax, modelo);
    }

    /**
     * METODOS --------------------------------------------------------------------------------------------------
     */

    @Override
    public String toString() {
        return "Bicicleta"+super.toString();
    }

    @Override
    public void abrir() {
        System.out.println("Destrabando bicicleta");
    }

    @Override
    public void cerrar() {
        System.out.println("Trabando bicicleta");
    }

    @Override
    public void arrancar() {
        System.out.println("Pedaleando");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo bicicleta");
    }
}
