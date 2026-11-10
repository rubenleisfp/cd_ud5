package org.example.hotel;


public class Reserva implements Facturable {
    private String fechaEntrada;
    private int noches;
    private Habitacion habitacion;


    public Reserva(String fechaEntrada, int noches, Habitacion habitacion) {
        this.fechaEntrada = fechaEntrada;
        this.noches = noches;
        this.habitacion = habitacion;
    }


    @Override
    public double calcularImporte() {
        return habitacion.getPrecioPorNoche() * noches;
    }


    public double aplicarDescuento(Descuento d) {
        return calcularImporte() * (1 - d.getPorcentaje() / 100);
    }
}
