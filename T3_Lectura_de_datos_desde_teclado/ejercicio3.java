/**Transforma euros a pesetas.
 *
 * @author Isaias
 */
 
 public class ejercicio3 { 
  public static void main(String[] args) {
   String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    
    double euros; //se declara la variable cantidad de euros
    euros = primerNumero = Integer.parseInt( linea );

    
    System.out.printf("%.2f euros son %.0f pesetas", euros,euros * 166,37);
 }
}
