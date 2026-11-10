package org.example.hotel;


public class Habitacion {
    private int numero;
    private double precioPorNoche;
    private boolean ocupada;


    public Habitacion(int numero, double precioPorNoche) {
        this.numero = numero;
        this.precioPorNoche = precioPorNoche;
    }


    public double getPrecioPorNoche() { return precioPorNoche; }
    public boolean estaLibre() { return !ocupada; }
}
