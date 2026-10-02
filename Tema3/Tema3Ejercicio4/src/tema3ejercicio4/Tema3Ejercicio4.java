/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3;//declaramos variables y escaner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el primer numero:");
        num1=sc.nextInt();//pedimos los numeros
        System.out.println("Introduzca el segundo numero:");
        num2=sc.nextInt();//y los vamos guardando
        System.out.println("Introduzca el tercer numero:");
        num3=sc.nextInt();
        
        if(num1<num2 && num1<num3){//comparamos los numerines
            System.out.println("El numero mayor es: "+num1);
        }else if(num2<num1 && num2<num3){//y los mostramos
            System.out.println("El numero mayor es: "+num2);
        }else{//si no es num1 ni num2 le toca a num3
            System.out.println("El numero mayor es: "+num3);
        }
    }
    
}
