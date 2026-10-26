/* // Alex Argeñal
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cálculo.de.energía.cinética;
//  Cálculo de Energía Cinética (Uso de Math.pow)
import java.util.Scanner;
// Siempre se crea el import? Si no, como sabemos cuando usarlo?
/**
 *
 * @author alexa
 */
public class CálculoDeEnergíaCinética {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.print("Ingrese la masa del objeto (kg):" );
        double masa= teclado.nextDouble();
        System.out.print("Ingrese la velocidad del objeto (Metros por segundo):");
        double velocidad= teclado.nextDouble();
        
        double energia = 0.5 * masa * Math.pow(velocidad, 2);
        System.out.println("Joules: "+ energia);
    
    }
    
}
