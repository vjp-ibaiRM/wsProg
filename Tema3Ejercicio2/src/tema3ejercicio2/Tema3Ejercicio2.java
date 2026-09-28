/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;//creamos las variables y el escaner
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numerin:");
        num1=entrada.nextInt();//pedimos los numeros al ususario
        System.out.println("Introduce otro numerin:");
        num2=entrada.nextInt();
        
        if(num1>10){//con el if miramos como es el numero
            int multiplicao;//si es más de 10 se multiplican
            multiplicao=num1*num2;//hacemos la operación y lo mostramos
            System.out.println("Se han multiplicao y ha salio "+multiplicao);
        }else{
            int sumar;//pero si es 10 o menos po se suman
            sumar=num1+num2;//hacemos la operacion y listo
            System.out.println("Se han sumao y ha salio "+sumar);
        }
    }
}
