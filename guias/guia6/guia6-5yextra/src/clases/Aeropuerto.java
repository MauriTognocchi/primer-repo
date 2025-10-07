package clases;

import java.util.ArrayList;
import java.util.List;

public class Aeropuerto{
    private static int contId = 0;
    private final int id;
    private String nombre;
    private String direccion;
    private int capacidad;
    private final List<Comercial> hangarComercial = new ArrayList<>();
    private final List<DeCarga<?>> hangarDeCarga = new ArrayList<>();
    private final List<Militar> hangarMilitar = new ArrayList<>();
    private final List<Privado> hangarPrivado = new ArrayList<>();

    public Aeropuerto() {
        this.id = ++contId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContId() {
        return contId;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Comercial> getHangarComercial() {
        return hangarComercial;
    }

    public List<DeCarga<?>> getHangarDeCarga() {
        return hangarDeCarga;
    }

    public List<Militar> getHangarMilitar() {
        return hangarMilitar;
    }

    public List<Privado> getHangarPrivado() {
        return hangarPrivado;
    }

    public boolean agregarAvion(Avion avion) {
        if (avion instanceof Comercial) {
            if (hangarComercial.size() < capacidad) {
                hangarComercial.add((Comercial) avion);
            } else {
                System.out.println("ERROR: Hangar Comercial lleno.");
                return false;
            }
        } else if (avion instanceof DeCarga) {
            if (hangarDeCarga.size() < capacidad) {
                hangarDeCarga.add((DeCarga<?>) avion);
            } else {
                System.out.println("ERROR: Hangar DeCarga lleno.");
                return false;
            }
        } else if (avion instanceof Militar) {
            if (hangarMilitar.size() < capacidad) {
                hangarMilitar.add((Militar) avion);
            } else {
                System.out.println("ERROR: Hangar Militar lleno.");
                return false;
            }
        } else if (avion instanceof Privado) {
            if (hangarPrivado.size() < capacidad) {
                hangarPrivado.add((Privado) avion);
            } else {
                System.out.println("ERROR: Hangar Privado lleno.");
                return false;
            }
        }
        return true;
    }

    public void despegarHangar(List<? extends Avion> tipoHangar){
        for (Avion avion : tipoHangar) {
            avion.despegar();
            avion.volar();
            avion.aterrizar();
        }
    }

}
