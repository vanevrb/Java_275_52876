package listas;

import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {
        // todos los datos
        String[] listasuper={"huevos","carne","arroz","papa","yuca"};
        /*                               0         1       2      3      4        
        */        
        listasuper[0] = "habichuelas"; //cambiar el valor de un dato
        System.out.println("el primer articulo de la lista de super 1 es:"+ listasuper[0]);
        
        String[] listasuper2= new String [3];
        listasuper2[0]="carne";
        listasuper2[1]="empanadas para fritar";
        listasuper2[2]="chicharron para fritar";

        System.out.println("el primer articulo de la lista de super 2 es:"+ listasuper2[0]);

        int[] numeros = {342,223424,3234,4,23423};
        /*               0 1 2 3 4        
        */
        
        System.out.println(numeros.length);
        
        for(int i=0;i<numeros.length; i++){
            System.out.println("posicion: "+i+" valor: "+numeros[i]);
        }
        System.out.println("Posicion 4"+numeros[4]);
        
        /*
        ArrayList listasuper3 = new Arraylist();
        */
        

    }

}
