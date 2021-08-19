package operaciones;

import javax.swing.JOptionPane;

public class Operaciones {

    public static void main(String[] args) {
        //operador %
        // while
        //variable start
        int numero;
        int mod;
        numero = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
        mod = numero%2;
        // JOptionPane.showMessageDialog(null,"El residuo de la operacion es: "+mod );
        // determinar si un numero es par o no
        //residuo es 0 cuando se divide por 2
        
        // determinar si el numero insertado es igual a 2
        boolean condicion;
        condicion=(numero==2); // true or false
        
        
        if (numero==2){
            //true
            JOptionPane.showMessageDialog(null,"la condicion es:"+condicion
                    +"\nel numero insertado es igual a 2");
        }
        else{
            //false
            JOptionPane.showMessageDialog(null,"la condicion es:"+condicion
                    +"\nel numero insertado no es igual a 2");
        }


    }

}
