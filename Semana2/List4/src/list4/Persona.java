package list4;

import java.util.ArrayList;


public class Persona {
    private String nombre;
    private String apellido;
    private int identificacion;
    private ArrayList<Perro> mascotas;
    ArrayList<String> mascotasconnombre;
    public Persona(int identificacion) {
        this.identificacion = identificacion;
        mascotas = new ArrayList<>();
    }

    public Persona(int identificacion,String nombre, String apellido) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        mascotas = new ArrayList<>();

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
    public void adoptar(Perro perro){//adoptar con el mismo nombre
        String nombreactual=perro.getNombre();
        perro.setDueno(this);
        mascotas.add(perro);
    }
    public void adoptar(Perro perro, String nombrenuevo){//adoptar y le cambio el nombre
        perro.setNombre(nombrenuevo);
        perro.setDueno(this);
        mascotas.add(perro);
    }    

    public ArrayList<Perro> getMascotas() {
        return mascotas;
    }
            

    public void  getNombreMascotas() {
        

        for(int i=0; i<mascotas.size() ;i++){
            System.out.println(mascotas.get(i).getNombre());
           
        }        

    }
    
}
