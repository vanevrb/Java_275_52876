package list4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*Personas */
        Persona jesus = new Persona(23267673);
        Persona jorge = new Persona(78876776);
        /* Perros */
        Perro guapeton1 =new Perro("guapeton");
        Perro guapetonsegundo =new Perro("guapeton");
        Perro solitario =new Perro("solitario");
        /* Adopciones */
        jesus.adoptar(guapeton1);
        jesus.adoptar(solitario);
        
        ArrayList<Perro> mascotasdejesus = jesus.getMascotas();
        System.out.println("jesus adopto "+mascotasdejesus.size()+" perros");
        for(int i=0; i<mascotasdejesus.size() ;i++){
            System.out.println(mascotasdejesus.get(i).getNombre());
        }
        
        /* Adopcion de Tony*/
        jorge.adoptar(guapetonsegundo,"tony");
        
        ArrayList<Perro> mascotasdejorge = jorge.getMascotas();
        System.out.println("------------------------------------");
        System.out.println("jorge adopto "+mascotasdejorge.size()+" perros");
        for(int i=0; i<mascotasdejorge.size() ;i++){
            System.out.println(mascotasdejorge.get(i).getNombre());
        }
        jesus.getNombreMascotas();
    }

}
