/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dinero=0;//declaramos las variables y cada uno con su valor
        int bi50=50, bi20=20, bi10=10, bi5=5, mo2=2, mo1=1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indique una cantidad de dinero:");
        dinero=sc.nextInt();//pedimos los numeros
        System.out.println(dinero+" Euros se descomponen en:");
        
        if (dinero>=1) {
            bi50=dinero/50;//y aquí vamos calculando como en el ejercicio de las cifras y el tiempo
            bi20=(dinero%50)/20;
            bi10=((dinero%50)%20)/10;
            bi5=(((dinero%50)%20)%10)/5;
            mo2=((((dinero%50)%20)%10)%5)/2;
            mo1=((((dinero%50)%20)%10)%5)%2;
            if (bi50>=0 || bi20>=0 || bi10>=0 || bi5>=0 || mo2>=0 || mo1>=0) {
                System.out.println("Billetes de 50: "+bi50);
                System.out.println("Billetes de 20: "+bi20);
                System.out.println("Billetes de 10: "+bi10);
                System.out.println("Billetes de 5: "+bi5);
                System.out.println("Monedas de 2: "+mo2);
                System.out.println("Monedas de 1: "+mo1);
            }         
        }
    }
}
