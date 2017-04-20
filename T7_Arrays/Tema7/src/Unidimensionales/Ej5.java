
import java.util.Scanner;

/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números
introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo
respectivamente.
 *
 * 
 */
public class Ej5 {
  public static void main(String[] args) {
       Scanner entrada =new Scanner(System.in);
    System.out.println("Este programa lee números y muestra si es mínimo o máximo.");
    
    int num[] = new int [10];
    int max = 0;
    int min = 0;
    
    for (int x = 0; x < 10; x++) {
      System.out.print("Por favor, introduzca un número: ");
      num[x] =  entrada.nextInt();
      if (x == 0) {
        min = num[x];     //Se inicializan el máximo y el mínimo con el primer número introducido
        max = num[x];
      }
      if (num[x] > max) {
        max = num[x];
      }
      if (num[x] < min) {
        min = num [x];
      }
    }
    
    for (int x = 0; x < 10; x++) {
      System.out.print("La posición " + x + " del array es: " + num[x]);
      if (num[x] == max) {
        System.out.print(" Este es el máximo número introducido");
      }
      if (num[x] == min) {
        System.out.print(" Este es el mínimo número introducido");
      }
      System.out.println();
    }
  }
}
