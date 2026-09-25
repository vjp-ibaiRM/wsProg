/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio21;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculoTiempo();
    }
    
    public static void calculoTiempo(){
        int tiempo=0;//creamos las variables de las medidas de tiempo
        int horas, minutos, segundos;
        Scanner entrada = new Scanner(System.in);//creamos el escaner
        System.out.println("Introduzca un numero finito y entero de segundos: ");
        tiempo = entrada.nextInt();//pedimos el tiempo al usuario
        segundos=tiempo;//y aquí utilizamos la lógica del ejercicio 15
        minutos=segundos/60;
        segundos%=minutos;
        horas=minutos/60;
        minutos%=horas*60;
        System.out.println(tiempo+" segundos hacen un total de: "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos.");
    }//después se lo mostramos por pantalla al usuario
}
