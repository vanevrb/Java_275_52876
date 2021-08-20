package operaciones2;

public class operaciones {
    /*
    sumar()
    restar()
    multiplicar()
    dividir()
    hallarresiduo()
    potencia() libreria Math
    
    */
    public static int sumar(int n1,int n2){
      int result;
      result = n1 + n2;
      return result;
    }

    public static double multiplicar(int n1,int n2){
      double result;
      result = n1 * n2;
      return result;
    }
    public static void imprimir_suma(int n1,int n2){
      int result;
      result = n1 + n2;
      System.out.println("el resultado de la suma es: "+result) ;
    }
     public static void imprimir_producto(int n1,int n2){
      int result;
      result = n1 * n2;
      System.out.println("el producto es: "+result) ;
    } 
    public static void imprimir_resta(int n1,int n2){
      int result;
      result = n1 - n2;
      System.out.println("el resultado de la resta es: "+result) ;
    }
}
