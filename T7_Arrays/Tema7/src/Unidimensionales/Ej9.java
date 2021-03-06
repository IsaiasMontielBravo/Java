
import java.util.Scanner;

/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
con la palabra “par” o “impar” según proceda.
 *
 *
 */
public class Ej9 {
  public static void main(String[] args) {
       Scanner entrada =new Scanner(System.in);
    System.out.println("Este programa muestra si un número es par o impar.");
    
    int num[] = new int [8];
    for (int x = 0; x < 8; x++) {
      System.out.print("Por favor, introduzca un número: ");
      num[x] = entrada.nextInt();
    }   //pide los números
    
    for (int x = 0; x < 8; x++) {
      System.out.print("El número " + num[x] + " es: ");
      if ((num[x] % 2) == 0) {
        System.out.print("Par");
      } else {
        System.out.print("Impar");
      }
      System.out.println();
    } //Los muestra y dice si es par o impar
  }
}
