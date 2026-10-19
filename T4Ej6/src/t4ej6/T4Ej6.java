/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota=0;//creamos los numeros y el escaner
        Scanner sc = new Scanner(System.in);
        
        do {
            try {//pedimos el numero en un try catch
                //no vaya a ser que meta una letra
                System.out.println("Introduce la nota:");
                nota=sc.nextInt();//y lo guardamos
            } catch (InputMismatchException e) {
                System.out.println("Introduce un numero.");
                sc.nextLine();//en el catch limpiamos el buffer
            }
        } while (nota==0);
        if (nota<0 || nota>10) {
            System.out.println("Introduce una nota entre 0 y 10.");
        }
        //llamamos al metodo
        notaCalificada(nota);
    }
    
    public static void notaCalificada(int nota){
        switch (nota) {//aquí el método
            case 0://con un switch que es más fácil
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso.");
                break;//vamos imprimiendo según queramos
            case 5:
            case 6:
                System.out.println("Bien.");
                break;
            case 7:
            case 8:
                System.out.println("Notable.");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente.");
                break;
            default:
                throw new AssertionError();
        }
    }
}
