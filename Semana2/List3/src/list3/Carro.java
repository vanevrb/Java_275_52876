package list3;

public class Carro {
    private String color;
    private String placa;
    private String marca;

    public Carro(String placa) {
        this.placa = placa;
    }


    public Carro( String placa, String marca,String color) {
        this.color = color;
        this.placa = placa;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
