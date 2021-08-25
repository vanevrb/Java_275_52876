package encapsulamiento;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona(213123,"Carlos","Valderrama",45,'m');
        Persona persona2 = new Persona(323244324,"Carla","Parra",15,'f');
        System.out.println("Cedula antes");
        System.out.println(persona1.getCedula()); //get
        System.out.println("Cedula ahora");
        persona1.setCedula(34555); //set
        System.out.println(persona1.getCedula());
        
        
        System.out.println("Edad antes");
        System.out.println(persona1.getEdad()); //get
        System.out.println("Edad ahora");
        persona1.setEdad(47); //set
        System.out.println(persona1.getEdad());


    }

}
