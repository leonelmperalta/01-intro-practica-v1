package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner lector = new Scanner(System.in);

    public static int[] generarArreglo() {
        int[] enteros = new int[10];
        System.out.println(new String("Ingrese 10 numeros enteros: "));
        for (int i = 0; i < 10; i++) {
            enteros[i] = lector.nextInt();
        }
        return enteros;
    }

    public static int[] ordenar(int[] intArray) {
        int[] arrayAux = new int[10];
        int j = 9;
        for(int i = 0; i < 10; i++){
            arrayAux[i] = intArray[j];
            j--;
        }
        return arrayAux;
    }

    public static void printArray(int[] intArray) {
        String str = new String("Su arreglo es:");
        System.out.println(str);
        for (int i = 0; i < 10; i++) {
            System.out.println(intArray[i]);
        }
    }
    public static void main(String[] args) {
        int[] arreglo = Ejercicio1.generarArreglo();
        Ejercicio1.printArray(arreglo);
        System.out.println(new String("Invirtiendo su arreglo..."));
        Ejercicio1.printArray(Ejercicio1.ordenar(arreglo));
    }
}