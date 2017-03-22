import java.util.Scanner;

public class Ejercicio37 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("conversor del sistema decimal al sistema de palotes.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    // Declaramos las variables
    long reves = 0; // Almacena el número al revés
    long palote; // Almacena el número que se convertirá en palote
    
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Pone el número al revés
    while (numeroIntroducido > 0) {
      reves = (reves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    // Transforma los números uno a uno en palotes
    while (reves > 0) {
      palote = reves % 10;
      for (int i = 0; i < palote; i++) {
        System.out.print("|");
      }
      System.out.print(" - ");
      reves /= 10;
    }
  }
}