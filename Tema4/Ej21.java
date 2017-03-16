/*
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación
que se califica como apto o no apto, por tanto se debe preguntar al usuario
¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
mantiene la nota media anterior.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej21 {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca las notas de sus 2 examenes");
    double x1 = Double.parseDouble(sc.nextLine());
    double x2 = Double.parseDouble(sc.nextLine());
    
    double media = (x1+x2)/2;
    
    if(media>=5){
        System.out.println("Estas aprobado");
        System.out.println("Esta es tu media " + media);
        
    }
    if(media<5){
        System.out.println("Introduce el resultado de tu recuperación (apto/no apto)");
        String nota = sc.nextLine();
        
        if("apto".equals(nota)){
            System.out.println("Enhorabuena has aprobado");
        }else if("no apto".equals(nota)){
            System.out.println("Losiento estas suspenso");
        }
    }
    
    
    
    
    
    
    
    
    }
    
}
