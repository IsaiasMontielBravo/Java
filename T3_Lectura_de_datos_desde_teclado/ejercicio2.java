/**Transforma euros a pesetas.
 *
 * @author Isaias
 */
 
 public class ejercicio2 { 
  public static void main(String[] args) {
   String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    
    double pesetas; //se declara la variable cantidad de euros
    pesetas = primerNumero = Integer.parseInt( linea );

    
    System.out.printf("%.0f pesetas  son %.2f euros", pesetas,pesetas / 166,37);
 }
}
