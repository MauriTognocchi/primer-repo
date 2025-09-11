package classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GestorLibros {
    List<Material> materiales = new ArrayList<>();

    public void agregarMaterial(Material m, Usuario usuario) {
        if (usuario instanceof Admin) {
            materiales.add(m);
        } else {
            System.out.println("ERROR: NO ADMIN");
        }
    }

    public void eliminarMaterial(int id, Usuario usuario) {
        if (usuario instanceof Admin) {
            materiales.removeIf(mat -> mat.getId() == id);
        } else {
            System.out.println("ERROR: NO ADMIN");
        }
    }

    public List<Material> buscarPorTitulo(String titulo) {
        return materiales.stream()
                .filter(material -> material.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Material> buscarPorFecha(String fecha) {
        return materiales.stream()
                .filter(material -> material.getFecha().equalsIgnoreCase(fecha))
                .collect(Collectors.toList());
    }

    public List<Material> ordenarPorTitulo() {
        return materiales.stream()
                .sorted(Comparator.comparing(Material::getTitulo))
                .collect(Collectors.toList());
    }

    public List<Material> ordenarPorFecha() {
        return materiales.stream()
                .sorted(Comparator.comparing(Material::getFecha))
                .collect(Collectors.toList());
    }

    public void mostrarMateriales(List<Material> lista) {
        lista.forEach(System.out::println);
    }

    public List<Material> buscar(Predicate<Material> criterio){
        return materiales.stream()
                .filter(criterio)
                .collect(Collectors.toList());
    }
}
