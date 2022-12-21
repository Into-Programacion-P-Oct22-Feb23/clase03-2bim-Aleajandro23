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
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        String cadenaFinal = "";
        
        // forma 1
        int[][] arreglo1 = new int[3][4];
       // System.out.printf("Uso de la opción length: %d\n", arreglo1.length); // uso de la opcion lenght 3, por la fila
        
       // System.out.printf("Valor en la posición [0][2]\n", arreglo1[0][2]); // para mostrar el valor de a posicion
       
        arreglo1[0][2] = 1000;
        
               
        for (int fila = 0; fila < arreglo1.length; fila++) { // ciclo repetitivo contador llamado fila
            for (int col = 0; col < arreglo1[fila].length; col++) {
               // System.out.printf("fila[%d] columna[%d] = %d\n", 
               //        fila, col, arreglo1[fila][col]);
               
               cadenaFinal = String.format("%sfila[%d] columna[%d] = %d ♡\n" , // el pirmer % con fila y el otro con col
                       cadenaFinal, fila , col , arreglo1[fila][col]);
            }
        }
        
        System.out.printf("%s\n",cadenaFinal);
        
    }
    
}

// cuando sea menor a arreglo1.length que tiene valor de la fila
// a cada fila le da su respecto cantidad hasta donde puede aterar por ejemplo
// la columna seria     [   arreglo1[fila].length   ]
// System.out.printf("fila[%d] columna[%d] = %d\n",  fila[valor que tenga fila]
// columna [valor que tenga columna] = al valor que tengan en esa posicion
