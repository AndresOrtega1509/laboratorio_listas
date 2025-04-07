package co.edu.uniquindio.laboratorio_listas.ejercicio12;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEnlazadaSimple implements Iterable<Double> {

    private Nodo inicio;

    private static class Nodo {
        double valor;
        Nodo siguiente;

        Nodo(double valor) {
            this.valor = valor;
        }
    }

    // Agrega un número al final de la lista
    public void agregar(double valor) {
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Convierte la lista enlazada a una ArrayList
    public ArrayList<Double> aListaArray() {
        ArrayList<Double> lista = new ArrayList<>();
        Nodo actual = inicio;
        while (actual != null) {
            lista.add(actual.valor);
            actual = actual.siguiente;
        }
        return lista;
    }

    // Para poder recorrer la lista con foreach
    @Override
    public Iterator<Double> iterator() {
        return new Iterator<Double>() {
            Nodo actual = inicio;

            @Override
            public boolean hasNext() {
                return actual != null;
            }

            @Override
            public Double next() {
                double valor = actual.valor;
                actual = actual.siguiente;
                return valor;
            }
        };
    }
}
