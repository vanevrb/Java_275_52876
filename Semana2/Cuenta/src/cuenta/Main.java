package cuenta;

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta1 =  new Cuenta("Ashly",800.00);
        
        System.out.println("Saldo inicial de la cuenta "+cuenta1.getSaldo());
        
        double montoDeposito = 5.0;
        
        System.out.println("Depositamos "+montoDeposito);
        cuenta1.depositar(montoDeposito);
        
        System.out.println("Nuevo saldo de la cuenta es:"+cuenta1.getSaldo());
        
    }

}
