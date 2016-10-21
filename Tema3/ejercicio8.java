/**Escribe un programa que calcule el salario semanal de un empleado en base a las horas
trabajadas, a razón de 12 euros la hora.
 *
 * @author Isaias
 */
 
 public class ejercicio8 { 
  public static void main(String[] args) {
  String linea;

    System.out.print("Horas trabajadas: ");
    linea = System.console().readLine();
    double HorasTrabajadas;
    HorasTrabajadas = Integer.parseInt( linea );
    
    double DineroHora= 12;
    
    double total;
    total = (HorasTrabajadas * DineroHora) ;
    
     
    
    System.out.printf("Dinero conseguido son %.2f euros",total);
    
 }
}
