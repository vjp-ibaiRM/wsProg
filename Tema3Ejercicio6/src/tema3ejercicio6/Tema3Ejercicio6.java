/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;//declaramos variables y escaner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la nota del alumno:");
        nota=sc.nextInt();//pedimos la nota
        
        int suspenso=4, bien=5, notable=7, sobresaliente=9;
        //creamos unas variables con los numeros
        if (nota<=suspenso && nota>=0) {
            System.out.println("La nota es suspenso.");
        }else if (nota>=bien && nota<notable) {
            System.out.println("La nota es bien.");
        }else if (nota>=notable && nota<sobresaliente) {
            System.out.println("La nota es notable.");
        }else if (nota>=sobresaliente && nota<=10) {
            System.out.println("La nota es sobresaliente.");
        }else{//y le mostramos cada nota
            System.out.println("El numero no es valido.");
        }
    }
}
