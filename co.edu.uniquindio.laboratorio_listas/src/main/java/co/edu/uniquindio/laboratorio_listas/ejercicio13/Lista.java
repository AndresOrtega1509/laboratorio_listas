package co.edu.uniquindio.laboratorio_listas.ejercicio13;

public class Lista {

    NodoLista inicio;

    public Lista(){
        inicio = null;
    }

    public int obtenerMaximaDistancia(int clave){
        int maxDistancia = maximaDistanciaRecursivo(inicio, clave,0,0, 0);
        return maxDistancia;
    }

    /**
     * Metodo recursivo para que calcula la máxima distancia entre dos nodos con
     * un valor específico en una lista enlazada.
     * @param nodo: El nodo actual
     * @param x:  El valor buscado en la lista
     * @param distancia:  La distancia acumulada desde el último nodo con valor x
     * @param maxDistancia: La máxima distancia encontrada hasta el momento
     * @param encontrado: Bandera que indica si ya se ha encontrado al menos un nodo con valor x
     * @return maxDistancia
     */
    private int maximaDistanciaRecursivo(NodoLista nodo, int x, int distancia, int maxDistancia,int
                                         encontrado) {
        if (nodo == null) {
            return maxDistancia;
        }
        if (nodo.getDato() == x) {
            if (encontrado == 1 && distancia > maxDistancia) {
                    maxDistancia = distancia;
            }
            encontrado = 1;
            distancia = 1;
        } else if (encontrado == 1) {
            distancia++; // Solo se incrementa si ya se había encontrado un x antes
        }

        return maximaDistanciaRecursivo(nodo.getSiguiente(), x, distancia, maxDistancia, encontrado);

    }
}
