package tryca;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCa {

    public static void main(String[] args) {
                
         
        try{
            Scanner leer = new Scanner(System.in);
            int numero;
            System.out.print("inserte un numero: ");
            numero = leer.nextInt();
            System.out.println("el numero insertado es:"+numero);

            //la entrada del dato es entero  
        }
        catch(InputMismatchException e){
            System.out.println("ingrese un numero");
        }
        catch(Exception e){
            System.out.println("ingrese un dato valido");

        }
        finally{
            //finally
        }
    }

}
