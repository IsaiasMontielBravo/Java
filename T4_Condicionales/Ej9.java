/*
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el valor de A");
    double a = sc.nextInt();
    System.out.println("Introduce el valor de B");
    double b = sc.nextInt();
    System.out.println("Introduce el valor de C");
    double c = sc.nextInt();
    
    
    if (a == 0){
        System.out.println("El resultado de la ecuacion es " + (-c/b));
    }
    else if (b == 0 ){
        double division = (-c/b);
        if (division < 0){
            System.out.println("No hay solucion");
        }else {
            System.out.println("La solución es " + Math.sqrt(-c/b));
        }
        if (c == 0){
            System.out.println("El resultado de x1 es: 0");
            System.out.println("El resultado de x2 es: " + (-b/a));
        }else {      
      double parcialraiz = (Math.pow(b,2))-(4 * a * c);
      double parcialdivisor = 2 * a;        
        if (parcialraiz < 0) {
        System.out.println("No es posible resolver la ecuación.");
        } else {
        double parcialraizcompleta = Math.sqrt(parcialraiz);    
        double x1 = (-b + (parcialraizcompleta))/parcialdivisor;
        double x2 = (-b - (parcialraizcompleta))/parcialdivisor;    
        if (x1 == x2) {
          System.out.println("X es : " + x1);
        } else {
          System.out.println("X1 es " + x1);
          System.out.println("X2 es " + x2);
                }
            }
        }
      }
    }
}
