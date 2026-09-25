/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio14;

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    static final float PI=3.141592f;
    public static void main(String[] args) {
        // TODO code application logic here
        areaCircunferencia();
    }
    public static void areaCircunferencia(){
        float radio= 5.2f;
        float area;
        area=PI*(radio*radio);
        System.out.println("El area de la circunferencia cuyo radio vale "+radio+" seria igual a: "+area+" metros cuadrados.");
    }
}
