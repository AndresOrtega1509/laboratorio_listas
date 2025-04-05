package co.edu.uniquindio.laboratorio_listas.ejercicio3;

import co.edu.uniquindio.laboratorio_listas.ejercicio1.ListaSimple;

public class MainEjercicio3 {
    public static void main(String[] args) {
        ListaSimple<Integer> numeros = new ListaSimple<>();
        numeros.agregarfinal(10);
        numeros.agregarfinal(7);
        numeros.agregarfinal(4);
        numeros.agregarfinal(9);
        numeros.agregarfinal(0);
        numeros.agregarfinal(3);

        ListaSimple<Integer> resultado = numeros.eliminarNumerosPares(numeros);
        resultado.imprimirLista();
    }
}
