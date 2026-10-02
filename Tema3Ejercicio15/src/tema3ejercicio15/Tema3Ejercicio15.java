/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio15;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=0, resultado;//creamos la variable y el escaner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce su numero:");
        num=sc.nextInt();//y guardamos el numero del usuario
        
        for (int i = 0; i <= 10; i++) {//creamos el for
            resultado=i*num;//hacemos el calculo del resultado
            System.out.println(num+" x "+i+" = "+resultado);
        }//y lo vamos mostando
    }
}
