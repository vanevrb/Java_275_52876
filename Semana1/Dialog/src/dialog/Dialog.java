package dialog;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Dialog {

    public static void main(String[] args) {
        int esEntero1;
        int esEntero2;
        String esString;
        double esDouble;
        char esCar;
        double suma;
        double raiz_suma;
        
 
        esString = JOptionPane.showInputDialog("Ingresa un mensaje para mostrar");
        JOptionPane.showMessageDialog(null,"Advertencia solo ingresar enteros","Advertencia contenido incorrecto", JOptionPane.WARNING_MESSAGE);
        esEntero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor entero 1"));
        esEntero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor entero 2"));
        esDouble = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un costo del producto"));
        esCar = JOptionPane.showInputDialog("Ingresa un caracter").charAt(0);
        suma = esEntero1 + esEntero2;
        raiz_suma=Math.sqrt(suma);
        JOptionPane.showMessageDialog(null,"Los valores ingresados son:"
                + "\nPara el entero 1:"+esEntero1
                + "\nPara el entero 2:"+esEntero2
                + "\nPara el mensaje:"+esString
                + "\npara el caracter:"+esCar
                + "\npara el costo:"+esDouble
                + "\nsuma de los valores es:"+suma
                + "\nraiz de la suma:"+raiz_suma
                );
        JOptionPane.showMessageDialog(null,"Gracias por responder","Gracias", JOptionPane.QUESTION_MESSAGE);
        

       
        
    }

}
