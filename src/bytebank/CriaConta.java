package bytebank;

import bytebank.Conta;

public class CriaConta {
	public static void main(String[] args){
		Conta contaSandro = new Conta();
		Cliente clienteSandro = new Cliente();
		clienteSandro.nome = "Sandro";
		contaSandro.titular = clienteSandro;
		contaSandro.criarConta(contaSandro.titular, 1, 100, 300);
		System.out.println(contaSandro.titular.nome);
		contaSandro.sacarConta(400);
    }
		/*
		 * contaSandro.depositarConta(6000);
		 * 
		 * Conta contaMarcela = new Conta(); contaMarcela.criarConta(contaMarcela, 40,
		 * 222, 10000); if (contaMarcela.transferirDinheiro(300, contaSandro)) {
		 * System.out.println("Deu tudo certo"); } else {
		 * System.out.println("Nao deu certo..."); } System.out.println("Saldo: " +
		 * contaSandro.saldo);
		 */

}
