package ar.edu.unahur.obj2.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Defino scanner y estructura para almacenar los nombres
        Scanner lector = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<String>(); 
        // Pido al usuario que ingrese todos los nombres 
        String str = new String("Ingrese los nombres de sus compañeros de clase.Cuando haya finalizado ingrese 'fin' para terminar de ingresar nombres.");
        System.out.println(str);
        pedirNombres(nombres);
        // Ahora pido al usuario la letra para filtrar los nombres
        System.out.println("Ahora ingrese una letra para filtrar los nombres que comiencen con la misma.");
        String letra = lector.next();
        // Declaro el array donde se van a almacenar los nombres que efectivamente empiecen con la letra indicada y filtro
        ArrayList<String> nombresFinal = new ArrayList<String>();
        for(String nombre : nombres){
            if(nombre.startsWith(letra)){
                nombresFinal.add(nombre);
            }
        }
        // finalmente muestro por consola los nombres
        for(String nombre: nombresFinal){
            System.out.println(nombre);
        }
    }
    public static void pedirNombres(ArrayList<String> stringsArray){
        Scanner lector = new Scanner(System.in);
        String aux = lector.next();
        while(! aux.equalsIgnoreCase("fin")){
            stringsArray.add(aux);
            aux = lector.next();
        }
    }
}