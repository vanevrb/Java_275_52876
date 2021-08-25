package encapsulamiento;

public class Persona {

    private int cedula;
    private String primerNombre;
    private String primerApellido;
    private int edad;
    private char genero;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //constructor
    public Persona(int cedula, String primerNombre, String primerApellido, int edad, char genero) {
        this.cedula = cedula;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.edad = edad;
        this.genero = genero;
    }


    public boolean esMayordeEdad() {
        return (edad >= 18);
    }

}
