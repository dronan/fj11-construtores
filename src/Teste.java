
public class Teste {

	public static void main(String[] args) {
		
		/*
		Conta minhaConta = new Conta();
		Cliente c = new Cliente();
		minhaConta.titular = c;
		
		c.nome = "Cliente";
		minhaConta.titular.nome = "Duke";
		
		Cliente clienteDaMinhaConta = minhaConta.titular;
		clienteDaMinhaConta.nome = "Diego";
		
		System.out.println(minhaConta.titular.nome);
		System.out.println(clienteDaMinhaConta.nome);
		System.out.println(c.nome);
		*/
		
		
		/**
		 * Deste modo não funciona: não ha um "new Cliente" declarado e o minhaConta tenta acessa-lo
		 * Para corrigir deve ser declarado um cliente: Cliente x = new Cliente(); , e fazer referencia a ele para o minhaConta -> minhaConta.titular = c; (lembrando que na Classe Conta esta "Cliente titular")
		 */
		//Conta minhaConta = new Conta();
		//minhaConta.titular.nome = "manoel";
		//ystem.out.println(minhaConta.titular.nome);
		
		
	}

}
