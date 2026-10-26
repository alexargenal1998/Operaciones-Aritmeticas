/* // Alex Argeñal
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nominasalariosemanal;
//  Nómina de Salario Semanal (Operaciones secuenciales y porcentajes)
import java.util.Scanner;
/**
 *
 * @author alexa
 */
public class NominaSalarioSemanal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        System.out.print("Ingrese horas trabajadas: ");
        double horastrabajadas = teclado.nextDouble();
        System.out.print("Ingrese su pago por hora: ");
        double pagohora = teclado.nextDouble();
        
        double salariobruto = horastrabajadas * pagohora;
        double impuestos= salariobruto * 0.08;
        double salarioneto= salariobruto - impuestos; 
        System.out.println("Salario Bruto: "+ salariobruto);
        System.out.println("Impuestos:" + impuestos);
        System.out.println("Salario Neto:" + salarioneto);   
    }

}
