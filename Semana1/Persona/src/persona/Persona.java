package persona;

public class Persona {

    public static void main(String[] args) {
        // Hola, Soy un comentario
   
        String primerNombre="Vanessa";
        String primerApellido="Rodriguez";
        int edad = 10;
        String genero="Femenino";
        int cedula   =323432 ;
        
        //System.out.println("Hola, Soy "+primerNombre +" tengo "+edad+" años");
        System.out.println("Nombre: "+primerNombre+" "+primerApellido);
        System.out.println("cedula: " + cedula);
        System.out.println("Edad: "+edad+" años");
        System.out.println("Genero: "+genero);
        if (edad >=18) {
        System.out.println("Es mayor de edad");
        }
        else{
        System.out.println("Es menor de edad");
        }
        
        
    }

}
