/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio29;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);//creamos el escaner
        
        double aleatorio = Math.random()*100+1;//creamos el aleatorio
        aleatorio = Math.floor(aleatorio);//con random y floor
        int numero = (int) aleatorio;
        
        int numUs;//variable para el usuario
        int intentos=0;//variable para intentos
        
        do {//con un do while vamos bien 
            System.out.println("Adivina el numero entre 1 y 100.");
            numUs=entrada.nextInt();//guardamos el numero del ususario
            intentos++;//sumamos un intento de antemano
            
            if (numUs > numero) {//si es mayor, el aleatorio es menor
                System.out.println("El aleatorio es menor.");
            } else if(numUs < numero){//y viceversa
                System.out.println("El aleatorio es mayor");
            }else{//si acierta, perfe, se lo decimos
                System.out.println("Clavao, lo has acertado");
                System.out.println("Te han hecho falta "+intentos+" intentos");
            }
        } while (numUs!=numero);
    }
}
