public class Conta {
	private int numero;
	private String dono;
	private double saldo;
	private double limite;
	private Cliente titular;

	private static int totalDeContas;

	/*
	 * TestaAcessoComPegaSaldo
	 */

	Conta(Cliente titular) {
		Conta.totalDeContas++;
		this.titular = titular;
	}

	Conta() {
	}

	// Conta(int numero, Cliente titular){
	// this(titular);
	// this.numero = numero;
	// }

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return this.limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public String getDono() {
		return this.dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// Classe Cliente, variavel titular
	// Cliente titular = new Cliente(); //usar assim somente se toda conta a ser
	// invocada deve ser associado um cliente.

	/*
	 * Metodo sem retorno de valor
	 * 
	 * void saca(double quantidade){ //double novoSaldo = this.saldo -
	 * quantidade; //this.saldo = novoSaldo; saldo -= quantidade; }
	 */
	/*
	 * Metodo com retorno de valor
	 */
	boolean saca(double valor) {
		if (saldo < valor) {
			return false;
		} else {
			saldo -= valor;
			return true;
		}
	}

	void deposita(double quantidade) {
		// this.saldo += quantidade;
		saldo += quantidade;
	}

	public double pegaSaldo() {
		return this.saldo;
	}

	/*
	 * Metodo simplismente tranfere o valor sem se importar se ha ou não saldo
	 * disponivel
	 * 
	 * void transfere(Conta destino, double valor) { this.saldo = this.saldo -
	 * valor; destino.saldo = destino.saldo + valor; }
	 */
	/*
	 * Modo que verifica se ha um saldo antes de sacar
	 */

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor); // retorna true ou false; true ja
											// faz o saque
		if (retirou == false) {
			return false; // não ha saldo para sacar, conforme especificado no
							// metodo saca
		} else {
			destino.deposita(valor); // variavelDeClasse - definida nos
										// argumentos do void transfere + metodo
										// + valor
			return true;
		}
	}

}
