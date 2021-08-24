package conta;

public class Saldo {
    private int number;
    private String name;
    private double balance;

    public Saldo(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Saldo(int number, String name, double depositoInicial) {
        this.number = number;
        this.name = name;
        deposito(depositoInicial);
    }

    public int getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposito(double valor) {
        balance += valor;
    }

    public void saque(double valor) {
        balance -= valor + 5.0;
    }

    @Override
    public String toString() {
        return  "Account " + number +
                ", Holder " + name +
                ", Balance: $ " + balance;
    }
}
