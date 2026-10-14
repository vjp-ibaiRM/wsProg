/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio21;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0, num2=0, resultado;//creamos las variables y el escaner
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Introduce el primer numero:");
            num1=sc.nextInt();//pedimos y guardamos los numeros
            System.out.println("Introduce el segundo numero:");
            num2=sc.nextInt();//dentro del try
        } catch (InputMismatchException e) {
            System.out.println("Opcion no valida.");
        } //si mete una letra le tiramos el error
        try{
            resultado=num1/num2;//repetimos con la operacion
            System.out.println("El resultado es: "+resultado);
        } catch (Exception a){//y si da 0 le damos error
            if (num2==0) {
               System.out.println("No es posible dividir por 0.");
            }
        }
    }
}
