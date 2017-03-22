import java.util.Scanner;

public class Ej45 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("Este programa cambiará un dígito dentro de un número introducido");
    System.out.println(" por teclado dando la posición y el valor nuevo.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    System.out.print("Ahora introduzca la posición del dígito que quiere reemplazar: ");
    int posicion = Integer.parseInt(s.nextLine());
    System.out.print("Por último, introduzca el nuevo dígito: ");
    int nuevoDigito = Integer.parseInt(s.nextLine());
    
    long numeroReves = 0; // Almacena el número al revés
    
    // Pone el número al revés
    while (numeroIntroducido > 0) {
      numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    long reemplazamiento = 0; // Almacena el nuevo número
    int contador = 1;
    long digito = 0; // Almacena el dígito a cambiar
    
    // Realiza la modificación del nuevo número con el nuevo dígito y muestra el resultado
    while (numeroReves > 0) {
      digito = numeroReves % 10;
      if (contador == posicion) {
        digito = nuevoDigito;
      }
      reemplazamiento = (reemplazamiento * 10) + digito;
      numeroReves /= 10;
      contador++;
    }
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nEl número resultante es el " + reemplazamiento);
  }
}