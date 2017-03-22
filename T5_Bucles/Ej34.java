import java.util.Scanner;

public class Ejercicio34 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    System.out.print("Por favor, introduzca un número: ");
    long numeroIntroducido1 = Long.parseLong(s.nextLine());
    System.out.print("Ahora introduzca otro número (de la misma longitud que el anterior): ");
    long numeroIntroducido2 = Long.parseLong(s.nextLine());
    
    // Declaramos las variables
    long revesPar1 = 0; 
    long revesPar2 = 0; 
    long revesImpar1; 
    long revesImpar2; 
    long numeroPar1;
    long numeroPar2;
    long numeroImpar1;
    long numeroImpar2;
    
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Pone el primer número al revés
    while (numeroIntroducido1 > 0) {
      revesPar1 = (revesPar1 * 10) + (numeroIntroducido1 % 10);
      numeroIntroducido1 /= 10;
    }
    revesImpar1 = revesPar1;
    
    // Pone el segundo número al revés
    while (numeroIntroducido2 > 0) {
      revesPar2 = (revesPar2 * 10) + (numeroIntroducido2 % 10);
      numeroIntroducido2 /= 10;
    }
    revesImpar2 = revesPar2;
    
    System.out.print("El número formado por los dígitos pares es: ");
    
    // Muestra los números pares del primer y segundo número consecutivamente
    while ((revesPar1 > 0) && (revesPar2 > 0)) {
      numeroPar1 = revesPar1 % 10;
      if (numeroPar1 % 2 == 0) {
        System.out.print(numeroPar1);
      }
      numeroPar2 = revesPar2 % 10;
      if (numeroPar2 % 2 == 0) {
        System.out.print(numeroPar2);
      }
      revesPar1 /= 10;
      revesPar2 /= 10;
    }
    
    System.out.print("El número formado por los dígitos impares es: ");
    
    // Muestra los números impares del primer y segundo  número consecutivamente
    while ((revesImpar1 > 0) && (revesImpar2 > 0)) {
      numeroImpar1 = revesImpar1 % 10;
      if (numeroImpar1 % 2 != 0) {
        System.out.print(numeroImpar1);
      }
      numeroImpar2 = revesImpar2 % 10;
      if (numeroImpar2 % 2 != 0) {
        System.out.print(numeroImpar2);
      }
      revesImpar1 /= 10;
      revesImpar2 /= 10;
    }
  }
}