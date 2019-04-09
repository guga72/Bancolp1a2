package TesteContas;
import Contas.Conta;
import Contas.ContaCorrente;
import org.junit.Test;

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