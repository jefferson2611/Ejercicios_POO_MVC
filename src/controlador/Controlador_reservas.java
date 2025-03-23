package controlador;
import modelo.Sala;
import vista.Reservas;

public class Controlador_reservas {
    private final Sala sala;
    private final Reservas vista;

    public Controlador_reservas(Sala sala, Reservas vista) {
        this.sala = sala;
        this.vista = vista;
    }

    public void iniciarSistema() {
        while (sala.hayAsientosDisponibles()) {
            vista.mostrarAsientos(sala);
            int numero = vista.pedirNumeroAsiento();
            sala.reservarAsiento(numero);
            vista.mostrarMensaje("Asiento " + numero + " reservado.");
        }
        vista.mostrarMensaje("La sala está llena. No hay más asientos disponibles.");
    }
}