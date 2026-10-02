/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diasemana;//declaramos variables y escaner
        boolean laborable;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quieres saber si este dia se trabaja?");
        System.out.println("Introduzca (en numerico) el dia de la semana:");
        diasemana=sc.nextInt();//guardamos el numero
        
        if (diasemana>=0 && diasemana<=7) {
            //copiamos el código del ejercicio
            switch(diasemana){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    laborable=true;
                    break;
                case 6:
                case 7:
                    laborable=false;
            }
            //después utilizamos un if para mostrar si ese día es laborable o no
            //y como no encuentro una mejor manera usamos diasemana en vez de el valor de laborable
            if(diasemana>=6){//y ya
                System.out.println("Ese dia no es laborable.");
            }else if(laborable=true){
                //aquí si podemos usar el valor de laborable
                System.out.println("Ese dia es laborable.");
            }//y luego un else if para ver si el numero es invalido
        }else if (diasemana<=0 || diasemana>=7) {
            System.out.println("El numero introducizo no es valido.");
        }
    }
}
