package classes;

import interfaces.I_VehiculoDeCarga;

public class Camion extends Vehiculo implements I_VehiculoDeCarga {

    public Camion(String marca, double velMax, String modelo) {
        super(marca, velMax, modelo);
    }

    /**
     * METODOS ---------------------------------------------------------------------------------------------------
     */

    @Override
    public String toString() {
        return "Camion"+super.toString();
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo camion");
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrando camion");
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando camion");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo camion");
    }

    @Override
    public void cargarCamion(String cargar) {
        System.out.println("Cargando camion con "+cargar);
    }

    @Override
    public void descargarCamion(String descargar) {
        System.out.println("Descargando camion con "+descargar);
    }
}
