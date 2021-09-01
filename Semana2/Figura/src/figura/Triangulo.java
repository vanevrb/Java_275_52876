package figura;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    /*  public void area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    public void area() {
        System.out.println("el area es" + base * altura);
    }

}
