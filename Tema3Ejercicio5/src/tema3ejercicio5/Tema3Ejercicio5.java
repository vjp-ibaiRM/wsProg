/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;//declaramos variables y escaner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el primer numero:");
        num=sc.nextInt();//pedimos los numeros
        
        int par=0;
        
        if(par==(num/2)%0){
            System.out.println("El numero "+num+" es par");
        }else{
            System.out.println("El numero "+num+" es impar");
        }
    }
    
}
