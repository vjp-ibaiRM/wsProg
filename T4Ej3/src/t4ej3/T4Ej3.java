/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        //lamamos al método del otro paquete, y que se encargue
        t4ej3.metodo.Metodo.mayorMenor(num1, num2, num3);
    }
}
