package Contas;

public class Conta {
    public String NumerodaConta;
    public String Titular;
    public double saldo;

    public Conta(String t, String n){
<<<<<<< HEAD
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
=======
	if(t == NULL || titular.trim().isEmpty()){
		throw new TitularNullException("Titular não pode ser nulo ou vazio");
	}
	else{
		this.titular = t;
	}

	if(n == NULL || NumerodaConta.trim().isEmpty()){
		throw new NumerodaContaException("Número da conta não pode ser vazio");
	}
	else{
		this.numeroConta = numeroConta;
	}
        this.NumerodaConta = n;
>>>>>>> 4f205d84174080cbf0a07669881302bfbf06b42a
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
<<<<<<< HEAD
	if(x > this.saldo){
=======
	if(x < this.saldo){
>>>>>>> 4f205d84174080cbf0a07669881302bfbf06b42a
		throw new SaqueBaixo("Saldo insuficiente");
	}
	else{
        this.saldo = this.saldo - x;
	}
<<<<<<< HEAD
	return x;
=======
	return this.saldo;
>>>>>>> 4f205d84174080cbf0a07669881302bfbf06b42a
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
