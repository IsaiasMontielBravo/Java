
import java.util.Scanner;

/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
determinado año y que muestre a continuación un diagrama de barras horizontales con
esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
carácter.
 *
 * 
 */
public class Ej8 {
  public static void main(String[] args) {
      Scanner entrada =new Scanner(System.in);
    System.out.println("Este programa muestra la media de temperatura de un mes con barras horizontales.");
    
    String mes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Ocutubre", "Noviembre", "Diciembre"};
    int temperatura[] = new int [12];
    for (int x = 0; x < 12; x++) {
      System.out.print("Por favor, introduzca la temperatura media de " + mes[x] + ": ");
      temperatura[x] = entrada.nextInt();
    }   //pide la temperatura
    
    for (int x = 0; x < 12; x++) {
      System.out.printf("%13s",mes[x]);
      System.out.print(": ");
      for (int i = 1; i <= temperatura[x]; i++) {
        System.out.print("█");
      }
      System.out.print(temperatura[x] + "º");
      System.out.println();
    }
  }
}
