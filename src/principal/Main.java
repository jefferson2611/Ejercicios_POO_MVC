package principal;

import modelo.Tienda;
import vista.VistaTienda;
import controlador.ControladorTienda;

public class Main {
    public static void main(String[] args) {
        // Cambia los valores según sea necesario
        Tienda modelo = new Tienda(true, false); // Cliente con membresía
        VistaTienda vista = new VistaTienda();
        ControladorTienda controlador = new ControladorTienda(modelo, vista);

        controlador.iniciarSistema();
    }
}
