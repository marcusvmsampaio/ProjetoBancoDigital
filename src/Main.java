
public class Main {

	public static void main(String[] args) {
		
		//Cria��o do Cliente
		
		Cliente marcus = new Cliente();
		
		marcus.setNome("marcus");
		
		//Cria��o da contas
		
		Conta contaCorrente = new ContaCorrente(marcus);
		
		Conta contaPoupanca = new ContaPoupanca(marcus);
		
		//Transa��es banc�rias
		
		contaCorrente.depositar(100);
		
		contaCorrente.transferir(100, contaPoupanca);
		
		//Impress�o do extrato
		
		contaCorrente.imprimirExtrato();
		
		contaPoupanca.imprimirExtrato();

	}
}
