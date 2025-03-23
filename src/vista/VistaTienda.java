package vista;

import java.time.LocalTime;

public class VistaTienda {
    
    public void mostrarEstado(LocalTime horaActual, boolean accesoPermitido) {
        
        System.out.println("Hora actual: " + horaActual);
        System.out.println("Acceso a la tienda: " + (accesoPermitido ? "PERMITIDO" : "DENEGADO"));
    }
}