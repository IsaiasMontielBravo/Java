import java.util.Scanner;

public class Ejercicio39 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos el número por teclado
    System.out.print("Este programa mostrará al número introducido junto con los anteriores,");
    System.out.println(" y con sus correspondientes factoriales");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    
    // Declaramos las variables
    int contador = 1; 
    int factorial = 1; 
    
    // Realiza el factorial de cada número desde el 1 hasta el número introducido
    while (contador <= numeroIntroducido) {
      for (int i = contador-1; i >= 1; i--) {
        factorial = factorial * i;
      }
      System.out.print(contador + "! = ");
      System.out.print(factorial);
      contador++;
      factorial = contador;
      System.out.println();
    }
  }
}
