package list3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       /*
        
        Estructura ArrayList
        ArrayList<tipo> nombreArrayList = new ArrayList<tipo>();
       
       */
       
        //Carro carro = new Carro();        
        
        Carro carro1 = new Carro("ERW112","Mazda","Rojo");
        Carro carro2 = new Carro("AZS123","Toyota","verde");
        Carro carro3 = new Carro("PAO232","Renault","amarillo");
        Carro carro4 = new Carro("PIU556","Subaro","blanco");
        
        
        /* ArrayList Carros */
        
        ArrayList<Carro> carros = new ArrayList<Carro>();

        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        
        System.out.println("En el arreglo hay : "+ carros.size()+ " carros con placas:");
        
        for(int i=0; i<carros.size() ;i++){
            System.out.println(carros.get(i).getMarca());
        }
       

        //Persona cliente = new Persona();
        Persona persona1 = new Persona(1121232);
        Persona persona2 = new Persona(4645766);
        Persona persona3 = new Persona(2313434);
        Persona persona4 = new Persona(7898706);
        Persona persona5 = new Persona(7898706);
        Persona persona6 = new Persona(7898706);
        
        ArrayList<Persona> clientes = new ArrayList<Persona>();     
        
        clientes.add(persona1);
        clientes.add(persona3);
        clientes.add(persona4);
                
        System.out.println("En el arreglo hay : "+ clientes.size()+ " clientes con cedulas:");
        
           for(int i=0; i<clientes.size() ;i++){
            System.out.println(clientes.get(i).getIdentificacion());
        }
       
    } 
    

}
