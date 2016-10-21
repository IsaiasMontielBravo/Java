/**Realiza un conversor de kb a mb.
 *
 * @author Isaias
 */
 
public class ejercicio11 { 
  public static void main(String[] args) {
  String linea;

    System.out.print("introduce los Kb: ");
    linea = System.console().readLine();
    double kb;
    kb = Double.parseDouble( linea );
    
    double mb;
    
    mb= (kb / 1024);
    
    
     
    
    System.out.print(kb + " kb son  " + mb +"mb");
    
 }
}
