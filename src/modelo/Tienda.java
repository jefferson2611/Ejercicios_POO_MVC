package modelo;

import java.time.LocalTime;

public class Tienda {
    private final boolean tieneMembresia;
    private final boolean esEmpleado;
    private LocalTime horaActual;
    private final LocalTime horaApertura = LocalTime.of(8, 0);
    private final LocalTime horaCierre = LocalTime.of(22, 0);

    public Tienda(boolean tieneMembresia, boolean esEmpleado) {
        this.tieneMembresia = tieneMembresia;
        this.esEmpleado = esEmpleado;
        this.horaActual = LocalTime.now();
    }

    public void actualizarHora() {
        this.horaActual = LocalTime.now();
    }

    public boolean verificarAcceso() {
        actualizarHora();
        boolean dentroHorario = (horaActual.isAfter(horaApertura) && horaActual.isBefore(horaCierre));
        return (tieneMembresia && dentroHorario) || esEmpleado;
    }

    public LocalTime getHoraActual() {
        return horaActual;
    }
}