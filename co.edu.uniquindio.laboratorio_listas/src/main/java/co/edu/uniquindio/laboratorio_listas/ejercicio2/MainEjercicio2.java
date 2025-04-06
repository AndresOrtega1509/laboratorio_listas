package co.edu.uniquindio.laboratorio_listas.ejercicio2;

import co.edu.uniquindio.laboratorio_listas.ejercicio1.ListaSimple;

public class MainEjercicio2 {
    public static void main(String[] args) {

        ListaPersonas lista = new ListaPersonas();
        lista.agregarPersona("Ana", "12345678");
        lista.agregarPersona("Luis", "987654321");
        lista.agregarPersona("Andres", "112233");
        lista.agregarPersona("Laura", "4444");
        lista.agregarPersona("Karen", "1234");

        ListaSimple<Persona> resultado = lista.obtenerPersonasConCedulaPar();

        System.out.println("Cédulas con cantidad par de caracteres:");
        resultado.imprimirLista();
    }
}
