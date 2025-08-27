public class Estudiante extends Persona {
    private int anioIngresado;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(long dni, String nombre, String apellido, String email, String direccion, int anioIngresado, double cuotaMensual, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioIngresado = anioIngresado;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    /**
     * GETTERS AND SETTERS
     */

    public int getAnioIngresado() {
        return anioIngresado;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setAnioIngresado(int anioIngresado) {
        this.anioIngresado = anioIngresado;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
