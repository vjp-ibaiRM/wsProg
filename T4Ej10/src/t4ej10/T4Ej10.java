/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej10;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=0;//creamos la variable pa pasar a los metodos
        
        //le damos el valor del return del metodo
        num=pedirNumero();
        
        //y lo mostramos con el otro metodo
        tablaMultiplicar(num);
    }
    
    public static int pedirNumero(){
        Scanner sc = new Scanner(System.in);
        //creamos el escaner y pedimos el numero
        System.out.println("Introduce el numero:");
        int num=sc.nextInt();
        return num;//y lo devolvemos
    }
    
    public static void tablaMultiplicar(int num){
        for (int i = 0; i <= 10; i++) {//creamos el for
            int resultado=i*num;//hacemos el calculo del resultado
            System.out.println(num+" x "+i+" = "+resultado);
        }//y lo vamos mostando
    }
}
