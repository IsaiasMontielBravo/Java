/*
 * Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej7 {
    public static void main(String[] args) {
         System.out.println("Descubre la contraseña de la caja fuerte.");
    System.out.println("Son cuatro dígit //os y tienes cuatro oportunidades.");
    Scanner sc = new Scanner(System.in);
    
    int resultado = 1234;
    for (int i = 1; i <= 4; i++) {
      System.out.println("Dime el primer número: ");
      int x1 = sc.nextInt();
      
      
      if (resultado==x1){
        System.out.println("La caja fuerte se ha abierto sactifactoriamente.");
        i = 4; //en un bucle for no se debe modificar la variable del bucle. 
      } else {
        System.out.println("Lo siento, esa no es la combinación.");
        System.out.println("Numero de intentos:" + i);
      }
    }
  }
    
    
}
