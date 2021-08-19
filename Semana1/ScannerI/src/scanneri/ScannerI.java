package scanneri;
import java.util.Scanner;
import java.lang.Math;

public class ScannerI {

    public static void main(String[] args) {
      
/*      int esEntero;
        String esString;
        double esDouble;
        Scanner in = new Scanner(System.in);
        System.out.print("Por favor ingrese un entero: ");
        esEntero = in.nextInt();
        System.out.println("el dato entero ingresado es: "+esEntero);
*/
      //Variables
        int primerNumero;
        int segundoNumero;
       
        double resultado_suma;
        double resultado_resta;
        double resultado_mult;
        double resultado_div;
        double raiz_cuadrada;
        int minimo_dos_numeros;
                
        Scanner in = new Scanner(System.in);
        System.out.print("Inserte el primer Numero: ");
        primerNumero = in.nextInt();
        System.out.print("Inserte el segundo Numero: ");
        segundoNumero = in.nextInt();
        //suma
        resultado_suma= primerNumero + segundoNumero;
        resultado_resta= primerNumero  - segundoNumero;
        resultado_mult= primerNumero *  segundoNumero;
        resultado_div= primerNumero /  segundoNumero;
        raiz_cuadrada =  Math.sqrt(resultado_suma);
        minimo_dos_numeros =Math.min(primerNumero,segundoNumero);
        
        System.out.println("La suma de los dos numeros es: "+resultado_suma);
        System.out.println("La resta de los dos numeros es: "+resultado_resta);
        System.out.println("El producto de los dos numeros es: "+resultado_mult);
        System.out.println("La division de los dos numeros es: "+resultado_div);
        System.out.println("La raiz cuadrada del resultado de la suma es: "+raiz_cuadrada);
        System.out.println("El minimo de los dos numeros es: "+minimo_dos_numeros);
        

    }

}
