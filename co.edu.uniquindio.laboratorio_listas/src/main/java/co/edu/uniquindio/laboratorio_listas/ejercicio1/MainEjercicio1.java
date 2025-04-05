package co.edu.uniquindio.laboratorio_listas.ejercicio1;

public class MainEjercicio1 {
    public static void main(String[] args) {

        ListaSimple<Integer> lista = new ListaSimple<>();
        lista.agregarfinal(0);
        lista.agregarfinal(1);
        lista.agregarfinal(2);
        lista.agregarfinal(3);
        lista.agregarfinal(4);
        lista.agregarfinal(5);
        lista.agregarfinal(21);
        lista.agregarfinal(22);
        lista.agregarfinal(23);
        System.out.println("Lista original:");
        lista.imprimirLista();
        ListaSimple<Integer> impares = lista.obtenerElementosEnPosicionesImpares(lista);
        System.out.println("Los Elementos en las posiciones impares son:");
        impares.imprimirLista();
    }
}