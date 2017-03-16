/*
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el minicuestionario
a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
en las diferentes asignaturas del curso.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej12 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        
        
        System.out.println("A continuacion se va a enfrentar al cuestionario mas dificil del mundo");
        
        System.out.println("Cual es mi color favorito");
        String respuesta1 = sc.nextLine();
        if (respuesta1.equals("rojo") ){
            System.out.println("Buenisima ninio");
            contador++;
            
        }else{
            System.out.println("buah chaval retirate");
        }
       
        
        System.out.println("Como se llama el raton mas famoso de disney");
        String respuesta2 = sc.nextLine();
        
        if (respuesta2.equals("mickey moose") ){
            System.out.println("Buenisima ninio");
            contador++;
            
        }else{
            System.out.println("buah chaval retirate");
        }
        
        System.out.println("Tus puntos finales son " + contador);
        
    }
    
            }

