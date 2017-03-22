import java.util.Scanner;

public class Ej46 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("Este programa pintará un rectángulo hueco dada una altura y una");
    System.out.println(" anchura por teclado, ambas deben ser mayor o iguales que 2.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("Por favor, introduzca la anchura del rectángulo (mínimo 2): ");
    int anchura = Integer.parseInt(s.nextLine());
    System.out.print("Ahora introduzca la altura (mínimo 2): ");
    int altura = Integer.parseInt(s.nextLine());
    
    // Comprueba que la anchura o altura del rectángulo sean mínimo 2
    if ((anchura < 2) || (altura < 2)) {
      System.out.print("\nLo siento, los datos introducidos no son correctos, el valor mínimo para");
      System.out.print(" la anchura y la altura es 2.");
    } else {
      System.out.println();
      
      // Pinta el rectángulo
      for (int i = 1; i <= altura; i++) {
        System.out.print("* ");
        if ((i == 1) || (i == altura)) {
          for (int j = 1; j < anchura; j++) {
            System.out.print("* ");
          }
        } else {
          for (int k = 2; k < ((anchura*2)-2); k++) {
            System.out.print(" ");
          }
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}