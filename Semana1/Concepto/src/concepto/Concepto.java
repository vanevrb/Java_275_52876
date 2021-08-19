package concepto;

public class Concepto {

    public static void main(String[] args) {
        int isInt=1;
        float isFloat=5.7f;
        boolean isBoolean= false; //puede ser true o false
        String isString="Esto es un mensaje";
        System.out.println("Es un Entero: "+isInt);
        System.out.println("Es un flotante: "+isFloat);
        System.out.println("Es Booleano: "+isBoolean);
        System.out.println("Es un String: "+isString);
        System.out.println("Primera Linea\nSegunda Linea");
        /* --- Calculos --- */
        int firstNumber = 12;
        int secondNumber = 3;
        int sum= firstNumber + secondNumber;
        int resta=firstNumber - secondNumber;
        double division=firstNumber / secondNumber;
        double producto=firstNumber * secondNumber;
        System.out.println("Una suma: "+sum+"\nUna resta: "+resta+"\nUna Division: "+division+"\nUn producto: "+producto);
                }

}
