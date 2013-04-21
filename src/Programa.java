
public class Programa {
	public static void main(String[] args) {
		Conta minhaConta; // CLASSE variavelQueRepresentaAClasse
		minhaConta = new Conta(); // variavelQueRepresentaAClasse = new Classe
		
		minhaConta.setDono("Duke"); //variavelQueRepresentaAClasse . variavel de classe ou Atributo = valor a ser definido para ela
		minhaConta.setSaldo(1000);
		
		//System.out.println("Saldo atual: "+minhaConta.saldo);
		
		//saca
		minhaConta.saca(900); // acessa a classe conta, pela variavel minha conta e utiliza o metodo saca | variavelQueRepresentaAClasse . metodo (argumento do metodo)
		System.out.println("Saldo atual: "+minhaConta.getSaldo());
		
		//deposita
		minhaConta.deposita(500);
		System.out.println("Saldo atual: "+minhaConta.getSaldo());
		
		minhaConta.setSaldo(1000);
		boolean consegui = minhaConta.saca(3000);
		if (consegui){
			System.out.println("Consegui sacar");
		}else{
			System.out.println("Não consegui sacar");
		}
		
		// ou sem a variavel, colocando a invocação do metodo saca dentro do if
		/*
		minhaConta.saldo = 1000;
		if (minhaConta.saca(100)){
			System.out.println("Consegui sacar");
		}else{
			System.out.println("Não consegui sacar");
		}
		*/
		
		
		
	}
}
