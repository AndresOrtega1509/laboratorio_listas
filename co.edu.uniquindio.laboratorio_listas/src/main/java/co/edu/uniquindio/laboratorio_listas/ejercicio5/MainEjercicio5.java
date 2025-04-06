package co.edu.uniquindio.laboratorio_listas.ejercicio5;

import co.edu.uniquindio.laboratorio_listas.ejercicio1.ListaSimple;

public class MainEjercicio5 {

    public static void main(String[] args) {

        ListaSimple<Integer> listaSimple = new ListaSimple<>();

        listaSimple.agregarInicio(4);
        listaSimple.agregarInicio(7);
        listaSimple.agregarInicio(4);
        listaSimple.agregarInicio(3);

        int valorABuscar = 4;
        int cantidadRepetida = listaSimple.obtenerCantidadValorRepetido(valorABuscar);

        System.out.println("La cantidad de veces que se repite el valor buscado son: " + cantidadRepetida);
    }
}
