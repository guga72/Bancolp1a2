package TesteContas;

import Contas.Conta;
import org.junit.jupiter.api.Test;

import Contas.ContaCorrente;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaCorrenteTest {

    @Test
    public void ContaCorrente_debitarJuros(){
        Conta conta = new ContaCorrente("João da Silva", "001");
        ((ContaCorrente) conta).debitarJuros();
    }

    @Test
    public void CoCorrente_sacar(){
        Conta conta = new ContaCorrente("João da Silva", "001");
        double x = 100;
        conta.sacar(x);
    }

}