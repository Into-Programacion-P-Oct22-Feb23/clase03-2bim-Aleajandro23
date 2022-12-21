/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        double[][] dato1 = {{1, 2, 3},{6, 8, 9}}; //
        /*
            1   4   3
            36  64  9
        */
        double resultado[][] = new double[2][3];
        
        for (int fila = 0; fila < dato1.length; fila++) {
            for (int columna = 0; columna < dato1[fila].length; columna++) {
                if (dato1[fila][columna] %2 == 0){
                    resultado[fila][columna]= dato1[fila][columna] * 
                            dato1[fila][columna];
                } else {
                    resultado[fila][columna]= dato1[fila][columna];
                }
                
            }
            
        }
        for (int fila = 0; fila < dato1.length; fila++) {
            for (int columna = 0; columna < dato1[fila].length; columna++) {
                System.out.printf("%s\t",resultado[fila][columna]);
            }
            System.out.println();
        }
    }
    
}
