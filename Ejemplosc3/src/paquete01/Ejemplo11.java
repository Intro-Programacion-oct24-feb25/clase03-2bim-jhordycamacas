/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        int[][] arreglo1 = {{1, 2}, {10, 12}};
        /*
        1      2
        10     12
        */
        int[][] arreglo2 = {{3, 4}, {20, 40}};
        /*
        3      4
        20     40
        */
        int[][] sumaArreglo = new int[2][2]; //
        /*
        4    6
        30   52
        */
        //en este codigo se usan 3 arreglos por que los dos primeros son los 
        //valores que se van a sumar y que el resultado de esa suma se va a guardar
        //en el tercer arreglo todas las posiciones estan enlazadas entre si
        // es decir 0,0 de arreglo 1 con 0,0 de arreglo2, y 0,0 de sumaarreglo
        int valor1;
        int valor2;
        
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                valor1 = arreglo1[fila][col];
                valor2 = arreglo2[fila][col];
                sumaArreglo[fila][col] = valor1 + valor2;
            }
        }
        
        for (int fila = 0; fila < sumaArreglo.length; fila++) {
            for (int col = 0; col < sumaArreglo[fila].length; col++) {
                System.out.printf("%d\t", sumaArreglo[fila][col]);
            }
            System.out.println("");
        }
    }
    
}
