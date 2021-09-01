package list4;

public class Perro {
    public String nombre;
    public String raza;
    public String color;
    public int edadMeses;
    public String tamano;//pequeño - mediano - grande
    private Persona dueno;
    
    public Perro(String nombre) {
        this.nombre = nombre;
    }
    
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDueno() {
        return dueno;
    }

    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }
    
    
}
