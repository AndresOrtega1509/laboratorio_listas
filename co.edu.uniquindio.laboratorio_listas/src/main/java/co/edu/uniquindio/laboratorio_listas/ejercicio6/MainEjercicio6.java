package co.edu.uniquindio.laboratorio_listas.ejercicio6;

public class MainEjercicio6 {
    public static void main(String[] args) {

        ListaDobleEnlazada<Integer> listaDobleEnlazada = new ListaDobleEnlazada<>();

        listaDobleEnlazada.agregarAlInicio(5);
        listaDobleEnlazada.agregarAlInicio(7);
        listaDobleEnlazada.agregarAlInicio(4);
        listaDobleEnlazada.agregarAlInicio(3);

        System.out.println("Impresión hacia atrás de una lista doblemente enlazada:");
        listaDobleEnlazada.imprimirHaciaAtras();

    }
}
