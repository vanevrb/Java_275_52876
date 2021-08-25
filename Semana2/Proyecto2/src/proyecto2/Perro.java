package proyecto2;

public class Perro {
    public String nombre;
    public String raza;
    public String color;
    public int edadMeses;
    public String tamano;//pequeño - mediano - grande
    
    public Perro(String nombre, String raza, String color,int edadMeses,String tamano){
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edadMeses = edadMeses;
        this.tamano = tamano;
    }
    public String getInfo(){
        return("La raza de "+nombre+" es "+raza+", de color "+color+ " tiene "+edadMeses+" meses y es de tamaño "+tamano);
    }
}
