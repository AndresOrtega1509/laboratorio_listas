package co.edu.uniquindio.laboratorio_listas.ejercicio13;

public class NodoLista {

    private int dato;
    private NodoLista siguiente;

    public NodoLista(int x, NodoLista n){
        dato = x;
        siguiente = n;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
}
