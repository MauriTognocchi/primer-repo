public class Autor {
    protected String nombre;
    protected String apellido;
    protected String email;
    protected char mOf;

    public Autor(String apellido, String nombre, String email, char mOf) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.mOf = mOf;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", mOf=" + mOf +
                '}';
    }
    /// GETTERS AND SETTERS ================================================================
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getmOf() {
        return mOf;
    }

    public void setmOf(char mOf) {
        this.mOf = mOf;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
