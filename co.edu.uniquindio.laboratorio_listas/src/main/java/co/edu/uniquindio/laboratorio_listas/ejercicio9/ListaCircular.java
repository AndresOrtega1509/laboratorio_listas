package co.edu.uniquindio.laboratorio_listas.ejercicio9;

public class ListaCircular<T> {

    private Nodo ultimo;

    private class Nodo {
        T dato;
        Nodo siguiente;

        Nodo(T dato) {
            this.dato = dato;
        }
    }

    // Inserta un nuevo elemento en la lista
    public void insertar(T dato) {
        Nodo nuevo = new Nodo(dato);
        if (ultimo == null) {
            ultimo = nuevo;
            ultimo.siguiente = ultimo;
        } else {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    // Imprime el contenido de la lista circular
    public void imprimirLista() {
        if (ultimo == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = ultimo.siguiente;
        do {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);
        System.out.println();
    }

    // Busca un valor en la lista circular
    public T buscar(T valor) {
        if (ultimo == null) return null;

        Nodo actual = ultimo.siguiente;
        do {
            if (actual.dato.equals(valor)) {
                return actual.dato;
            }
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);

        return null;
    }
}
