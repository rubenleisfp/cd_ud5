package org.example.biblioteca;

public class Main {
    public static void main(String[] args) {
        // Creación de datos de prueba
        Libro libro1 = new Libro("978-84-376-0494-7", "Don Quijote de la Mancha");
        Libro libro2 = new Libro("978-03-074-7472-8", "Cien años de soledad");

        Socio socio1 = new Socio("12345678A", "Ana García");
        Socio socio2 = new Socio("87654321B", "Carlos López");

        System.out.println("--- ESTADO INICIAL ---");
        System.out.println("¿'" + libro1.getTitulo() + "' disponible? " + libro1.estaDisponible());
        System.out.println("¿'" + libro2.getTitulo() + "' disponible? " + libro2.estaDisponible());

        // Realizamos préstamos
        System.out.println("\n--- REGISTRANDO PRÉSTAMOS ---");
        Prestamo p1 = new Prestamo("2026-03-01", socio1, libro1);
        System.out.println(socio1.getNombre() + " ha tomado prestado '" + libro1.getTitulo() + "'");
        System.out.println("¿'" + libro1.getTitulo() + "' disponible?: " + libro1.estaDisponible());

        // Devolución del libro
        System.out.println("\n--- REGISTRANDO DEVOLUCIÓN ---");
        p1.setFechaDevolucion("2026-03-15");
        System.out.println("Libro devuelto en fecha: " + p1.getFechaDevolucion());
        System.out.println("¿'" + libro1.getTitulo() + "' disponible nuevamente?: " + libro1.estaDisponible());

        // Nuevo préstamo del mismo libro a otro socio
        Prestamo p2 = new Prestamo("2026-03-20", socio2, libro1);
        System.out.println("\n" + socio2.getNombre() + " toma prestado ahora '" + libro1.getTitulo() + "'");
        System.out.println("¿'" + libro1.getTitulo() + "' disponible?: " + libro1.estaDisponible());
    }
}