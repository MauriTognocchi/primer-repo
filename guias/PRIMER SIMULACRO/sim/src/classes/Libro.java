package classes;

import enums.Genero;
import enums.TipoMaterial;

public class Libro extends Material{
    private String cantPaginas ;
    private Genero genero;

    public Libro(String titulo, String autor, String fecha, TipoMaterial categoria, String cantPaginas, Genero genero) {
        super(titulo, autor, fecha, categoria);
        this.cantPaginas = cantPaginas;
        this.genero = genero;
    }
}
