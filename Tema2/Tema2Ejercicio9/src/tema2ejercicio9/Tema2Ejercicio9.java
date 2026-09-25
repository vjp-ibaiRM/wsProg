/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio9;

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    static final float PI=3.141592f;
    public static void main(String[] args) {
        // TODO code application logic here
        longitudCircunferencia();
    }
    public static void longitudCircunferencia(){
        float radio=3.55f;
        float resultado;
        resultado=2*PI*radio;
        System.out.println("La longitud de la circunferencia cuyo radio vale "+radio+" seria igual a: "+resultado+" metros.");
    }
}
