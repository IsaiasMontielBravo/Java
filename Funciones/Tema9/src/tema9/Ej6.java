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
public class Ej6 {
    public static void main(String[] args) {
        System.out.println("Le da la vuelta a un número.");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int num = Integer.parseInt(s.nextLine());

        System.out.print("El número al revés es: ");
        System.out.println(varias.vuelta(num));
}
}
