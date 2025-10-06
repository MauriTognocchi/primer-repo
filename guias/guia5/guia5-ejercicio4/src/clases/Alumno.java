package clases;

import enums.Nacionalidad;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellido;
    private Nacionalidad nacionalidad;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, Nacionalidad nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacionalidad=" + nacionalidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Alumno alumno)) return false;
        return Objects.equals(nombre, alumno.nombre)
                && Objects.equals(apellido, alumno.apellido)
                && nacionalidad == alumno.nacionalidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, nacionalidad);
    }
}
