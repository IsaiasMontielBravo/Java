/**
* Calcula el Area de un triangulo
*
* @author Isaias Montiel
*/

public class ejercicio6 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce la base del triangulo, por favor: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );

    System.out.print("introduce la altura del triangulo, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    
    int total;
    total = primerNumero * segundoNumero / 2;

    System.out.print("La base del triangulo es " + primerNumero);
    System.out.println(" y la altura es " + segundoNumero);
    System.out.println(" divido entre 2 ");
    System.out.print("El Area del triangulo es ");
    System.out.print(total);   
  } 
}
