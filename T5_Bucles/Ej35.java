import java.util.Scanner;

public class Ejercicio35 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
   
    System.out.print("Este programa pintará una 'X' con una altura impar mayor o igual");
    System.out.println(" a 3 numeros introducidos");
    
    
    int altura; 
    int filas1 = 1; 
    int filas2 = 1; 
    int espaciosDentro2 = 2; 
    
    
    do {
      System.out.print("\nPor favor, introduzca la altura de la 'X' (impar mayor o igual a 3): ");
      altura = Integer.parseInt(s.nextLine());
    } while ((altura < 3) || (altura % 2 == 0));
    
    int espaciosDentro1 = altura; 
    int espaciosFuera = altura/2; 
    
    System.out.println("-----------------------------------------------------------------------------\n");
    
    
    while (filas1 <= ((altura/2)+1)) {
        
      
      for (int i = 1; i < filas1; i++) { 
        System.out.print(" ");
      }
      System.out.print("*");
        
     
      if (filas1 < ((altura/2)+1)) {
        for (int j = 0; j < espaciosDentro1-2; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      filas1++;
      espaciosDentro1 -= 2; 
      System.out.println();
    }
    
    
    while (filas2 <= altura/2) {
      
      
      for (int k = 1; k < espaciosFuera; k++) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      
      for (int l = 1; l < espaciosDentro2; l++) {
        System.out.print(" ");
      }
      System.out.print("*");
      espaciosDentro2 += 2;
      espaciosFuera--;
      filas2++;
      System.out.println();
    }
  }
}