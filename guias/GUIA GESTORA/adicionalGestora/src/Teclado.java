public class Teclado extends ProductosElectronico{
    private boolean mecanico;
    private boolean conExtension;

    public Teclado(String nombre, double precio, int stock, String marca, boolean mecanico, boolean conExtension) {
        super(nombre, precio, stock, marca);
        this.mecanico = mecanico;
        this.conExtension = conExtension;
    }

    public boolean isTipoTeclado() {
        return mecanico;
    }

    public void setTipoTeclado(boolean mecanico) {
        this.mecanico = mecanico;
    }

    public boolean isConExtension() {
        return conExtension;
    }

    public void setConExtension(boolean conExtension) {
        this.conExtension = conExtension;
    }

    @Override
    public String toString() {
        return "Teclado: {" +
                "mecanico=" + mecanico +
                ", con Extension=" + conExtension +
                ", "+super.toString();
    }
}
