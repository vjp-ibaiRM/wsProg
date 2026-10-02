/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio18;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contraseña=1018, numero;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Introduce la contraseña");
            numero=sc.nextInt();
            if (numero==contraseña) {
                System.out.println("Acceso");
            }
        } while (numero==contraseña);
    }
}
