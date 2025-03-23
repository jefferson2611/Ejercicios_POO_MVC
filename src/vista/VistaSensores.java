package vista;

public class VistaSensores {
    
    public void mostrarEstado(boolean[] sensores, boolean esDeNoche, boolean alarmaActivada) {
        
        System.out.println("Estado de los sensores: ");
        System.out.println("Sensor 1: " + (sensores[0] ? "Detectando movimiento" : "Sin movimiento"));
        System.out.println("Sensor 2: " + (sensores[1] ? "Detectando movimiento" : "Sin movimiento"));
        System.out.println("Sensor 3: " + (sensores[2] ? "Detectando movimiento" : "Sin movimiento"));
        System.out.println("Es de noche: " + (esDeNoche ? "Sí" : "No"));
        System.out.println("Alarma: " + (alarmaActivada ? "ACTIVADA" : "DESACTIVADA"));
        System.out.println("----------------------------------");
    }

    public void mostrarMenu() {
        
                System.out.println("Menú:");
        System.out.println("1. Actualizar sensores");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
    }

}   