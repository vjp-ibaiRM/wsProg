/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=0;//creamos el numero y el sout
        System.out.println("Introduce un numero:");
        positivonegativo(num);//lamamos al metodo
    }
    
    public static void positivonegativo(int num){
        Scanner entrada = new Scanner(System.in);
        try {
            num=entrada.nextInt();
            //en el metodo creamos el escaner y guardaos el numero
            if (num%2==0) {//con if vemos si es par o impar
                System.out.println("Su numero es par.");
            }else{
                System.out.println("Su numero es impar.");
            }//y devolvemos el correspondiente
        } catch (InputMismatchException e) {
            //un try catch pa que no se cargue el programa metiendo una letra
            System.out.println("Valor erroneo, pon un numero anda.");
            entrada.nextLine();
        }
    }
}
