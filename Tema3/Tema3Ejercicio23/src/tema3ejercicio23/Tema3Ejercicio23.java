/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio23;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;//creamos las variables y el escaner
        Scanner sc = new Scanner(System.in);

        while (num <= 1) {
            System.out.println("\nIntroduzca el numero:");
            num = sc.nextInt();//guardamos el número del ususario
            if (num <= 1) {//si pone un número negativo o el 1
                System.out.println("El numero debe ser mayor que 1.");
            }//si es menos que 1 no nos sirve
        }//con un while ya no le pasa na raro al programa
        if (num <= 1) {//si pone un número negativo o el 1
            System.out.println("Opcion no valida.");
            System.out.println("El numero debe ser mayor que 1.");
        }//por gracioso le volvemos a decir que no vale
        for (int i = 1; i < num; i++) {
            System.out.println(i);
        }//y cuando por fin hace caso pues con el for mostramos los números
    }
}
