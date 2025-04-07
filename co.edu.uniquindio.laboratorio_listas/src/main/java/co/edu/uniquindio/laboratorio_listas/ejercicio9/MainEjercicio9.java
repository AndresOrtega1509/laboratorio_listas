package co.edu.uniquindio.laboratorio_listas.ejercicio9;

public class MainEjercicio9 {

    public static void main(String[] args) {

        System.out.println("\n=== Lista Circular ===");
        ListaCircular<Integer> listaCircular = new ListaCircular<>();
        listaCircular.insertar(10);
        listaCircular.insertar(20);
        listaCircular.insertar(30);
        System.out.print("Contenido de la lista circular: ");
        listaCircular.imprimirLista();
        int valorBuscado = 20;
        Integer encontrado = listaCircular.buscar(valorBuscado);
        if (encontrado != null) {
            System.out.println("Valor " + valorBuscado + " encontrado en la lista circular.");
        } else {
            System.out.println("Valor " + valorBuscado + " no encontrado en la lista circular.");
        }
    }
}
