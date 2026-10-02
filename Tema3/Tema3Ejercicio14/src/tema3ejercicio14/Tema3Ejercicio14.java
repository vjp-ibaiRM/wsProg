/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio14;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pares=0, i=0;
        do {
            i++;
            if (i%2==0) {//si es par lo muestra
                System.out.println(i);
                pares++;//y aumenta pares si es par
            }//y hacemos que aumente la variable pares
            //para que pare al alcanzar 100 numeros pares
        } while (pares<100);
    }
}
