package controlador;

import modelo.Temperatura;
import vista.V_temperatura;
import java.util.Random;

public class C_temperatura {
    private final Temperatura modelo;
    private final V_temperatura vista;
    private final Random random;

    public C_temperatura(Temperatura modelo, V_temperatura vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.random = new Random();
    }

    public void iniciarMonitor() {
        while (true) {
            // Simula temperatura entre 5°C y 35°C
            double nuevaTemperatura = 5 + random.nextDouble() * 30; 
            modelo.setTemperatura(nuevaTemperatura);
            String estado = modelo.obtenerEstado();
            vista.mostrarTemperatura(nuevaTemperatura, estado);

            try {
                // Espera 5 segundos
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                System.out.println("Error en la espera.");
            }
        }
    }
}