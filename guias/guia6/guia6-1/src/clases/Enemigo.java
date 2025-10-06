package clases;

import java.util.Objects;

public class Enemigo {
    private String name;

    public Enemigo(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Enemigo enemigo)) return false;
        return Objects.equals(name, enemigo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "name='" + name + '\'' +
                '}';
    }
}
