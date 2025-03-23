package principal;

import modelo.Temperatura;
import vista.V_temperatura;
import controlador.C_temperatura;

public class Main_temperatura {
    public static void main(String[] args) {
        Temperatura modelo = new Temperatura(20);
        V_temperatura vista = new V_temperatura();
        C_temperatura controlador = new C_temperatura(modelo, vista);
        
        controlador.iniciarMonitor();
    }
}