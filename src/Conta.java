//Implementação de Interface - implements

public abstract class Conta implements InterfaceConta {
	
		//Atributos (private ou protect) - Encapsulamento
	
		private static final int AGENCIA_PADRAO = 1;
		
		private static int SEQUENCIAL = 1; //Constante
		
		protected int agencia;
		protected int numero;
		protected double saldo;
		protected Cliente cliente;

		//Construtores
		
		public Conta(Cliente cliente) {
			
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
		}	
		
		//Implementação dos Métodos
		
		@Override
		public void sacar(double valor) {
			
			this.saldo -= valor;
			
		}

		@Override
		public void depositar(double valor) {
			
			this.saldo += valor; //saldo = saldo + valor;
			
		}

		@Override
		public void transferir(double valor, Conta contaDestino) {
			
			this.sacar(valor);
			contaDestino.depositar(valor);
			
		}
		
		public int getAgencia() {
			return agencia;
		}

		public int getNumero() {
			return numero;
		}

		public double getSaldo() {
			return saldo;
		}
		
		protected void imprimirDadosConta() {
			System.out.println(String.format("Titular: %s", this.cliente.getNome()));
			System.out.println(String.format("Agencia: %d", this.agencia));
			System.out.println(String.format("Conta Corrente: %d", this.numero));
			System.out.println(String.format("Saldo: %.2f", this.saldo));
		}
}
