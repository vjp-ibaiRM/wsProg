/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio31;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, intentos=0, impares=0;//creamos las variables
        int impar1=0, impar2=0, impar3=0;//y donde guardar los impares
        
        do {//en el do-while evaluamos la situacion
            numero = (int) (Math.random()*100+1);
            intentos++;//vamos metiendo intentos cuando se genera un nuevo numero
            if (numero%2!=0) {//si es impar, se guarda
                impares++;
                if (impares==1) {//si es el primero, al primero
                    impar1=numero;
                }else if(impares==2){
                    impar2=numero;
                }else{//y así hasta guardar los 3 impares
                    impar3=numero;
                }
            }
        } while (impares<3);
        //se sale y se muestra
        System.out.println("Los 3 numeros impares son: "+impar1+" - "+impar2+" - "+impar3);
        System.out.println("A tomado "+intentos+" intentos.");
    }
}
