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
        
        System.out.println("Introduzca un numero:");
        num=sc.nextInt();//pedimos los numeros
        
        int par=0;//creamos el booleano par
        
        if(par==num%2){
            //comparamos si el resto del número partido de 2 es 0
            System.out.println("El numero "+num+" es par");
        }else{//mostramos en caso de si coincide o no
            System.out.println("El numero "+num+" es impar");
        }
    }
}
