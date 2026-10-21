/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej11;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num=0;//variable por si acaso
        //pedimos el numero
        pedirNumero();
        
        //
    }
    
    public static double pedirNumero(){
        double num;
        Scanner sc = new Scanner(System.in);
        //creamos el escaner y pedimos el numero
        do {
            System.out.println("Introduce el numero:");
            num=sc.nextDouble();
            if (num<=0) {
                System.out.println("Error. Mete otro numero.");
            }
        } while (num>0);
        return num;//y lo devolvemos
    }
    
    
}
