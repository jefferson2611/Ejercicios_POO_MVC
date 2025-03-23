package modelo;

import java.util.Random;

public class ModeloSensores {
    private boolean sensor1;
    private boolean sensor2;
    private boolean sensor3;
    private boolean esDeNoche;
    private boolean alarmaActivada;

    public ModeloSensores() {
        this.sensor1 = false;
        this.sensor2 = false;
        this.sensor3 = false;
        this.esDeNoche = false;
        this.alarmaActivada = false;
    }

    public void actualizarSensores() {
        Random random = new Random();
        this.sensor1 = random.nextBoolean();
        this.sensor2 = random.nextBoolean();
        this.sensor3 = random.nextBoolean();
        this.esDeNoche = random.nextBoolean();
    }

    public boolean verificarAlarma() {
        int sensoresActivos = (sensor1 ? 1 : 0) + (sensor2 ? 1 : 0) + (sensor3 ? 1 : 0);
        alarmaActivada = sensoresActivos >= 2 && esDeNoche;
        return alarmaActivada;
    }

    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }

    public boolean isEsDeNoche() {
        return esDeNoche;
    }

    public boolean[] getSensoresEstado() {
        return new boolean[]{sensor1, sensor2, sensor3};
    }
}