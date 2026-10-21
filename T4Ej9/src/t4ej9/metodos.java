/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4ej9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class metodos {
    
    public static int pedirNumero(){
        Scanner sc = new Scanner(System.in);
        //creamos el escaner y pedimos el numero
        System.out.println("Introduce el numero:");
        int num=sc.nextInt();
        return num;//y lo devolvemos
    }
    
    public static void mostrarNumero(int num1, int num2, int num3){
        if (num1<num2 && num1<num3) {
            //vamos evaluando y mostrando los numeros
            System.out.println("El menor es "+num1);
        }else if(num2<num1 && num2<num3){
            System.out.println("El menor es "+num2);
        }else{
            System.out.println("El menor es "+num3);
        }
    }
}
