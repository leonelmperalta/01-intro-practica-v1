package ar.edu.unahur.obj2.Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Crea una matriz de 3x3 elementos pidiendo los valores al usuario.
        Scanner lector = new Scanner(System.in);
        int matriz[][] = rellenarMatriz3x3();
        imprimirMatriz3x3(matriz);

    }
    public static int[][] rellenarMatriz3x3(){
        int matriz[][] = new int[3][3];
        Scanner lector = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(new String("Ingrese un entero para la fila " + i + "Y la columna " + j));
                matriz[i][j] = lector.nextInt();
            }
        }
        return matriz;
    }
    public static void imprimirMatriz3x3(int[][] matriz3x3){
        for(int i = 0; i < 3; i++){   
            String str = new String("[ " + matriz3x3[i][0] + " " + matriz3x3[i][1] + " " + matriz3x3[i][2] + " ]");
            System.out.println(str);        
        }
    }
}