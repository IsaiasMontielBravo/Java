import java.util.Scanner;

public class Ej44 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("Este programa insertará un dígito introducido por teclado dentro");
    System.out.println(" de otro número también introducido por teclado indicando la posición.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    System.out.print("Ahora introduzca la posición donde quiere insertar el dígito: ");
    int posicion = Integer.parseInt(s.nextLine());
    System.out.print("Por último, introduzca el número que quiere insertar: ");
    int numeroInsertado = Integer.parseInt(s.nextLine());
    
    // Declaramos las variables
    long numeroReves = 0; // Almacena el número al revés
    long numeroPartido1 = 0; // Almacena la primera partición del número
    long numeroPartido2 = 0; // Almacena la segunda partición del número
    
    // Pone el número al revéś
    while (numeroIntroducido > 0) {
      numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    // Realiza la primera partición del número e inserta el número pedido por teclado a continuación
    for (int i = 1; i < posicion; i++) {
      numeroPartido1 = (numeroPartido1 * 10) + (numeroReves % 10);
      numeroReves /= 10;
    }
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nEl número resultante es el " + numeroPartido1 + "" + numeroInsertado);
    
    // Realiza la segunda partición del número y la une al número anterior
    while (numeroReves > 0) {
      numeroPartido2 = (numeroPartido2 * 10) + (numeroReves % 10);
      numeroReves /= 10;
    }
    System.out.print(numeroPartido2);
  }
}