package co.edu.uniquindio.laboratorio_listas.ejercicio11;

import co.edu.uniquindio.laboratorio_listas.ejercicio1.ListaSimple;

import static co.edu.uniquindio.laboratorio_listas.ejercicio11.TerminoPolinomio.tablaValoresPolinomio;

public class MainEjercicio11 {
    public static void main(String[] args) {
        ListaSimple<TerminoPolinomio> polinomio = new ListaSimple<>();
        // 3x^4 - 4x^2+11
        polinomio.agregarfinal(new TerminoPolinomio(3, 4));
        polinomio.agregarfinal(new TerminoPolinomio(-4, 2));
        polinomio.agregarfinal(new TerminoPolinomio(11, 0));

        tablaValoresPolinomio(polinomio);
    }
}
