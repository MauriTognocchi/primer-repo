package classes;

public abstract class Vehiculo {
    protected static int contId = 0;
    protected int id;
    protected String marca;
    protected String modelo;
    protected double velMax;
    protected double capacidad;

    public Vehiculo(String marca, double velMax, String modelo) {
        this.marca = marca;
        this.velMax = velMax;
        this.modelo = modelo;
        this.id = ++contId;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * METODOS ---------------------------------------------------------------------------------------------------
     */

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velMax=" + velMax +
                ", capacidad=" + capacidad +
                '}';
    }
}
