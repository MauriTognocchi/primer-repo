package managers;

import classes.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class GestorVehiculos {

    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void registrarVehiculo(Vehiculo v) {
        if (v instanceof Vehiculo) {
            vehiculos.add(v);
            return;
        }
        System.out.println("ERROR: No es un vehiculo");
    }

    public Vehiculo buscarVehiculo(int id) {
        for (Vehiculo v : vehiculos) {
            if (id == v.getId()) {
                return v;
            }
        }
        System.out.println("ERROR: Id del vehiculo no registrado");
        return null;
    }

    public void eliminarVehiculo(int id){
      vehiculos.removeIf(v -> v.getId() == id);
    }

    public void actualizarVehiculo(int id, String marca, String modelo, double velocidad, double capacidad) {
        Vehiculo v = buscarVehiculo(id);
        v.setMarca(marca);
        v.setModelo(modelo);
        v.setVelMax(velocidad);
        v.setCapacidad(capacidad);
        System.out.println(v);
    }

    public void mostrarVehiculos() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }



    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

}
