package co.edu.uniquindio.laboratorio_listas.ejercicio6;

import java.util.NoSuchElementException;

public class ListaDobleEnlazada<T> {

    private NodoDoble<T> nodoPrimero;
    private NodoDoble<T> nodoUltimo;
    private int tamanio;

    public ListaDobleEnlazada(){
        nodoPrimero = null;
        nodoUltimo = null;
        tamanio = 0;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void agregarAlInicio(T valor){
        NodoDoble<T> nuevo = new NodoDoble<>(valor);

        if (nodoUltimo == null) {
            nodoPrimero = nuevo;
            nodoUltimo = nuevo;
        } else {

            nuevo.setSiguiente(nodoPrimero);
            nodoPrimero.setAnterior(nuevo);
            nodoPrimero = nuevo;
        }
        tamanio++;

    }

    public void agregarAlFinal(T valor){
        NodoDoble<T> nuevo = new NodoDoble<>(valor);
        if (nodoUltimo == null) {
            nodoPrimero = nuevo;
        } else {
            nodoUltimo.setSiguiente(nuevo);
            nuevo.setAnterior(nodoUltimo);
        }
        nodoUltimo = nuevo;
        tamanio++;
    }

    public void imprimirHaciaAtras() {

        NodoDoble<T> actual = nodoUltimo;

        if (nodoPrimero == null) {
            throw new NoSuchElementException("La lista está vacía");
        }

        while (actual != null){
            System.out.println(actual.getValor());
            actual = actual.getAnterior();
        }
    }
}
