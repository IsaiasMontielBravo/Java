/*
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.
 */
package ej1;

/**
 *
 * @author isime
 */
public class Ej5 {
   public static void main(String[] args) {
    int maximo = 0;
    int minimo = 199;
    int suma = 0;
       
       
    for (int i = 1; i <= 50; i++) {
    int num = (int)(Math.random()*100) + 100;
    System.out.print(num + " ");
    if (num>maximo){
        maximo = num;
       }else if (num<minimo){
           minimo = num;
       }
    suma += num;
}
    System.out.println();
    System.out.println("El menor numero es:" + minimo);
    System.out.println("El mayor numero es:" + maximo);
    System.out.println("La media es:" + (double)suma/50);
}
}
