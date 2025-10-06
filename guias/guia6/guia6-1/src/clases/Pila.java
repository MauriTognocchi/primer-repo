package clases;

import excepciones.AlmacenamientoExcepcion;

import java.util.ArrayList;
import java.util.List;


public class Pila<T> {
    private List<T> pila = new ArrayList<>();

    public void push(T elemento) {
        pila.add(elemento);
    }

    public T pop() throws AlmacenamientoExcepcion {
        if (pila.isEmpty()) {
            throw new AlmacenamientoExcepcion("ERROR: Pila vacia.");
        }

        return pila.remove(pila.size() - 1);
    }

    public boolean pilavacia() throws AlmacenamientoExcepcion {
        return pila.isEmpty();
    }

    public int size() {
        return pila.size();
    }
}
