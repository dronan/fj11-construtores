
public class TestaContasIguais {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		c1.setDono("Duke");
		c1.setSaldo(227);
		
		Conta c2 = new Conta();
		c2.setDono("Duke");
		c2.setSaldo(227);
		
		if (c1 == c2){
			System.out.println("Contas iguais");
		}
		
		System.out.println("Saldo de c1, antes de tx "+c1.getSaldo());
		System.out.println("Saldo de c2, antes de tx "+c2.getSaldo());
		
		c1.transfere(c2, 100);
		
		System.out.println("Saldo de c1, depois de tx "+c1.getSaldo());
		System.out.println("Saldo de c2, depois de tx "+c2.getSaldo());
		
		
		
	}

}
