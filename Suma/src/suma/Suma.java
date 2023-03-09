/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;
import java.util.Scanner;
/**
 *
 * @author Admin
 */

public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1;
        System.out.println("Ingrese un numero:");
        num1 = leer.nextInt(); 
	int num2;
        System.out.println("Ingrese otro numero:");
        num2 = leer.nextInt();
	int suma = num1 + num2;
        System.out.println("La suma de los números es: " + suma);
    }
    
}
