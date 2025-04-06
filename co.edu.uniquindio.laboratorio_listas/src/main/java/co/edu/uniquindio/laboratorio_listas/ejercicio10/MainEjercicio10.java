package co.edu.uniquindio.laboratorio_listas.ejercicio10;

import co.edu.uniquindio.laboratorio_listas.ejercicio1.ListaSimple;

public class MainEjercicio10 {

    public static void main(String[] args) {
        ListaSimple<Integer> lista1 = new ListaSimple<>();
        lista1.agregarfinal(1);
        lista1.agregarfinal(2);
        lista1.agregarfinal(3);

        ListaSimple<Integer> lista2 = new ListaSimple<>();
        lista2.agregarfinal(4);
        lista2.agregarfinal(5);
        lista2.agregarfinal(6);

        ListaSimple<Integer> concatenado = lista1.concatenarListas(lista1, lista2);

        System.out.println("Lista concatenada:");
        concatenado.imprimirLista();
    }

}
