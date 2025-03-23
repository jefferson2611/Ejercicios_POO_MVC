package vista;

import java.util.Scanner;
import modelo.Sala;
import modelo.Asiento; 

public class Reservas {
    private Scanner scanner;

    public Reservas() {
        scanner = new Scanner(System.in);
    }

    public int pedirNumeroAsiento() {
        System.out.print("Ingrese el número de asiento que desea reservar: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Ingrese un número válido.");
            scanner.next(); 
        }
        
        return scanner.nextInt();
    }

    public void mostrarAsientos(Sala sala) {
        System.out.print("Estado de los asientos: ");
        for (Asiento asiento : sala.getAsientos()) {
            System.out.print("[" + asiento.getNumero() + (asiento.estaOcupado() ? "X" : "O") + "] ");
        }
        System.out.println();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
