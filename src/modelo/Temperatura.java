package modelo;

public class Temperatura {
    private double temperatura;

    public Temperatura(double temperaturaInicial) {
        this.temperatura = temperaturaInicial;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String obtenerEstado() {
        if (temperatura < 10) {
            return "Calefactor activado";
        } else if (temperatura > 25) {
            return "Ventilador activado";
        } else {
            return "Sistema inactivo";
        }
    }
}