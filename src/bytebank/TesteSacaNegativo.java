package bytebank;

public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depositarConta(100);
		conta.sacarConta(200);
		
		System.out.println(conta.retornaSaldo());
	}

}
