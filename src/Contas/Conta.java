package Contas;

public class Conta {
    public String NumerodaConta;
    public String Titular;
    public double saldo;

    public Conta(String t, String n){
	if(t == null || t.trim().isEmpty()){
		throw new TitularNullException("Titular não pode ser nulo ou vazio");
	}
	else{
		this.Titular = t;
	}
    

	if(n == null ||n.trim().isEmpty()){
		throw new NumerodaContaException("Número da conta não pode ser vazio");
	}
	else{
		this.NumerodaConta = n;
        this.saldo = 0;
	}
    }


    public void transferirPara(Conta outraConta, double x){
        this.sacar(x);
        outraConta.depositar(x);
    }

    public void depositar(double x){
        this.saldo = this.saldo + x;
    }

    public double sacar(double x){
	if(x > this.saldo){
		throw new SaqueBaixo("Saldo insuficiente");
	}
	else{
        this.saldo = this.saldo - x;
	}
	return x;
    }
    

    public String getNumerodaConta() {
        return NumerodaConta;
    }

    public void setNumerodaConta(String numerodaConta) {
        this.NumerodaConta = numerodaConta;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        this.Titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
