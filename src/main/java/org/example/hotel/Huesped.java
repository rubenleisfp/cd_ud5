package org.example.hotel;


import java.util.ArrayList;
import java.util.List;


public class Huesped extends Persona {
    private String telefono;
    private List<Reserva> reservas = new ArrayList<>();


    public Huesped(String dni, String nombre, String telefono) {
        super(dni, nombre);
        this.telefono = telefono;
    }


    public void anadirReserva(Reserva r) { reservas.add(r); }
}
