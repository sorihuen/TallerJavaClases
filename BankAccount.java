/**
 * Creación de la clase Cuenta Bancaria con atributos y metodos.
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-07
*/
public class BankAccount{

    /**
     * Representa el numero de cuenta.
    */
    private int accountNumber;
    /**
     * Representa si esta activada la cuenta.
    */
    protected boolean activated;
     /**
     * Representa el saldo en la cuenta.
     */
    private double balance;

    /**
     *Crea una instancia de la clase Persona con parámetros
     * @param int cuenta, boolean activar, double saldo.

    */

    public BankAccount(int account, boolean activated, double initial) {
        accountNumber = account;
        this.activated = activated;
        balance = initial;
    }
   /**
     * Método accesador de numero de cuenta
     * @return numero de cuenta
    */
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Método accesador de activar numero de cuenta
     * @return activar
    */
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Método accesador del saldo de la cuenta
     * @return saldo
    */
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Método para depositar en la cuenta
     * @param double monto
     * @return saldo mas el monto.
    */
    public void deposit(double amount){
        balance = balance + amount;
    }

    /** 
     * Método para hacer retiro en la cuenta
     * @param double monto
     * @return saldo menos el monto.
    */
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public double balance(){
        return balance;

    }

}