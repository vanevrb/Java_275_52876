package proyecto3;

public class Gato extends Animal {

    private String atributoUnicoGato;
    //garras retractiles

    public Gato(String nombre, String raza, String color, int identificacion, String atributoUnicoGato) {
        super(nombre, raza, color, identificacion);
        this.atributoUnicoGato = atributoUnicoGato;
    }

    public String getAtributoUnicoGato() {
        return atributoUnicoGato;
    }

    public void setAtributoUnicoGato(String atributoUnicoGato) {
        this.atributoUnicoGato = atributoUnicoGato;
    }

    public String sonido() {
        return "Miauuuuu";
    }

    public void info(){
        System.out.println("Nombre: "+getNombre()
                +"\nRaza: " + getRaza()
                +"\nColor: " + getColor()
                +"\nIdentificacion: " + getIdentificacion()
                +"\nAtributo del gato: "+getAtributoUnicoGato()
        );
    }
}
