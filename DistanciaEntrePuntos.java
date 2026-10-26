/*// Alex Argeñal
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distancia.entre.dos.puntos.math.sqrt;
// Distancia entre dos puntos (Autoestudio: Math.sqrt)
import java.util.Scanner;
/**
 *
 * @author alexa
 */
public class DistanciaEntrePuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        System.out.print("Ingrese coordenada X1: ");
        double x1 = teclado.nextDouble();
        System.out.print("Ingrese coordenada Y1: ");
        double y1 = teclado.nextDouble();
        System.out.print("Ingrese coordenada X2: ");
        double x2 = teclado.nextDouble();
        System.out.print("Ingrese coordenada Y2: ");
        double y2 = teclado.nextDouble();
        
        double distancia = Math.sqrt(Math.pow (x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia es: " + distancia);
    }
}
