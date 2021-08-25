package proyecto2;

public class Persona {

    public int cedula;
    public String primerNombre;
    public String primerApellido;
    public int edad;
    public char genero;
    //constructor

    public Persona(int cedula,String primerNombre,String primerApellido,int edad, char genero) {
        this.cedula = cedula;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.edad= edad;
        this.genero = genero;
    }
    public boolean esMayordeEdad(){
        return (edad>=18); 
    }
}
