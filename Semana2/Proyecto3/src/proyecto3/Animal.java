package proyecto3;

public class Animal {
    private String nombre;
    private String raza;
    private String color;
    private int identificacion;

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

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    
    
    public Animal(String nombre, String raza, String color, int identificacion) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.identificacion = identificacion;
    }
    
    public String sonido (){
        return  "Estoy haciendo un sonido";
    }
    public String comer(){
        return "Estoy comiendo";
    }
    public String dormir(){
        return "Estoy durmiendo";
    }
}
