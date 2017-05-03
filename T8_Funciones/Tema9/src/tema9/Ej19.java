/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

import java.util.Scanner;

/**
 *
 *
 */
public class Ej19 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Este programa transforma números en distintas bases.");
        System.out.println("Elija el tipo de número que va a introducir: ");
        System.out.println("1.Decimal.");
        System.out.println("2.Binario.");
        System.out.print("Tipo de número: ");
        int origen = Integer.parseInt(s.nextLine());
        System.out.println("Elija a qué base lo quiere transformar: ");
        System.out.println("1.Decimal.");
        System.out.println("2.Binario.");
        System.out.println("3.Octal.");
        System.out.println("4.Hexadecimal.");
        System.out.print("Tipo de resultado: ");
        int destino = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el número: ");
        int num = Integer.parseInt(s.nextLine());
        
        System.out.print("El resultado es: ");
        
        if((origen==1)&&(destino==2)) {
            int[] a = varias.decimalAbinario(num);
            Arrays.muestraArraySinSeparacion(a);
        }
        if((origen==1)&&(destino==3)) {
            int[] a = varias.decimalAbinario(num);
            int[] b = varias.binarioAoctal(a);
            Arrays.muestraArraySinSeparacion(b);
        }
        if((origen==1)&&(destino==4)) {
            int[] a = varias.decimalAbinario(num);
            String[] b = varias.binarioAhexadecimal(a);
            Arrays.muestraArrayString(b);
        }
        if((origen==2)&&(destino==1)) {
            System.out.println(varias.binarioAdecimal(num));
        }
        if((origen==2)&&(destino==3)) {
            int[] a = varias.intAarray(num);
            int[] b = varias.binarioAoctal(a);
            Arrays.muestraArraySinSeparacion(b);
        }
        if((origen==2)&&(destino==4)) {
            int[] a = varias.intAarray(num);
            String[] b = varias.binarioAhexadecimal(a);
            Arrays.muestraArrayString(b);
        }       
        
    }
}
