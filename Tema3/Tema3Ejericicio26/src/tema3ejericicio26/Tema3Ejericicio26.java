/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejericicio26;

/**
 *
 * @author alumno
 */
public class Tema3Ejericicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado=0;//declaramos variables
        for (int i = 111; i < 222; i++) {
            if (i%2==1) {
                resultado=resultado+i;
            }//en el for, si es par se suma a resultado
        }
        System.out.println("El resultado es: "+resultado);
    }
}
