package ar.edu.unahur.obj2.ejercicio3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*Pide al usuario las temperaturas de un día (un valor cada hora durante 24 horas) 
        y almacénalas en un array.*/
        Scanner lector = new Scanner(System.in);
        float temperaturas[];
        temperaturas = new float[24];
        System.out.println(new String("ingrese una temperatura por cada hora del dia:"));
        for(int i = 0; i < 24; i++){
            System.out.println(i + new String(":"));
            temperaturas[i] = lector.nextFloat();
        }
        /*Usando los datos contenidos en el array, calcula la temperatura media, la máxima
        y la mínima.*/
        float tempMedia = calcularMedia(temperaturas);
        float tempMax = calcularMax(temperaturas);
        float tempMin = calcularMin(temperaturas);
        /*Visualiza la información en forma de gráfico de barras. */
        for(int b = 0; b < 24 ; b++){
            System.out.println(b + new String("  ***************  ") + temperaturas[b]);
        }
        /* Visualiza la temperatura media y maxima */
        System.out.println(new String("Temperatura media: " + tempMedia));
        System.out.println(new String("Temperatura maxima: " + tempMax));
        System.out.println(new String("Temperatura minima: " + tempMin));
    }
    public static float calcularMedia(float[] floatArray){
        float total = 0;
        float media;
        for(int i = 0; i < 24; i++){
            total = total + floatArray[i];
        }
        media = total / floatArray.length;
        return media;
    }
    public static float calcularMax(float[] floatArray){
        float actualMax = 0;
        for(int i = 0; i < 24 ; i ++){
            if(actualMax < floatArray[i]){
                actualMax = floatArray[i];
            }
        }
        return actualMax;
    }
    public static float calcularMin(float[] floatArray){
        float actualMin = 5000000.0f;
        for(int i = 0; i < 24 ; i ++){
            if(actualMin > floatArray[i]){
                actualMin = floatArray[i];
            }
        }
        return actualMin;
    }
    
}