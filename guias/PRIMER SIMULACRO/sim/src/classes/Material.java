package classes;

import enums.EstadoPrestamo;
import enums.TipoMaterial;

import java.security.PublicKey;

public class Material {
    protected static int contID = 1;
    protected int id;
    protected String titulo;
    protected String autor;
    protected String fecha;
    protected TipoMaterial categoria;
    protected EstadoPrestamo estado = EstadoPrestamo.DISPONIBLE;

    public Material() {
    }

    public Material(String titulo, String autor, String fecha, TipoMaterial categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.categoria = categoria;
        this.id = contID++;
    }

    ///  GETTERS AND SETTER --------------------------------------------------------------------------------------------

    public EstadoPrestamo getEstado() {
        return estado;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public TipoMaterial getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoMaterial categoria) {
        this.categoria = categoria;
    }

    ///  METODOS -------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fecha='" + fecha + '\'' +
                ", categoria=" + categoria +
                '}';
    }

    public void prestar() {
        if(estado == EstadoPrestamo.DISPONIBLE){
            estado = EstadoPrestamo.PRESTADO;
            System.out.println(titulo+" fue prestado.");
        }else {
            System.out.println(titulo+" no disponible.");
        }
    }

    public void devolver() {
        if (estado == EstadoPrestamo.PRESTADO){
            estado = EstadoPrestamo.DISPONIBLE;
            System.out.println(titulo + " devuelto.");
        }else {
            System.out.println(titulo + " no estaba prestado");
        }
    }

}
