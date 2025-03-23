package modelo;

public class Asiento {
    private int numero;
    private boolean ocupado;

    public Asiento(int numero) {
        this.numero = numero;
        this.ocupado = false;
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    public void reservar() {
        if (!ocupado) {
            ocupado = true;
        }
    }

    public int getNumero() {
        return numero;
    }
}