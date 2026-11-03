package org.example.biblioteca;

class Socio {
    private String dni;
    private String nombre;
    private List<Prestamo> prestamos;

    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }
}