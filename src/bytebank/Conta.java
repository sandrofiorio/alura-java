package bytebank;

import java.util.Scanner;

public class Conta {
	Scanner input = new Scanner(System.in);
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	void criarConta(Cliente titular, int numero, int agencia, double saldo) {
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}

	void depositarConta(double valor) {
		this.saldo += valor;

		System.out.println("Depositado R$ " + valor);
		System.out.println("Quer verificar o seu saldo? (Y/N)");
		String answer = input.nextLine().toLowerCase();
		verificarSaldo(answer);

	}

	public boolean sacarConta(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Seu novo saldo é... " + this.saldo);
			return true;
		} else {
			System.out.println("Saldo insuficiente. Seu saldo atual é: " + this.saldo);
			return false;
		}

	}

	void verificarSaldo(String ans) {
		switch (ans) {
		case "y":
			System.out.println("Seu saldo atual é: " + this.saldo);
			System.out.println("Deslogando...");
			break;

		case "n":
			System.out.println("Obrigado por utilizar nossos serviços, " + this.titular);
			System.out.println("Deslogando...");
			break;

		default:
			System.out.println("Opção inválida. Deslogando do sistema...");
			System.exit(1);

		}

	}

	void alterarAgencia(int agenciaNova) {
		this.agencia = agenciaNova;
		System.out.println("Agência alterada com sucesso... Sua nova agência é: " + this.agencia);

	}

	public boolean transferirDinheiro(double valor, Conta destino) {
		if (this.saldo >= valor) {
			System.out.println("Transferencia realizada com sucesso... Valor total transferido: " + valor);
			this.saldo -= valor;
			destino.depositarConta(valor);
			return true;
		} else {
			System.out.println("Transferência não realizada pois o valor de saldo é indisponível.");
			return false;
		}

	}
	public double retornaSaldo() {
		return this.saldo;
	}
}
