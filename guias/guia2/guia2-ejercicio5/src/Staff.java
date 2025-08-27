public class Staff extends Persona {
    private double salario;
    private String turno;

    public Staff(long dni, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    /**
     * GETTERS AND SETTERS
     */

    public double getSalario() {
        return salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
