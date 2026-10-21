/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sigue siendo el mismo codigo
        int num1=0;//creamos los numeros y el escaner
        Scanner sc = new Scanner(System.in);
        
        do {
            try {//pedimos el numero en un try catch
                //no vaya a ser que meta una letra
                System.out.println("Introduce el numero:");
                num1=sc.nextInt();//y lo guardamos
            } catch (InputMismatchException e) {
                System.out.println("Introduce caracteres numericos.");
                sc.nextLine();//en el catch limpiamos el buffer
            }
        } while (num1==0);
        //y llamamos al método
        t4ej5.metodo.Metodo.parImpar(num1);
    }
}
