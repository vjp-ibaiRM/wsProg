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
            System.out.println("Introduce la nota:");
            nota=sc.nextInt();//y lo guardamos
            if (nota<0 || nota>10) {
                System.out.println("Introduce una nota entre 0 y 10.");
            }
        } while (nota<=0 && nota>=10);
        //llamamos al metodo
        notaCalificada(nota);
    }
    
    public static void notaCalificada(int nota){
        switch (nota) {//aquí el método
            case 0, 1, 2, 3, 4 -> //con un switch que es más fácil
                System.out.println("Suspenso.");
            //vamos imprimiendo según queramos
            case 5, 6 -> System.out.println("Bien.");
            case 7, 8 -> System.out.println("Notable.");
            case 9, 10 -> System.out.println("Sobresaliente.");
            default -> throw new AssertionError();
        }
    }
}
