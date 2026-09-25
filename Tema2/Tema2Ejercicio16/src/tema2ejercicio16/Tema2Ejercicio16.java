/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio16;

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ordenBilletes();
    }
    public static void ordenBilletes(){
        int dinero=130;
        int billete50=50, billete10=10;
        billete50=dinero/billete50;
        billete10=(dinero%billete50)/billete10;
        System.out.println(dinero+" euros hacen un total de: "+billete50+" billetes de 50 y "+billete10+" billetes de 10.");
    }
}
