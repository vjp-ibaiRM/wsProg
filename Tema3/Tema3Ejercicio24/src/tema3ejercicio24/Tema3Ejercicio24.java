/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio24;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=0, contador=0;//creamos las variables y el escaner
        Scanner sc = new Scanner(System.in);
        
        while (num<=0) {//después de probar con un do whiley un while, he dao con la solucion
            try {//en el try metemos el código que puede dar error
                System.out.println("\nIntroduzca un numero:");
                num=sc.nextInt();//guardamos el número del ususario
                if (num<=0) {//si pone un número negativo o el 1
                    System.out.println("El numero debe ser mayor que 1.");
                }//también cuenta como error
            } catch (InputMismatchException e) {//el catch pilla las excepciones y tira el error
                System.out.println("Error. Opcion no valida.");
                sc.nextLine();//aquí hay que meter un nextLine pa que no se salga ni siga rulando
            }//si el listo mete una letra le escupimos el error
        }//con el while y el nextLine funciona bien, puede que con el nextLine y un do-while pueda funcionar
        
        if (num>1) {//luego ya hacemos lo de mostrarlos con un for
            System.out.println("Los multiplos de 3 entre 1 y "+num+" son:");
            for (int i=1; i<=num; i++) {
                if (i%3==0) {//si es multiplo de 3
                    System.out.println(i);//lo mostramos
                    contador++;//y sumamos 1 a contador
                }//el if pa ver si i es multiplo de 3, en ese caso lo muestra
            }//y cuando por fin hace caso pues con el for mostramos los números
            System.out.println("El numero total de multiplos de 3 es:"+contador);
        }//y le mostramos cuantos multiplos salen con el contador
    }
}
