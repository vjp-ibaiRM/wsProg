/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio32;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anioAc=0, mesAc=0, diaAc=0;
        int anioNa=0, mesNa=0, diaNa=0;
        int anioSo=0, mesSo=0, diaSo=0;
        //creamos todas las variables para los cálculos anales
        Scanner sc=new Scanner(System.in);//y el escaner
        
        do {
            try {
                System.out.println("Introduzca el anio actual:");
                anioAc=sc.nextInt();//vamos pidiendo
                System.out.println("Introduzca el mes actual:");
                mesAc=sc.nextInt();//y guardando
                System.out.println("Introduzca el dia actual:");
                diaAc=sc.nextInt();
                System.out.println("Introduzca el anio de tu nacimiento:");
                anioNa=sc.nextInt();
                System.out.println("Introduzca el mes de tu nacimiento:");
                mesNa=sc.nextInt();
                System.out.println("Introduzca el dia de tu nacimiento:");
                diaNa=sc.nextInt();//lo hacemos en un try catch
            } catch (InputMismatchException e) {//por si el listo mete una letra
                System.out.println("Debe introducir un numero.");
                sc.nextLine();//entonces error, limpiamos buffer y seguimos
            }
            
            //aquí empiezan los cálculos
            anioSo=anioAc-anioNa;
            mesSo=mesAc-mesNa;
            diaSo=diaAc-diaNa;
            
            //si alguno no coincide y da negativo
            if (mesSo<0) {
                mesSo=mesSo+12;
                mesSo--;
            }
            
            System.out.println("Su edad exacta es de "+anioSo+" anios, "+mesSo+" meses y "+diaSo+" dias.");
        } while (diaSo<30);
    }
    
}
