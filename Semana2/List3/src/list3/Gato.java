package list3;

public class Gato {
    private String nombre;
    private String raza;
    private String color;

    public Gato() {
    }

    public Gato(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
