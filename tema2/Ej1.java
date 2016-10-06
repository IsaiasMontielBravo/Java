/*
 * Escribe un programa en el que se declaren las variables enteras x e y . Asignales los valores
144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable,
la suma, la resta, la división y la multiplicación.
 */
package tema2;

/**
 *
 * @author isime
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int y;
        x=144;
        y=199;
        System.out.println("El numero x es"+" " + x);
        System.out.println("El numero y es"+" " + y);
        int sum = x+y;
        int res=x-y;
        int div=x/y;
        int mult= x*y;
           
        System.out.println("Su suma es" +" " + sum);
        System.out.println("Su resta es" + " " + res);
        System.out.println("Su division es" + " " + div);
        System.out.println("Su multiplicacion es" + " " + mult);
        
    }
    
}
