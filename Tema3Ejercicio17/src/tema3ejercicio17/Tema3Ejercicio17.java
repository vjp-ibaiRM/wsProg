/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num=0, resultado=0;//creamos las variables
        Scanner sc = new Scanner(System.in);//y el escaner
        do {//hacemos un do while
            System.out.println("Introduzca un numero para calcular la raiz cuadrada:");
            num=sc.nextDouble();//pedimos el numero y lo guardamos
            if (num<=0) {//si mete un numero negativo le decimos que nanai
                System.out.println("Numero no valido.");
            }else{//y hacemos el cálculo con el Math.sqrt
                resultado= Math.sqrt(num);
                System.out.println("El resultado es:"+resultado);
            }//y lo mostramos
        } while (resultado==0);
    }//por lo menos mientras el resultado esté vacío
}
