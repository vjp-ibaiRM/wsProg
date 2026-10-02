/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio12;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=11;//creamos la variable de control de flujo
        do {
            i++;//la vamos aumentando
            if (i%2==0) {//si es par
                System.out.println(i);
                i++;//lo muestra y sigue aumentando
            }//aumenta de 1 en 1 hasta 33
        } while (i<33);
    }
}
