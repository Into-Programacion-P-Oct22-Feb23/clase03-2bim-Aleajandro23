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
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        int[][] arreglo1 = {{10, 41, 40}, {1, 2, 3}};
        /*
        col0
        fila0    10      41      40
        fila1     1       2       3
        */
        int suma = 0;
        int valor;
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                valor = arreglo1[fila][col]; // valor de la posicion en ese moento del ciclo
                if (valor%2==0){ // Si (arreglo1[fila][col] MOD 2 == 0)ENTONCES
                    suma = suma + valor;
                }
                
            }
        }
        System.out.printf("Suma de valores del arreglo: %d\n", suma);
    }
    
}
