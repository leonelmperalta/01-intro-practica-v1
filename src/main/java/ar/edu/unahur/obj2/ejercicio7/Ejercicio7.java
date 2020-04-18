package ar.edu.unahur.obj2.ejercicio7;

import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        int matriz[][] = rellenarMatriznxn(10);
    }
    public static int[][] rellenarMatriznxn(int n){
        int matriz[][] = new int[n][n];
        Random r = new Random();
        int aleatorio = r.nextInt(100);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = aleatorio;
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