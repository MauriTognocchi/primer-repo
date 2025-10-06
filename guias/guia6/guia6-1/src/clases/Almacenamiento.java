package clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Almacenamiento <T>{
    private List<T> contenido = new ArrayList<>() ;

    public List<T> getContenido() {
        return contenido;
    }

    public void agregarElemento(T elemento){
        contenido.add(elemento);
    }

    public boolean eliminarElemento(T elemento){
        Iterator<T> it = contenido.iterator();
        boolean eliminado = false;
        while (it.hasNext()){
            T elem = it.next();
            if (elem.equals(elemento)){
                it.remove();
                eliminado = true;
                break;
            }
        }
        return eliminado;
    }

    public T buscarElemento(T elemento){
        for (T t : contenido) {
            if (elemento.equals(t)){
                return t;
            }
        }
        return null;
    }

    public void mostrarAlmacenamiento(){
        contenido.forEach(System.out::println);
    }

}
