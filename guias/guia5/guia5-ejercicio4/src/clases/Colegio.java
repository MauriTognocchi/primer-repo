package clases;

import enums.Nacionalidad;
import excepciones.ColegioException;

import java.util.*;

public class Colegio {
    private List<Alumno> listado = new ArrayList<>();

    public void agregarAlumno(Alumno alumno) throws ColegioException {
        if (alumno == null) {
            throw new ColegioException("ERROR: Alumno nulo.");
        }
        if (alumno.getNacionalidad() == null) {
            throw new ColegioException("ERROR: Nacionalidad nula.");
        }
        if (listado.contains(alumno)) {
            throw new ColegioException("ERROR: Ya existe ese alumno.");
        }

        listado.add(alumno);
    }

    public int verNacionalidad(Nacionalidad n) throws ColegioException {
        if (n == null) {
            throw new ColegioException("ERROR: Nacionalidad nula.");
        }
        int cant = 0;
        for (Alumno alumno : listado) {
            if (alumno.getNacionalidad() == n) {
                cant++;
            }
        }
        return cant;
    }

    public LinkedHashSet<Nacionalidad> cuantos() throws ColegioException {
        if (listado.isEmpty()) {
            throw new ColegioException("ERROR: No hay alumnos listados.");
        }

        LinkedHashSet<Nacionalidad> nacionalidades = new LinkedHashSet<>();
        for (Alumno alumno : listado) {
            nacionalidades.add(alumno.getNacionalidad());
        }
        return nacionalidades;
    }

    public void borrar(Alumno alumno) throws ColegioException {
        if (alumno == null) {
            throw new ColegioException("ERROR: Alumno nulo.");
        }

        if (listado.isEmpty()) {
            throw new ColegioException("ERROR: No hay alumnos listados.");
        }

        boolean flag = false;
        Iterator<Alumno> it = listado.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            if (a.equals(alumno)) {
                it.remove();
                flag = true;
                break;
            }
        }
        if (!flag) {
            throw new ColegioException("ERROR: No se borro el alumno porque no se encontro.");
        }

    }

    public Map<Nacionalidad, Integer> verTodos() throws ColegioException {
        Map<Nacionalidad, Integer> m = new HashMap<>();
        LinkedHashSet<Nacionalidad> n = cuantos();

        for (Nacionalidad nacionalidad : n) {
            int cont = 0;
            for (Alumno alumno : listado) {
                if (alumno.getNacionalidad() == nacionalidad) {
                    cont++;
                }
            }
            m.put(nacionalidad, cont);
        }

        return m ;
    }

    public List<Alumno> getListado() {
        return listado;
    }
}
