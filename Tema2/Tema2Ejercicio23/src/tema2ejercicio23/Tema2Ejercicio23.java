/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio23;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculoCompra();
    }
    public static void calculoCompra(){
        double total=0, precio=0;//las variables del total y precio deben ser double
        int unidades=0;//las unidades serán enteros
        Scanner entrada = new Scanner(System.in);//creamos el escaner
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        precio = entrada.nextDouble();//pedimos el precio
        System.out.println("¿Cuántas unidades quiere llevarse? ");
        unidades = entrada.nextInt();//pedimos las unidades
        total = precio*unidades;//calculamos el total
        System.out.println("El precio total de su compra es de: "+total+" euros.");
    }//mostramos el total
}
