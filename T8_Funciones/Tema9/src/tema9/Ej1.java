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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Devuelve si el numero es capicua.");
        
        Scanner s = new Scanner (System.in);
        System.out.print("Introduce el numero");
        int x = Integer.parseInt(s.nextLine());
        
        if(varias.esCapicua(x)){
            System.out.print("es capicua");
        } else {
            System.out.print("no es capicua");
        }
    }
    
}
