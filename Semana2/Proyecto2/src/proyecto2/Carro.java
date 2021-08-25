package proyecto2;

public class Carro {

    public String placa;
    public String color;
    public String marca;

    public Carro(String placa, String color, String marca) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
    }
    
    public String getInfo(){
        return ("El carro es de color:"+color
                +"\nLa Placa es:"+placa
                +"\nLa marcar es:"+marca
        );
    }
    
}
