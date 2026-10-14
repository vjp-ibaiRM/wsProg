/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio25;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado=0;//declaramos variables
        for (int i = 17; i < 139; i++) {
            if (i%2==0) {
                resultado=resultado+i;
            }//en el for, si es par se suma a resultado
        }
        System.out.println("El resultado es: "+resultado);
    }//y mostramos el total
}
