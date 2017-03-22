import java.util.Scanner;

public class Ej43 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.println("Este programa partirá en dos a un número introducido por teclado.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    System.out.print("Ahora introduzca la posición a partir de la cual quiere partir el número: ");
    int posicion = Integer.parseInt(s.nextLine());
    
    // Declaramos las variables
    long numeroReves = 0; // Almacena el número al revés
    long numeroPartido1 = 0; // Almacena la primera partición del número
    long numeroPartido2 = 0; // Almacena la segunda partición del número
    
    // Pone el número al revés
    while (numeroIntroducido > 0) {
      numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    // Realiza la primera partición del número hasta la posición introducida
    for (int i = 1; i < posicion; i++) {
      numeroPartido1 = (numeroPartido1 * 10) + (numeroReves % 10);
      numeroReves /= 10;
    }
    
    // Realiza la segunda partición del número después de la posición introducida
    while (numeroReves > 0) {
      numeroPartido2 = (numeroPartido2 * 10) + (numeroReves % 10);
      numeroReves /= 10;
    }
    System.out.print("\nLos números partidos son el " + numeroPartido1 + " y el " + numeroPartido2);
  }
}