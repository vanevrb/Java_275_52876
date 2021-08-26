package proyecto3;

public class Main {

    public static void main(String[] args) {
        // String nombre, String raza, String color, int identificacion,String atributoUnicoPerro
        Perro p1 =new Perro("Pulgas","Pincher","negro",123123,"Garras normales");
        p1.info();
        Perro p2 =new Perro("Bruno","rotwailler","Beige",787889,"Garras normales");
        p2.info();
        
        System.out.println(p1.sonido());
        System.out.println(p1.comer());

    }

}
