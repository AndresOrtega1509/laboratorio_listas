package co.edu.uniquindio.laboratorio_listas.ejercicio7;

import co.edu.uniquindio.laboratorio_listas.ejercicio2.Persona;

public class MainEjercicio7 {

    public static void main(String[] args) {

        System.out.println("=== Lista Doble Enlazada Iterator de palabras ===");
        ListaDobleEnlazadaIterator<String> lista = new ListaDobleEnlazadaIterator<>();
        lista.agregar("Hola");
        lista.agregar("Como");
        lista.agregar("Está?");

        System.out.println("Recorriendo la lista:");
        for (String palabra : lista) {
            System.out.println(palabra);
        }
    }
}
