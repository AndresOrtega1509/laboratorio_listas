package co.edu.uniquindio.laboratorio_listas.ejercicio7;
import co.edu.uniquindio.laboratorio_listas.ejercicio2.Persona;

import java.util.Iterator;
public class ListaDobleEnlazadaIterator<T> implements Iterable<T> {

    private Nodo cabeza;
    private Nodo cola;

    private class Nodo {
        T dato;
        Nodo anterior;
        Nodo siguiente;

        Nodo(T dato) {
            this.dato = dato;
        }
    }

    // Agrega un nodo al final de la lista
    public void agregar(T dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    // Filtra elementos si T es Persona con cédula de cantidad par de dígitos
    public ListaDobleEnlazadaIterator<T> filtrarPorCantidadParDeDigitos() {
        ListaDobleEnlazadaIterator<T> resultado = new ListaDobleEnlazadaIterator<>();
        for (T elemento : this) {
            if (elemento instanceof Persona persona) {
                int cantidadDigitos = persona.getCedula().length();
                if (cantidadDigitos % 2 == 0) {
                    resultado.agregar(elemento);
                }
            }
        }
        return resultado;
    }

    // Permitir recorrer la lista con foreach
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Nodo actual = cabeza;

            @Override
            public boolean hasNext() {
                return actual != null;
            }

            @Override
            public T next() {
                T dato = actual.dato;
                actual = actual.siguiente;
                return dato;
            }
        };
    }
}
