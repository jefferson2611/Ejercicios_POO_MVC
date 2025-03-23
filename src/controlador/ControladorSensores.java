package controlador;

import modelo.ModeloSensores;
import vista.VistaSensores;
import java.util.Scanner;

public class ControladorSensores {
    private final ModeloSensores modelo;
    private final VistaSensores vista;
    private final Scanner scanner;

    public ControladorSensores(ModeloSensores modelo, VistaSensores vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner = new Scanner(System.in);
    }

    public void iniciarSistema() {
        boolean ejecutando = true;

        while (ejecutando) {
            vista.mostrarMenu();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    modelo.actualizarSensores();
                    modelo.verificarAlarma();
                    vista.mostrarEstado(modelo.getSensoresEstado(), modelo.isEsDeNoche(), modelo.isAlarmaActivada());
                }
                case 2 -> {
                    ejecutando = false;
                    System.out.println("Saliendo del sistema...");
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}