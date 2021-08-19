package menusw;

import javax.swing.JOptionPane;

public class MenuSw {

    public static void main(String[] args) {
        int op;
        int primerNumero;
        int segundoNumero;
        
        primerNumero =Integer.parseInt(JOptionPane.showInputDialog("primer numero"));
        segundoNumero =Integer.parseInt(JOptionPane.showInputDialog("segundo numero"));
        op =Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones:"
                + "\n1.Sumar"
                + "\n2.Multiplicar"
                + "\n3.Restar"
                + "\nEscoge una opcion del 1 al 3"));
        
        switch (op){
            case 1:
                JOptionPane.showMessageDialog(null,"la suma es:"+(primerNumero+segundoNumero));
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"El producto es:"+(primerNumero*segundoNumero));
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"La resta es:"+(primerNumero-segundoNumero));
                break;
            default:
                JOptionPane.showMessageDialog(null,"escoger un numero");
                break;

        }
    }

}
