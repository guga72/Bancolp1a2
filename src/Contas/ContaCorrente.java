package Contas;

import Contas.Conta;

public class ContaCorrente extends Conta {
    public String NumerodaConta;
    public String Titular;
    public double Saldo;
    public double limiteChequeEspecial = 1000.00;
    public static double taxaJurosChequeEspecial = 0.05;

    public ContaCorrente(String n, String t) {
        super(n, t);
    }


    public void debitarJuros(){
        this.saldo = this.saldo - (this.saldo * taxaJurosChequeEspecial);
    }
    @Override
    public double sacar(double x){
<<<<<<< HEAD
	if(x > this.saldo){
=======
	if(x < this.saldo){
>>>>>>> 4f205d84174080cbf0a07669881302bfbf06b42a
		throw new SaqueBaixo("Saldo insuficiente");
	}
	else{
        	x = x + x * 0.01;
        	this.saldo = this.saldo - x;
	}
<<<<<<< HEAD
	return x;
=======
	return this.saldo;
>>>>>>> 4f205d84174080cbf0a07669881302bfbf06b42a
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
        return this.Saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double li) {
<<<<<<< HEAD
	if(this.limiteChequeEspecial == 0){
=======
	if(this.limiteChequeEspecial == NULL){
>>>>>>> 4f205d84174080cbf0a07669881302bfbf06b42a
		throw new LimiteZerado("Limite zerado");
	}
        this.limiteChequeEspecial = limiteChequeEspecial - li;
    }

    public static double getTaxaJurosChequeEspecial() {
        return taxaJurosChequeEspecial;
    }

    public static void setTaxaJurosChequeEspecial(double taxaJurosChequeEspecial) {
        ContaCorrente.taxaJurosChequeEspecial = taxaJurosChequeEspecial;
    }
}
