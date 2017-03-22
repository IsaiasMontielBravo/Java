/*
 * Escribe un programa que ordene tres números enteros introducidos por
teclado.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej13 {
    public static void main(String[] args) { 
    Scanner s = new Scanner(System.in); 
    System.out.println("Introduzca 3 numeros enteros");
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    
    int primerNumero=0;
    int segundoNumero=0;
    int tercerNumero=0;
    
    if ((a>b)&&(a>c)){
        primerNumero = a;
    }else {
        if((b>a)&&(b>c)) {
            primerNumero = b;
        
    }else
            if((c>a)&&(c>b)){
                primerNumero = c;
            }
    }
    
    if ((a>b)&&(a<c)){
        segundoNumero = a;
    }else {
        if((b>a)&&(b<c)) {
            segundoNumero = b;
        
    }else
            if((c>a)&&(c<b)){
                primerNumero = c;
            }
    }
    
    if ((a<b)&&(a>c)){
        segundoNumero = a;
    }else {
        if((b<a)&&(b>c)) {
            segundoNumero = b;
        
    }else
            if((c<a)&&(c>b)){
                segundoNumero = c;
            }
    }
    
    if ((a<b)&&(a<c)){
        tercerNumero = a;
    }else {
        if((b<a)&&(b<c)) {
            tercerNumero = b;
        
    }else
            if((c<a)&&(c<b)){
                tercerNumero = c;
            }
    }

    
    System.out.println(tercerNumero + "" + segundoNumero + "" + primerNumero);
    
    }
}
