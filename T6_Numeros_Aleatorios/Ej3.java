/*
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */
package ej1;

/**
 *
 * @author isime
 */
public class Ej3 {
     public static void main(String[] args) {
 
    System.out.println("Este programa muestra, al azar, una carta de la baraja española.");
    int palo = (int)(Math.random() * 4 )+ 1;
    int carta = (int)(Math.random() * 10) + 1;
    int numerodelacarta = 0;
    String palodelacarta = "";
    String letradelacarta = "";
    
    switch (palo) {
      case 1:
      palodelacarta = "Bastos";
      break;
      case 2:
      palodelacarta = "Copas";
      break;
      case 3:
      palodelacarta = "Oros";
      break;
      case 4:
      palodelacarta = "Espadas";
      break;
    }
    switch (carta) {
      case 1:
      letradelacarta = "A";
      break;
      case 2:
      numerodelacarta = 2;
      break;
      case 3:
      numerodelacarta = 3;
      break;
      case 4:
      numerodelacarta = 4;
      break;
      case 5:
      numerodelacarta = 5;
      break;
      case 6:
      numerodelacarta = 6;
      break;
      case 7:
      numerodelacarta = 7;
      break;
      case 8:
      letradelacarta = "Sota";
      break;
      case 9:
      letradelacarta = "Caballo";
      break;
      case 10:
      letradelacarta = "Rey";
      break;
    }
    if (numerodelacarta == 0) {
    System.out.println("El palo de la carta es " + palodelacarta + " y la letra es " + letradelacarta);
    } else {
      System.out.println("El palo de la carta es " + palodelacarta + " y el número es " + numerodelacarta);
    }
  }
}

