package co.edu.uniquindio.laboratorio_listas.ejercicio6;

public class NodoDoble<T> {

    private NodoDoble<T> siguiente;
    private NodoDoble<T> anterior;
    private T valor;

    public NodoDoble(T valor){
        siguiente = null;
        anterior = null;
        this.valor = valor;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}
