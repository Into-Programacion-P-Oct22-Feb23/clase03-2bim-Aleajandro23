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
public class Ejemplo061 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        int[][] arreglo1 = {{10, 41, 40}, {1, 2, 3}};
        /*
                col0 |   col1 |   col2 |
       fila0   |10   |   41   |  40    |      [0,0]
       fila1   | 1   |   2    |  3     |
        */
        int suma = 0;
        int valor;
        String mensaje = "";
        
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                valor = arreglo1[fila][col];
                if (fila==col){ // cuandno fila y columna sean iguales se suma
                    suma = suma + valor;
                   // mensaje = String.format("%sLa suma de:\n%s\n%s\nEs igual a %s",mensaje 
                   //         , arreglo1[fila][col], suma);
                   
                  mensaje = String.format("%s\n%s\t",mensaje 
                          , arreglo1[fila][col]);
                }
                
            }
        }
        System.out.printf("La suma de: %s\nEs igual: %d\n", mensaje , suma);
        // System.out.println("Es igual a "+ suma);
    }
    
}
