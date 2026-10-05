/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio18;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contraseña=1810, numero, intentos=0;//creamos las variable de la contraseña, el numero que introduce el usuario y el numero de intentos
        Scanner sc = new Scanner(System.in);
        
        do {//con un do while nos podemos apañar
            System.out.println("\nContrasenia numerica de 4 digitos.");
            System.out.println("Introduce la contrasenia");
            numero=sc.nextInt();//guardamos el numero que pone el usuario
            if (numero==contraseña) {//si es igual a la contraseña le damos acceso
                System.out.println("Acceso permitido.");
                intentos=10;//una vez que le damos acceso hay que darle un valor a intentos para cumplir las condiciones
            }
            if(numero!=contraseña){//si el numero introducido no es igual a la contraseña
                System.out.println("Error!");//le decimos que error
                intentos++;//y aumentamos la variable intentos
            }
            if (intentos==3) {//si llega a 3 intentos
                System.out.println("Acceso denegado.");
                numero=contraseña;//denegamos el acceso
                intentos=10;//y forzamos la detencion cambiando las variables
            }
        } while (numero!=contraseña || intentos<=3);
    }//el do while funciona mientras no acierte ni supere el numero de intentos
}
