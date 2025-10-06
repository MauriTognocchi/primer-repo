package clases;

import java.util.Objects;

public class Jugador {
    private String name;

    public Jugador(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Jugador jugador)) return false;
        return Objects.equals(name, jugador.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "name='" + name + '\'' +
                '}';
    }
}
