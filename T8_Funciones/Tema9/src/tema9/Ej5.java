/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej5 {
    public static void main(String[] args) {
        System.out.println("Cuenta el número de dígitos de un número entero.");
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el numero:");
        long num = Integer.parseInt(s.nextLine());
        
        System.out.print("El numero de digitos es");
        System.out.println(varias.cuentaDigitos(num));
    }
}
