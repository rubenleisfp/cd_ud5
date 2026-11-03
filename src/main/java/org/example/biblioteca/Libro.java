package org.example.biblioteca;

import java.util.ArrayList;
import java.util.List;

class Libro {
    private String isbn;
    private String titulo;
    private List<Prestamo> prestamos;

    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.prestamos = new ArrayList<>();
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    // Un libro está disponible si no tiene ningún préstamo activo (sin fecha de devolución)
    public boolean estaDisponible() {
        for (Prestamo p : prestamos) {
            if (p.getFechaDevolucion() == null) {
                return false;
            }
        }
        return true;
    }
}