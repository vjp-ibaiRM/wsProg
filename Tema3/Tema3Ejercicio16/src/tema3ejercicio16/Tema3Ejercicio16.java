/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio16;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=20, impares=0;//creamos las variables
        System.out.println("Los numeros impares existentes entre 20 y 160 son:");
        do {
            i++;//la vamos aumentando
            if (i%2!=0) {//si es par
                System.out.print(i+" - ");
                i++;//lo muestra y sigue aumentando
                impares++;
            }//aumenta hasta 160 ostrando los impares
        } while (i<160);
        System.out.println("\nLa cantidad de numeros impares han sido:"+impares);
        //y mostramos los impares
    }
}
