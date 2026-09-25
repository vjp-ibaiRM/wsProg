/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio32;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dinero=0;
        int bi50=50, bi20=20, bi10=10, bi5=5, mo2=2, mo1=1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuanta pasta tienes?");
        dinero=entrada.nextInt();
        bi50=dinero/50;
        bi20=(dinero%50)/20;
        bi10=((dinero%50)%20)/10;
        bi5=(((dinero%50)%20)%10)/5;
        mo2=((((dinero%50)%20)%10)%5)/2;
        mo1=((((dinero%50)%20)%10)%5)%2;
        System.out.println(dinero+" Euros se descomponen en "+bi50+" billetes de 50, "+bi20+" billetes de 20, "+bi10+" billetes de 10, "+bi5+" billetes de 5, "+mo2+" monedas de 2 euros y "+mo1+" monedas de euro.");
    }
}
