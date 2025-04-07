package co.edu.uniquindio.laboratorio_listas.ejercicio4;

import co.edu.uniquindio.laboratorio_listas.ejercicio1.ListaSimple;

import java.util.ArrayList;
import java.util.List;

public class MainEjercicio4 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(4);
        numeros.add(7);
        numeros.add(6);
        numeros.add(5);

        ListaSimple<Integer> ListaSimple = obtenerValoresImpares(numeros);

        System.out.println("Valores impares de una lista enlazada de numeros:");
        ListaSimple.imprimirLista();
    }

    private static ListaSimple<Integer> obtenerValoresImpares(List<Integer> numeros) {

        ListaSimple<Integer> ListaSimple = new ListaSimple<>();

        for (int n : numeros){
            if (n % 2 != 0){
                ListaSimple.agregarfinal(n);
            }
        }

        return ListaSimple;
    }
}
