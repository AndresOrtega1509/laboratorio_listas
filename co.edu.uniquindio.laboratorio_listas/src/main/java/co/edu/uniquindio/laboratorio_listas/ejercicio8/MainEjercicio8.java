package co.edu.uniquindio.laboratorio_listas.ejercicio8;

import co.edu.uniquindio.laboratorio_listas.ejercicio2.Persona;
import co.edu.uniquindio.laboratorio_listas.ejercicio7.ListaDobleEnlazadaIterator;

public class MainEjercicio8 {
    public static void main(String[] args) {

        System.out.println("=== Lista Doble Enlazada de Personas ===");
        ListaDobleEnlazadaIterator<Persona> listaPersonas = new ListaDobleEnlazadaIterator<>();
        listaPersonas.agregar(new Persona("andres", "123456")); // 6 dígitos (par)
        listaPersonas.agregar(new Persona("juan", "789"));      // 3 dígitos (impar)
        listaPersonas.agregar(new Persona("karen", "2468")); // 4 dígitos (par)

        ListaDobleEnlazadaIterator<Persona> filtradas = listaPersonas.filtrarPorCantidadParDeDigitos();
        System.out.println("\nPersonas con cédula de cantidad par de dígitos:");
        for (Persona persona : filtradas) {
            System.out.println(persona);
        }

    }
}
