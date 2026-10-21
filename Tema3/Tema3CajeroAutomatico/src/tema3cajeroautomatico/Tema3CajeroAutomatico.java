/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3cajeroautomatico;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoIn = 1000;
        menuCajero(saldoIn);
    }
    //metodo para el menu del cajero
    public static void menuCajero(int saldoIn){
        int opcion=0, operacion=0, ingresos=0, retiradas=0;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("\n---MENU---");
        System.out.println("1.Consultar:");
        System.out.println("2.Ingresar:");
        System.out.println("3.Retirar:");
        System.out.println("4.Salir:");
        System.out.println("Opcion:");
        opcion=entrada.nextInt();
        
        do {
            switch (opcion) {
                case 1:
                    consultarCajero(saldoIn);
                    operacion++;
                case 2:
                    ingresarCajero(saldoIn);
                    operacion++;
                    ingresos++;
                case 3:
                    retirarCajero(saldoIn);
                    operacion++;
                    retiradas++;
                case 4:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion!=4);
    }
    //método específico para mostrar la cantidad que hay en el cajero
    public static void consultarCajero(int saldoIn){
        System.out.println("Saldo disponible: "+saldoIn);
    }
    //metodo para ingresar dinero al cajero
    public static void ingresarCajero(int saldoIn){
        int cantidad=0;
        do {
            System.out.println("Introduce la cantidad a ingresar:");
            Scanner sc = new Scanner(System.in);
            cantidad=sc.nextInt();
            if (cantidad<0) {
                System.out.println("Cantidad incorrecta. Debe ser mayor que 0.");
            }
        } while (cantidad>=0);
        saldoIn+=cantidad;
    }
    //metodo para retirar dinero del cajero
    public static void retirarCajero(int saldoIn){
        
    }
}
