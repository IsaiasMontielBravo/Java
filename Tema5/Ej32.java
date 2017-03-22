import java.util.Scanner;

public class Ejercicio32 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println(" introducido por teclado y también los sumará.");
    System.out.println("-----------------------------------------------------------------------------");
    
    // Declaramos las variables
    long numeroIntroducido;
    long reves = 0; // Para almacenar el número al revés
    long suma = 0; // Para sumar los dígitos pares
    
    // Comprueba que el número introducido es entero y positivo
    do {
      System.out.print("\nPor favor, introduzca un número entero positivo: ");
      numeroIntroducido = Long.parseLong(s.nextLine());  
    } while (numeroIntroducido < 0);
    
    // Pone el número al revés
    while (numeroIntroducido > 0) {
      reves = (reves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    System.out.print("\nDígitos pares: ");
    
    // Muestra los números pares y la suma de éstos
    while (reves > 0) {
      long par = reves % 10;
      if (par % 2 == 0) {
        System.out.print(par + " ");
        suma = suma + par;
      }
      reves /= 10;
    }
    System.out.println("\nSuma de los dígitos pares: " + suma);
  } 
}