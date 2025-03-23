package modelo;
import java.util.ArrayList;

public class Sala {
    private ArrayList<Asiento> asientos;

    public Sala(int capacidad) {
        asientos = new ArrayList<>();
        for (int i = 1; i <= capacidad; i++) {
            asientos.add(new Asiento(i));
        }
    }

    public boolean hayAsientosDisponibles() {
        for (Asiento asiento : asientos) {
            if (!asiento.estaOcupado()) {
                return true;
            }
        }
        return false;
    }

    public void reservarAsiento(int numero) {
        if (numero > 0 && numero <= asientos.size()) {
            Asiento asiento = asientos.get(numero - 1);
            if (!asiento.estaOcupado()) {
                asiento.reservar();
            }
        }
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }
}