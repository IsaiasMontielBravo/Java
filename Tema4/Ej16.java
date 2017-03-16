/*
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
nos está siendo infiel. El programa irá haciendo preguntas que el usuario
contestará con verdadero o falso. Cada pregunta contestada como verdadero
sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utiliza
el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
del programa.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej16 {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
        int contador = 0;
        
        
        System.out.println("A continuacion se va a enfrentar al cuestionario de infidelidad");
        System.out.println("responde verdadero o falso");
        System.out.println("¿Se ha hecho muchos cambios de ropa?");
        String respuesta1 = sc.nextLine();
        if (respuesta1.equals("verdadero") ){
            contador = contador +3;
            
        }else{
            
        }
       
        
        System.out.println("¿Se ha hecho muchos cambios de ropa?");
        String respuesta2 = sc.nextLine();
        if (respuesta2.equals("verdadero") ){
            contador = contador +3;
            
        }else{
            
        }
        
        System.out.println("Tus puntos finales son " + contador);
        
}
}
