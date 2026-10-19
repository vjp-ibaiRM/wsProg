/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0, num2=0;//creamos los numeros y el escaner
        Scanner sc = new Scanner(System.in);
        
        do {
            try {//pedimos los numeros en un try catch
                //no vaya a ser que meta una letra
                System.out.println("Introduce el primer numero:");
                num1=sc.nextInt();//y los vamos guardando
                System.out.println("Introduce el segundo numero:");
                num2=sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduce caracteres numericos.");
                sc.nextLine();//en el catch limpiamos el buffer
            }
        } while (num2==0);
        //después del while dejamos el if
        if (num1>=10) {//si el primero es más de 10 llamamos a Producto
            SumaProducto.Producto(num1, num2);
        }else{//y si no pues llamamos a Suma
            SumaProducto.Suma(num1, num2);
        }
    }
}
