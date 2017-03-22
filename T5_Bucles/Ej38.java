import java.util.Scanner;

public class Ejercicio38 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("Este programa pintará una 'X' con una altura impar mayor o igual");
    System.out.println(" a 3 introducida por usted");
    System.out.println("-----------------------------------------------------------------------------");
    
    int altura; 
    int filas1 = 1; 
    int filas2 = 1; 
    int interior2 = 3; 
    
    // Comprobamos que la altura introducida por teclado sea igual a 3 o mayor
    do {
      System.out.print("Por favor, introduzca la altura de la 'X' (impar mayor o igual a 3): ");
      altura = Integer.parseInt(s.nextLine());
    } while ((altura < 3) || (altura % 2 == 0));
    
    int interior1 = altura; // Para la parte superior del reloj
    int espaciosFuera = altura/2; // Para los espacios exteriores de la parte inferior del reloj
    
    System.out.println("-----------------------------------------------------------------------------\n");
    
    
    while (filas1 <= ((altura/2)+1)) {
        
      // Pintamos los espacios exteriores de la parte superior del reloj
      for (int i = 1; i < filas1; i++) { 
        System.out.print(" ");
      }
      
      // Pintamos la parte superior del reloj  
      for (int j = 0; j < interior1; j++) {
        System.out.print("*");
      }
      filas1++;
      interior1 -= 2; 
      System.out.println();
    }
    
    
    while (filas2 <= altura/2) {
      
      
      for (int k = 1; k < espaciosFuera; k++) {
        System.out.print(" ");
      }
      
      
      for (int l = 1; l <= interior2; l++) {
        System.out.print("*");
      }
      interior2 += 2;
      espaciosFuera--;
      filas2++;
      System.out.println();
    }
  }
}