/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0, num2=0, num3=0;
        
        num1=metodos.pedirNumero();
        //vamos llamando la metodo de pedir numero
        num2=metodos.pedirNumero();
        //y los vamos guardando
        num3=metodos.pedirNumero();
        
        //le pasamos los numeros al otro metodo
        //y el se encarga de evaluarlos y mostrarlos
        metodos.mostrarNumero(num1, num2, num3);
    }
}
