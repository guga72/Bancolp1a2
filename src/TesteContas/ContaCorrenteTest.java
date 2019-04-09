package TesteContas;
import Contas.Conta;
import Contas.ContaCorrente;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ContaCorrenteTest {

    @Test
    public void ContaCorrente_debitarJuros(){
        ContaCorrente conta = new ContaCorrente("João da Silva", "001");
        conta.debitarJuros();
    }

    @Test
    public void CoCorrente_sacar(){
        ContaCorrente conta = new ContaCorrente("João da Silva", "001");
        double x = 100;
        conta.depositar(x);
        double esperadoaRetirado = 70 + 70 * 0.01;
        double valorARetirar = 70;
        double saldoFinalEsperado = 100 - esperadoaRetirado ;
        double valorRetirado = conta.sacar(valorARetirar);
        assertEquals(esperadoaRetirado, valorRetirado);
		assertEquals(saldoFinalEsperado, conta.getSaldo());
    }
    
    @Test
    public void LimiteChequeEspecial() {
    	ContaCorrente conta = new ContaCorrente("João da Silva", "001");
    }

}