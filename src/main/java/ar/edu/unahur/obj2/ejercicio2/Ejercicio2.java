package ar.edu.unahur.obj2.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        int referencia;
        List<Integer> numeros = new ArrayList();
        List<Integer> mayores = new ArrayList();
        Scanner lector = new Scanner(System.in);
        // Pedimos el numero de referencia
        System.out.println(new String("ingrese un numero de referencia:"));
        referencia = lector.nextInt();
        // Pedimos los numeros para completar la lista 
        System.out.println(new String("ingrese 20 numeros enteros:"));
        for(int i = 0; i <= 20 ; i++){
            numeros.add(lector.nextInt());
        }
        // Filtramos los numeros mayores a la referencia
        for(int b = 0; b <= 20; b++){
            if(numeros.get(b) > referencia) {
                mayores.add(numeros.get(b));
            }
        }
        // Mostramos al usuario los numeros mayores de la lista al numero de referencia elegido.
        System.out.println(new String("A continuacion se muestran los numeros mayores que el numero de referencia indicado:"));
        Iterator iter = mayores.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}