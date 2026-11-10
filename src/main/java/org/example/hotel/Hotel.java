package org.example.hotel;


import java.util.ArrayList;
import java.util.List;


public class Hotel {
    private String nombre;
    private List<Habitacion> habitaciones = new ArrayList<>();
    private List<Huesped> huespedes = new ArrayList<>();


    public Hotel(String nombre) { this.nombre = nombre; }


    public void registrarHuesped(Huesped h) { huespedes.add(h); }
}
