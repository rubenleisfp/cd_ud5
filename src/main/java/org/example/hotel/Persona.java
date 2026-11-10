package org.example.hotel;

public abstract class Persona {
    protected String dni;
    protected String nombre;


    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }


    public String getNombre() { return nombre; }
}
