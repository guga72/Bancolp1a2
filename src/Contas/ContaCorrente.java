package Contas;

import Contas.Conta;

public class ContaCorrente extends Conta {
    public String NumerodaConta;
    public String Titular;
    public double Saldo;
    public double limiteChequeEspecial;
    public static double taxaJurosChequeEspecial = 0.05;

    public ContaCorrente(String n, String t) {
        super(n, t);
    }


    public void debitarJuros(){
        this.saldo = this.saldo - (this.saldo * taxaJurosChequeEspecial);
    }

    public double sacar(double x){
        x = x - x * 0.01;
        return 0;
    }

    @Override
    public String getNumerodaConta() {
        return NumerodaConta;
    }

    @Override
    public void setNumerodaConta(String numerodaConta) {
        NumerodaConta = numerodaConta;
    }

    @Override
    public String getTitular() {
        return Titular;
    }

    @Override
    public void setTitular(String titular) {
        Titular = titular;
    }

    @Override
    public double getSaldo() {
        return Saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public static double getTaxaJurosChequeEspecial() {
        return taxaJurosChequeEspecial;
    }

    public static void setTaxaJurosChequeEspecial(double taxaJurosChequeEspecial) {
        ContaCorrente.taxaJurosChequeEspecial = taxaJurosChequeEspecial;
    }
}
