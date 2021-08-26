package proyecto3;

public class Perro extends Animal {
    private String atributoUnicoPerro;
    //garras normales

    public Perro(String nombre, String raza, String color, int identificacion,String atributoUnicoPerro) {
        super(nombre, raza, color, identificacion);
        this.atributoUnicoPerro = atributoUnicoPerro;
    }

    public String getAtributoUnicoPerro() {
        return atributoUnicoPerro;
    }

    public void setAtributoUnicoPerro(String atributoUnicoPerro) {
        this.atributoUnicoPerro = atributoUnicoPerro;
    }
    
    public String sonido(){
        return "Wuauuuuu";
    }
    
    public void info(){
        System.out.println("---------------------------------------");
        System.out.println("Nombre: "+getNombre()
                +"\nRaza: " + getRaza()
                +"\nColor: " + getColor()
                +"\nIdentificacion: " + getIdentificacion()
                +"\nAtributo del perro: "+getAtributoUnicoPerro()
        );
    }
   
}
