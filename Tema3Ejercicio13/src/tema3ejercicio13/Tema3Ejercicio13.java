/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio13;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=11;//creamos la variable de control de flujo
        while (i>=0 && i<33) {            
            i++;//el while hasta que sea 33
            if (i%2==0) {//si es par, la imprime
                System.out.println(i);
                i++;//y que siga subiendo
            }
        }
    }
}
