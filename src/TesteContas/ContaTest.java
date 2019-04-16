package TesteContas;

import Contas.Conta;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContaTest {

	@Test
	public void deve_conseguir_criar_uma_conta_com_titular_e_numero() {
		String titular = "João da Silva";
		String numeroConta = "001-002";
		Conta conta = new Conta(titular, numeroConta);
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumerodaConta());
	}
	
	@Test
	public void uma_nova_conta_deve_ter_saldo_zero() {
		Conta conta = new Conta("João da Silva", "123-456");
		double saldo = conta.getSaldo();
		assertEquals(0, saldo);
	}
	
	@Test
	public void devo_conseguir_depositar_um_valor_na_conta() {
		Conta conta = new Conta("João da Silva", "123-456");
		double valorADepositar = 100;
		conta.depositar(valorADepositar);
		assertEquals(valorADepositar, conta.getSaldo());
	}
	
	@Test
	public void devo_conseguir_retirar_um_valor_da_conta() {
		Conta conta = new Conta("João da Silva", "123-456");
		conta.depositar(100);
		double valorARetirar = 70;
		double saldoFinalEsperado = 30;
		double valorRetirado = conta.sacar(valorARetirar);
		assertEquals(valorARetirar, valorRetirado);
		assertEquals(saldoFinalEsperado, conta.getSaldo());
	}
	
	@Test
	public void devo_conseguir_transferir_valores_para_outra_conta() {
		Conta contaOrigem = new Conta("João da Silva", "123-456");
		contaOrigem.depositar(1000);
		double valorATransferir = 150;
		double saldoEsperadoOrigem = 1000 - valorATransferir;
		double saldoEsperadoDestino = valorATransferir;
		Conta contaDestino = new Conta("Maria da Silva", "123-457");
		contaOrigem.transferirPara(contaDestino, valorATransferir);
		assertEquals(saldoEsperadoOrigem, contaOrigem.getSaldo());
		assertEquals(saldoEsperadoDestino, contaDestino.getSaldo());
		
	}

}
