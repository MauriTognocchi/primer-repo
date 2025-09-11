package classes;

import enums.EstadoPrestamo;
import enums.TipoMaterial;

public class Revista extends Material{

    public Revista(String titulo, String autor, String fecha, TipoMaterial categoria, EstadoPrestamo estado) {
        super(titulo, autor, fecha, categoria);
        this.estado = estado;
    }
}
