package Contas;

import Contas.Conta;

public class ContaPoupanca extends Conta {
    public String NumerodaConta;
    public String Titular;
    public double Saldo;
    public static double taxaRendimento;

    public ContaPoupanca(String n, String t) {
        super(n, t);
    }

    public void aplicarRendimento(){
<<<<<<< HEAD
	if(taxaRendimento == 0){
		throw new TaxaZerado("Taxa esta zerada");
=======
	if(taxaRendimento == NULL){
		throw new TaxaZerado("Taxa está zerada");
>>>>>>> 4f205d84174080cbf0a07669881302bfbf06b42a
	}
	else{
        this.saldo = this.saldo + (this.saldo + this.taxaRendimento);
	}
    }


}
