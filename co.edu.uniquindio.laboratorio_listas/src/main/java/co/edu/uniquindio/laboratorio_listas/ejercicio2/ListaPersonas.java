package co.edu.uniquindio.laboratorio_listas.ejercicio2;

import co.edu.uniquindio.laboratorio_listas.ejercicio1.ListaSimple;
import co.edu.uniquindio.laboratorio_listas.ejercicio1.Nodo;

public class ListaPersonas {

    ListaSimple<Persona> lista;

    public ListaPersonas() {
        lista = new ListaSimple<>();
    }

    public void agregarPersona(String nombre, String cedula) {
        lista.agregarfinal(new Persona(nombre, cedula));
    }

    public ListaSimple<Persona> obtenerPersonasConCedulaPar() {
        ListaSimple<Persona> resultado = new ListaSimple<>();
        obtenerPersonasConCedulaParRecursivo(lista.getNodoPrimero(), resultado);
        return resultado;
    }

    private void obtenerPersonasConCedulaParRecursivo(Nodo<Persona> actual, ListaSimple<Persona> resultado) {
        if (actual == null) {
            return;
        }

        if (actual.getValorNodo().tieneCedulaPar()) {
            resultado.agregarfinal(actual.getValorNodo());
        }

        obtenerPersonasConCedulaParRecursivo(actual.getSiguienteNodo(), resultado);
    }
}
