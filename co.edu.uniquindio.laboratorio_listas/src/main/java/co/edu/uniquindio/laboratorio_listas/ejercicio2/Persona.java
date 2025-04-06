package co.edu.uniquindio.laboratorio_listas.ejercicio2;

import co.edu.uniquindio.laboratorio_listas.ejercicio1.ListaSimple;

public class Persona {

    private String nombre;
    private String cedula;

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }


    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public boolean tieneCedulaPar(){
        return cedula.length() % 2 == 0;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }
}
