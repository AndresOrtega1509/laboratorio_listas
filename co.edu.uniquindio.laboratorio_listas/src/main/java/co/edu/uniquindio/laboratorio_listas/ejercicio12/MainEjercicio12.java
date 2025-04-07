package co.edu.uniquindio.laboratorio_listas.ejercicio12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainEjercicio12 {

    public static void main(String[] args) {

        System.out.println("\n=== Cálculo de Media y Desviación Estándar ===");
        String nombreArchivo = "numeros.txt";
        ListaEnlazadaSimple listaNumeros = cargarNumerosDesdeArchivo(nombreArchivo);
        double media = calcularMedia(listaNumeros);
        double desviacion = calcularDesviacionEstandar(listaNumeros, media);
        System.out.println("Media: " + media);
        System.out.println("Desviación Estándar: " + desviacion);
    }

    // Método para calcular la media de la lista enlazada simple
    public static double calcularMedia(ListaEnlazadaSimple lista) {
        ArrayList<Double> numeros = lista.aListaArray();
        if (numeros.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.size();
    }

    // Método para calcular la desviación estándar
    public static double calcularDesviacionEstandar(ListaEnlazadaSimple lista, double media) {
        ArrayList<Double> numeros = lista.aListaArray();
        if (numeros.isEmpty()) {
            return 0.0;
        }
        double sumaCuadrados = 0.0;
        for (double numero : numeros) {
            sumaCuadrados += Math.pow(numero - media, 2);
        }
        double varianza = sumaCuadrados / numeros.size();
        return Math.sqrt(varianza);
    }

    // Método para leer números de un archivo y almacenarlos en una lista enlazada simple
    public static ListaEnlazadaSimple cargarNumerosDesdeArchivo(String nombreArchivo) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                try {
                    double numero = Double.parseDouble(linea.trim());
                    lista.agregar(numero);
                } catch (NumberFormatException e) {
                    // Saltar líneas que no sean números válidos
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return lista;
    }
}