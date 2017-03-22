import java.util.Scanner;

public class Ejercicio33 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca la altura de la 'U': ");
    int altura = Integer.parseInt(s.nextLine());
    
    // Declaramos la variable
    int filas = 1;
    
    // Salto de línea
    System.out.println();
    
    // Este bucle iterará los demás hasta que filas sea igual a altura
    while (filas < altura) {
      System.out.print("*");
      
      // Pinta los espacios dentro de la 'U'
      for (int i = 1; i < ((altura*2)-2); i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
      filas++;
    }
    
    System.out.print("  ");
    
    // Pinta la base de la 'U'
    for (int j = 1; j < altura-1; j++) {
      System.out.print("* ");
    }
    System.out.print("  ");
  }
}