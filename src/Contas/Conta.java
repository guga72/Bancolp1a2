package Contas;

public class Conta {
    public String NumerodaConta;
    public String Titular;
    public double saldo;

    public Conta(String n, String t){
        this.NumerodaConta = n;
        this.Titular = t;
        this.saldo = 1000.00;
    }


    public void transferirPara(Conta outraConta, double x){
        this.sacar(x);
        outraConta.depositar(x);
    }

    public void depositar(double x){
        this.saldo = this.saldo + x;
    }

    public double sacar(double x){
        this.saldo = this.saldo - x;
        return 0;
    }

    public String getNumerodaConta() {
        return NumerodaConta;
    }

    public void setNumerodaConta(String numerodaConta) {
        NumerodaConta = numerodaConta;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
