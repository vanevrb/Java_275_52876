package cuenta;

public class Cuenta {

    /*
    En la cuenta el saldo tiene que ser mayor a 0
    La cuenta debe poder recibir depositos y sumarlo al valor que llevaba en el saldo de la cuenta
    El monto de deposito tiene que ser mayor a 0
    */

    private String nombre;
    private double saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        if (saldo > 0) {        // saldo valido
            this.saldo = saldo;
        }
    }

    public void depositar(double montoDeposito) {
        if (montoDeposito > 0) {
            saldo = saldo + montoDeposito;
        }
    }

}
