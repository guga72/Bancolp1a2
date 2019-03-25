package TesteContas;

import org.junit.jupiter.api.Test;

import Contas.Conta;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaTest {

    @Test
    public void teste_conta_construtor(){
        String titular = "João da Silva";
        String NumeroConta = "001";

        Conta conta = new Conta(NumeroConta, titular);

        assertNotNull(conta);
        assertEquals(titular, conta.getTitular());
        assertEquals(NumeroConta, conta.getNumerodaConta());
    }

    @Test
    public void teste_conta_TransferirPara(){
        Conta conta = new Conta("João da Silva", "001");
        double x = 1000;
        Conta outraconta = new Conta("Carlos da Silva", "002");
        conta.transferirPara(outraconta, x);
    }

    @Test
    public void teste_conta_sacar(){
        Conta conta = new Conta("João da Silva", "001");
        double x = 1000;
        conta.sacar(x);
    }

}
