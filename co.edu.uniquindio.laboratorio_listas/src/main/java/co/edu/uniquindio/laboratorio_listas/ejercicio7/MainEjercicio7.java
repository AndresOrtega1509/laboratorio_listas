package co.edu.uniquindio.laboratorio_listas.ejercicio7;

import co.edu.uniquindio.laboratorio_listas.ejercicio2.Persona;

public class MainEjercicio7 {

    public static void main(String[] args) {

        System.out.println("=== Lista Doble Enlazada de Personas ===");
        ListaDobleEnlazadaIterator<Persona> listaPersonas = new ListaDobleEnlazadaIterator<>();
        listaPersonas.agregar(new Persona("andres", "123456")); // 6 dígitos (par)
        listaPersonas.agregar(new Persona("juan", "789"));      // 3 dígitos (impar)
        listaPersonas.agregar(new Persona("karen", "2468")); // 4 dígitos (par)

        System.out.println("Recorriendo la lista de personas:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}
