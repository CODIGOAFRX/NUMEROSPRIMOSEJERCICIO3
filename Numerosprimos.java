/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosprimos;
import java.util.Scanner;
/**
 *
 * @author AlumnoT
 */
public class Numerosprimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("introduce el numero deseado");
        Scanner leer = new Scanner(System.in);
        int numero = leer.nextInt();
        boolean esPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
            }
        }
        if (esPrimo) {
            System.out.println(numero + " es numero primo");
        }
        else{
            System.out.println(numero + " no es primo biaxx");
        }
    }

}
