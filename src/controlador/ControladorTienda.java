package controlador;

import modelo.Tienda;
import vista.VistaTienda;

public class ControladorTienda {
    private final Tienda modelo;
    private final VistaTienda vista;

    public ControladorTienda(Tienda modelo, VistaTienda vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciarSistema() {
        while (true) {
            boolean acceso = modelo.verificarAcceso();
            vista.mostrarEstado(modelo.getHoraActual(), acceso);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
        }
    }
}