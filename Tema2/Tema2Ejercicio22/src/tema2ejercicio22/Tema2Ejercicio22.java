/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio22;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculoAreaPerimetro();
    }
    public static void calculoAreaPerimetro(){
        int lado=0;//creamos las variables de lado y area y perimetro
        int area=0, per=0;
        Scanner entrada = new Scanner(System.in);//creamos el scanner
        System.out.println("Introduzca la medida de un lado: ");
        lado = entrada.nextInt();
        area=(lado*lado)/2;//formula del area
        per=lado*3;//formula del perimetro
        System.out.println("El area de un triangulo de lado: "+lado+" es: "+area);
        System.out.println("El prerimetro de un triangulo de lado: "+lado+" es: "+per);//mostramos ambos resultados
        
    }
}
