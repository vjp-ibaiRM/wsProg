/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio24;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*21 al 27, y 32*/
        notaMedia();
    }
    public static void notaMedia(){
        double programacion, lmsgi, basedatos,entornos,sistemas,fol, media;//creamos todas las variables
        Scanner sc = new Scanner(System.in);//creamos el escanner sc
        
        System.out.println("Por favor, introduzca la nota de Programacion: ");
        programacion=sc.nextDouble();//pedimos las notas al usuario
        System.out.println("Introduzca la nota de Lenguaje de Marcas: ");
        lmsgi=sc.nextDouble();
        System.out.println("Introduzca la nota de Base de Datos: ");
        basedatos=sc.nextDouble();
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        entornos=sc.nextDouble();
        System.out.println("Introduzca la nota de Sustemas Informaticos: ");
        sistemas=sc.nextDouble();
        System.out.println("Introduzca la nota de FOL: ");
        fol=sc.nextDouble();//vamos pidiendo las notas
        
        media=(programacion+lmsgi+basedatos+entornos+sistemas+fol)/6;//calculamos la media
        System.out.println("Su nota media es de: "+media);//motrmos la media
    }
}
