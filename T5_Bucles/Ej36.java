import java.util.Scanner;

public class Ejercicio36 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Este programa determinará si el número introducido es o no capicúa");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("Por favor, introduzca un número: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    // Declaramos las variables
    long reves = 0; // Almacena el número al revés
    long numero = numeroIntroducido;
    
    // Pone el número al revés
    while (numeroIntroducido > 0) {
      reves = (reves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    // Si el número introducido es igual al número al revés, entonces el número introducido será capicúa
    if (numero == reves) {
      System.out.println("\nEl " + numero + " es capicúa.");
    } else {
      System.out.println("\nEl " + numero + " no es capicúa.");
    }
  }
}