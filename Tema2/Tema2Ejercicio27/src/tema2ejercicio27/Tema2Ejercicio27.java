/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio27;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=0, cuadrado=0, cubo=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        numero=entrada.nextInt();
        cuadrado=numero*numero;
        System.out.println("El cuadrado de "+numero+" es: "+cuadrado);
        cubo=numero*numero*numero;
        System.out.println("El cubo de "+numero+" es: "+cubo);
    }
}