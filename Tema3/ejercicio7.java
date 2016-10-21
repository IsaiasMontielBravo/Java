/**escribe un programa que calcule el total de una factura a partir de la base imponible.
 *
 * @author Isaias
 */
 
 public class ejercicio7 { 
  public static void main(String[] args) {
  String linea;

    System.out.print("Por favor, introduce la base imponible, por favor: ");
    linea = System.console().readLine();
    double baseImponible;
    baseImponible = Integer.parseInt( linea );
    
    double iva=21;
    
    double total;
    total = ((baseImponible * iva) / 100) + baseImponible ;
    
     
    
    System.out.printf("Coste total son %.2f euros",total);
    
 }
}
