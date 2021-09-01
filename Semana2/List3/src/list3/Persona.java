package list3;

public class Persona {
    private String nombre;
    private String apellido;
    private int identificacion;

    public Persona(int identificacion) {
        this.identificacion = identificacion;
    }


    public Persona(int identificacion,String nombre, String apellido) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    
}
