/**Realiza un conversor de Mb a Kb.
 *
 * @author Isaias
 */
 
 public class ejercicio10 { 
  public static void main(String[] args) {
  String linea;

    System.out.print("introduce los Megas ");
    linea = System.console().readLine();
    double mb;
    mb = Double.parseDouble( linea );
    
    double kb;
    
    kb= (mb * 1024);
    
    
     
    
    System.out.print(mb + " mb son  " + kb +"kb");
    
 }
}
