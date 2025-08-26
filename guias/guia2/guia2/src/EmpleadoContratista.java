public class EmpleadoContratista extends Empleado {
    private int horasTrabajadas;

    public EmpleadoContratista() {
    }

    public double calcularPago() {
        return getSalario() * horasTrabajadas;
    }

    ///  GETTERS AND SETTERS ==============================================================

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
