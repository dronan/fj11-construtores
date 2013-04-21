public class TestaAcessoComPegaSaldo {

	public static void main(String[] args) {
		Cliente carlos = new Cliente();
		carlos.nome = "Carlos";
		carlos.cpf = "123";
		carlos.sobrenome = "jose";

		Conta minhaConta = new Conta(carlos);
		
		System.out.println(minhaConta.getTitular().nome);

		minhaConta.deposita(1000);
		System.out.print("Saldo: " + minhaConta.pegaSaldo());

	}

}
