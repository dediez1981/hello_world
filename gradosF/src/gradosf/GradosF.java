/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradosf;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GradosF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double gc;
        System.out.println("Ingrese los grados C°: ");
        gc = leer.nextDouble();
        double gf = 32 + (9*gc/5);
        System.out.println("Los grados Celsius: " +gc+ " convertidos a Fahrenheit son: " +gf);
        
    }
    
}
