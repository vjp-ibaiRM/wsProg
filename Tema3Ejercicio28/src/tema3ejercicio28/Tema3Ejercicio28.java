/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio28;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        numero = Math.floor(numero);
        int aleatorio =(int)((Math.random())*100+1);
        //la variable aleatoria con Math random
        
        System.out.println("Su numero es: "+aleatorio);
        if (aleatorio%2==0) {//y con un if determinamos si es par o impar
            System.out.println("El numero "+aleatorio+" es par.");
        }else{
            System.out.println("El numero "+aleatorio+" es impar.");
        }
    }
}
