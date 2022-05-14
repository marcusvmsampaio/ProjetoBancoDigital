
public class Main {

	public static void main(String[] args) {
		
		//Criação do Cliente
		
		Cliente marcus = new Cliente();
		
		marcus.setNome("marcus");
		
		//Criação da contas
		
		Conta contaCorrente = new ContaCorrente(marcus);
		
		Conta contaPoupanca = new ContaPoupanca(marcus);
		
		//Transações bancárias
		
		contaCorrente.depositar(100);
		
		contaCorrente.transferir(100, contaPoupanca);
		
		//Impressão do extrato
		
		contaCorrente.imprimirExtrato();
		
		contaPoupanca.imprimirExtrato();

	}
}
