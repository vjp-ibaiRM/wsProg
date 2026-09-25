/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio15;

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculoTiempo();
    }
    public static void calculoTiempo(){
        int tiempo=10000;
        int horas, minutos, segundos;
        segundos=tiempo;
        minutos=segundos/60;
        segundos%=minutos;
        horas=minutos/60;
        minutos%=horas*60;
        System.out.println(tiempo+" segundos hacen un total de: "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos.");
    }
}
