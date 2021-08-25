package proyecto2;

public class Main {

    public static void main(String[] args) {
         Perro p1 = new Perro("Pulgas","Pincher","Negro",2,"Pequeño");
         Perro p2 = new Perro("Bruno","Pug","Beige",7,"Mediano");
         Perro p3 = new Perro("Niqui","French Poodle","Blanco",10,"Mediano");
         
         Carro c1 = new Carro("pa4564","rojo","chevrolet");
         Carro c2 = new Carro("ca4541","negro","Renault");
         //int cedula,String primerNombre,String primerApellido,int edad, char genero
         Persona persona1 = new Persona(213123,"Carlos","Valderrama",45,'m');
         Persona persona2 = new Persona(323244324,"Carla","Parra",15,'f');
         /*
         System.out.println("el carro es de color"+ c1.color
                 +"con placa "+c1.placa
                 +"con marca "+c1.marca
                 
         );
         */
         System.out.println("-----------------------");
         System.out.println("Informacion del carro ");
         System.out.println(c1.getInfo());
         System.out.println("-----------------------");
         System.out.println("Informacion del carro 2");
         System.out.println(c2.getInfo());    
         
         System.out.println("-----------------------");
         System.out.println("Informacion de "+p1.nombre);
         System.out.println(p1.getInfo());
         System.out.println("-----------------------");
         System.out.println("Informacion de "+p3.nombre);
         System.out.println(p3.getInfo());    
         

         String mensaje;
         mensaje  = mensajeEsMayorDeEdad(persona1.esMayordeEdad());
         System.out.println("La persona 1 " +mensaje);
         
         mensaje  = mensajeEsMayorDeEdad(persona2.esMayordeEdad());
         System.out.println("La persona 2 " +mensaje);
    
    }
    private static String mensajeEsMayorDeEdad (boolean esMayor){
        return esMayor ? "Es mayor de edad" : "Es menor de edad";
    }

}
