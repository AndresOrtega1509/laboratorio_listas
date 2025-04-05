package co.edu.uniquindio.laboratorio_listas.ejercicio11;

import co.edu.uniquindio.laboratorio_listas.ejercicio1.ListaSimple;

public class TerminoPolinomio {

    private double coeficiente;
    private int exponente;

    public TerminoPolinomio(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public int getExponente() {
        return exponente;
    }

    @Override
    public String toString() {
        return coeficiente + "x^" + exponente;
    }

    public double evaluar(double x) {
        return coeficiente * Math.pow(x, exponente);
    }

    public static void tablaValoresPolinomio(ListaSimple<TerminoPolinomio> polinomio) {
        System.out.println("x\t\t\t\tP(x)");
        System.out.println("------------------------");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double resultado = 0.0;
            for (TerminoPolinomio termino : polinomio) {
                resultado += termino.evaluar(x);
            }
            System.out.printf("%.1f\t\t\t\t%.4f\n", x, resultado);
        }
    }
}
