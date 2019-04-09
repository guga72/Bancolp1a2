package Contas;

public class LimiteZerado extends RuntimeException {
	public LimiteZerado(String msg) {
		super(msg);
	}
}
