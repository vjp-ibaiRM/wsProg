/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;//creamos la variable y el escaner
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Introduce un numerin:");
        num=ent.nextInt();//pedimos el numero al ususario
        
        if(num>0){//con el if ponemos mayor o menor que 0
            System.out.println("El numero es positivo.");
        }else if(num<0){//y así determinamo si es positivo
            System.out.println("El numero es negativo.");
        }else{//o negativo
            System.out.println("Po nada, que gracia con el cero.");
        }//y lo mostramos
    }
}