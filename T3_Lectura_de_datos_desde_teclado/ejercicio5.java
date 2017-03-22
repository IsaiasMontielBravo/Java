/**
* Calcula el Area de un cuadrado
*
* @author Isaias Montiel
*/

public class ejercicio5 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce lado del cuadrado, por favor: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    int total;
    total = primerNumero * primerNumero;

    System.out.println("El lado del cuadrado es " + primerNumero );
    System.out.print("El Area del Cuadrado es ");
    System.out.print(total);   
  } 
}
