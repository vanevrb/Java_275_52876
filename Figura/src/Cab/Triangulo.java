package Cab;

public class Triangulo extends Figura {

   private double altura;
   private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
   
   /* 
    areadetriangulo=(b*a)/2 
    */
    public void area(){
        double areadetriangulo=(altura*base)/2;
        System.out.println("EL area del triangulo es:"+ areadetriangulo);
    }
          

}
