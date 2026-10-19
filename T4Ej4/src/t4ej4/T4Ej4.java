/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // el código es el mismo que el ejercicio 3
        int num1=0, num2=0, num3=0;//creamos los numeros y el escaner
        Scanner sc = new Scanner(System.in);
        
        do {
            try {//pedimos los numeros en un try catch
                //no vaya a ser que meta una letra
                System.out.println("Introduce el primer numero:");
                num1=sc.nextInt();//y los vamos guardando
                System.out.println("Introduce el segundo numero:");
                num2=sc.nextInt();
                System.out.println("Introduce el tercer numero:");
                num3=sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduce caracteres numericos.");
                sc.nextLine();//en el catch limpiamos el buffer
            }
        } while (num3==0);
        
        //y llamamos al método de la otra clase
        Menores.mayorMenor(num1, num2, num3);
    }
}
