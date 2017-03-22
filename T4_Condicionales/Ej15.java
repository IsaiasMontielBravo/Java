/*
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +,
-, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
izquierda o hacia la derecha.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej15 {
    public static void main(String[] args) { 
    Scanner s = new Scanner(System.in); 
    System.out.println("Introduzca el caracter con el cual se hara la piramide");
    String c = s.nextLine();
    
    System.out.println("vertice hacia arriba (a)");
    System.out.println("vertice hacia abajo (b)");
    System.out.println("vertice hacia izquierda (c)");
    System.out.println("vertice hacia derecha (d)");
    
    String b = s.nextLine();
    
          
    
    switch (b){
        case "a":
            System.out.printf("      %s\n", c);
      System.out.printf("     %s%s%s\n", c, c, c);
      System.out.printf("    %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("   %s%s%s%s%s%s%s\n", c, c, c, c, c, c, c);
      System.out.printf(" %s%s%s%s%s%s%s%s%s%s%s\n", c, c, c, c, c, c, c, c, c, c, c);
      break;
    case "b":
      System.out.printf(" %s%s%s%s%s%s%s%s%s%s%s\n", c, c, c, c, c, c, c, c, c, c, c);
      System.out.printf("   %s%s%s%s%s%s%s\n", c, c, c, c, c, c, c);
      System.out.printf("    %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("     %s%s%s\n", c, c, c);
      System.out.printf("      %s\n", c);
      break;
    case "i":
      System.out.printf("        %s\n",c);
      System.out.printf("       %s%s\n", c, c);
      System.out.printf("      %s%s%s\n", c, c, c);
      System.out.printf("     %s%s%s%s\n", c, c, c, c);
      System.out.printf("    %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("   %s%s%s%s%s%s\n", c, c, c, c, c, c);
      System.out.printf("    %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("     %s%s%s%s\n", c, c, c, c);
      System.out.printf("      %s%s%s\n", c, c, c);
      System.out.printf("       %s%s\n", c, c);
      System.out.printf("        %s\n",c);
      break;
    case "d":
      System.out.printf("      %s\n",c);
      System.out.printf("      %s%s\n", c, c);
      System.out.printf("      %s%s%s\n", c, c, c);
      System.out.printf("      %s%s%s%s\n", c, c, c, c);
      System.out.printf("      %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("      %s%s%s%s%s%s\n", c, c, c, c, c, c);
      System.out.printf("      %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("      %s%s%s%s\n", c, c, c, c);
      System.out.printf("      %s%s%s\n", c, c, c);
      System.out.printf("      %s%s\n", c, c);
      System.out.printf("      %s\n",c);
      break;
    default:
      System.out.println("La dirección elegida no es correcta");
      break;

            
                
            
        
    }
    }
}
