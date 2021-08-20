package operaciones2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1;
        int numero2;
        int op;
        System.out.println("Ingrese numero 1");
        numero1 = leer.nextInt();

        System.out.println("Ingrese numero 2");
        numero2 = leer.nextInt();
        /*
        int resultado_sumar = operaciones.sumar(numero1, numero2);
        double resultado_multiplicar = operaciones.multiplicar(numero1, numero2);
        
        System.out.println("El resultado de la suma de los dos numeros es " + resultado_sumar);
        System.out.println("El resultado de la multiplicacion de los dos numeros es " + resultado_multiplicar);
        */
        
        do {

            System.out.println("Menu de opciones:"
                    + "\n1.Sumar"
                    + "\n2.Multiplicar"
                    + "\n3.Restar"
                    + "\n4.Salir");

            op = leer.nextInt();

            switch (op) {
                case 1:
                    operaciones.imprimir_suma(numero1, numero2);
                    break;
                case 2:
                    operaciones.imprimir_producto(numero1, numero2);
                    break;
                case 3:
                    operaciones.imprimir_resta(numero1, numero2);
                    break;
                case 4:
                    //salir
                    break;
            }
        }while (op != 4); //opcion salir es 4
        
    
    }
    }
