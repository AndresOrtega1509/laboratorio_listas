package co.edu.uniquindio.laboratorio_listas.ejercicio2;

import co.edu.uniquindio.laboratorio_listas.ejercicio1.ListaSimple;

import static co.edu.uniquindio.laboratorio_listas.ejercicio2.Persona.obtenerListaCedulasConCantidadNumerosPar;

public class MainEjercicio2 {
    public static void main(String[] args) {

        ListaSimple<Persona> personas = new ListaSimple<>();
        personas.agregarfinal(new Persona("Ana", 12345678));
        personas.agregarfinal(new Persona("Luis", 987654321));
        personas.agregarfinal(new Persona("Pedro", 112233));
        personas.agregarfinal(new Persona("Laura", 4444));
        personas.agregarfinal(new Persona("Karen", 1234));

        ListaSimple res = obtenerListaCedulasConCantidadNumerosPar(personas);

        System.out.println("Cédulas con cantidad par de caracteres:");
        res.imprimirLista();
    }
}
