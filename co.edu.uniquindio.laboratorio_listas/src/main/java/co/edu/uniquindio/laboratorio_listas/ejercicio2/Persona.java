package co.edu.uniquindio.laboratorio_listas.ejercicio2;

import co.edu.uniquindio.laboratorio_listas.ejercicio1.ListaSimple;

public class Persona {

    private String nombre;
    private Integer cedula;

    public Persona(String nombre, Integer cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }


    public String getNombre() {
        return nombre;
    }

    public Integer getCedula() {
        return cedula;
    }

    public static ListaSimple obtenerListaCedulasConCantidadNumerosPar(ListaSimple<Persona> personas){
        ListaSimple listaSimple = new ListaSimple<>();
        ListaSimple<Integer> listaCedulas = new ListaSimple<>();
        for (Persona cedulas : personas){
            if(cedulas != null){
            listaCedulas.agregarfinal(cedulas.getCedula());
            }
        }
        return listaSimple.filtrarElementosConLongitudPar(listaCedulas);
    }
}
