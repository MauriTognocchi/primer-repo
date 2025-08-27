public class Cilindro extends Circulo {
    private double altura;

    public Cilindro() {
        this.altura = 1.0;
    }

    public Cilindro(double altura) {
        this.altura = altura;
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double calcularVolumen() {
        return super.calcularArea() * altura;
    }

    @Override
    public double calcularArea() {
        return (2 * Math.PI * radio * altura) + (2 * super.calcularArea());
    }

    @Override
    public String toString() {
        return "Cilindro subclase de:" + getClass().getSuperclass().getSimpleName() +
                "{altura= " + altura +
                " " + super.toString() +
                ", area= " + calcularArea() +
                ", volumen= " + calcularVolumen() +
                '}';
    }

    /**
     * ==================================== getters and setters ====================================
     */
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
