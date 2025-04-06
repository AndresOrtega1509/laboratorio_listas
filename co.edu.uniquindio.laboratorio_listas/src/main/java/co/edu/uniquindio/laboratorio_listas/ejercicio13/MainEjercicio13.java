package co.edu.uniquindio.laboratorio_listas.ejercicio13;

public class MainEjercicio13 {

    public static void main(String[] args) {

        NodoLista n8 = new NodoLista(4, null);
        NodoLista n7 = new NodoLista(4, n8);
        NodoLista n6 = new NodoLista(5, n7);
        NodoLista n5 = new NodoLista(4, n6);
        NodoLista n4 = new NodoLista(8, n5);
        NodoLista n3 = new NodoLista(6, n4);
        NodoLista n2 = new NodoLista(4, n3);
        NodoLista n1 = new NodoLista(9, n2);

        Lista lista = new Lista();
        lista.inicio = n1;

        int clave = 4;
        int distancia = lista.obtenerMaximaDistancia(clave);
        System.out.println("Máxima distancia entre elementos con clave " + clave + " es: " + distancia);
    }

}
