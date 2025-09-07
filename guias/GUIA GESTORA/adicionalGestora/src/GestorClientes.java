package managers;

import java.util.ArrayList;
import java.util.List;

public class GestorClientes {
    private List<Cliente> clientes = new ArrayList<>();

    public void registrarCliente(Cliente c) {
        if (c instanceof Cliente) {
            clientes.add(c);
        }
    }

    public void mostrarClientes() {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public void eliminarCliente(String dni) {
       clientes.removeIf(c -> c.getDni().equalsIgnoreCase(dni));
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
