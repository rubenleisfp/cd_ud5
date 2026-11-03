package org.example.biblioteca;

class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Socio socio;
    private Libro libro;

    public Prestamo(String fechaPrestamo, Socio socio, Libro libro) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = null; // Al crearse, aún no ha sido devuelto
        this.socio = socio;
        this.libro = libro;
        
        // Mantener coherencia bidireccional
        socio.agregarPrestamo(this);
        libro.agregarPrestamo(this);
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Socio getSocio() {
        return socio;
    }

    public Libro getLibro() {
        return libro;
    }
}
