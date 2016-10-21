/**Escribe un programa que calcule el volumen de un cono según la fórmula V = (π*r2*h)3
 *
 * @author Isaias
 */
 
 public class ejercicio9 { 
  public static void main(String[] args) {
  String linea;

    System.out.print("Radio del cono: ");
    linea = System.console().readLine();
    double radio;
    radio = Integer.parseInt( linea );
    
    System.out.print("Altura del cono: ");
    linea = System.console().readLine();
    double altura;
    altura = Integer.parseInt( linea );    
    
    double total;
    total = (3.14 * (radio * radio) * altura) / 3 ;
    
     
    
    System.out.print("El volumen del cono es de " + total);
    
 }
}
