import java.util.Scanner;

public class Ej42 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos el número por teclado
    System.out.print("Este programa mostrará los 5 números consecutivos a partir del");
    System.out.println(" número introducido por teclado y determinará si es primo o no.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    boolean esPrimo;
    
    // Salto de línea
    System.out.println();
    
    // Iteramos 5 números consecutivos a partir del número introducido
    for (int i = 0; i < 5; i++) {
      esPrimo = true;
      
      // Comprueba que el número o consecutivos son o no primos
      for (int j = 2; j < numeroIntroducido; j++) {
        if (numeroIntroducido % j == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        System.out.println("El " + numeroIntroducido + " es primo.");
      } else {
        System.out.println("El " + numeroIntroducido + " no es primo.");
      }
      numeroIntroducido++;
    }
  }
} 