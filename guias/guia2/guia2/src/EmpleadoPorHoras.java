public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;

    public EmpleadoPorHoras() {
    }

    public double calcularPago() {
        return getSalario() * horasTrabajadas;
    }

    ///  GETTERS AND SETTERS ==============================================================

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
