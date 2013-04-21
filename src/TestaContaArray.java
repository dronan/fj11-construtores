
public class TestaContaArray {
	public static void main (String [] args ){
		
		Conta contaNova = new Conta();
		contaNova.setSaldo(100);
		
			Conta[] minhasContas;
			minhasContas = new Conta[10];
		
		minhasContas[0] = contaNova;
		
		minhasContas[2] = new Conta();
		minhasContas[2].setSaldo(300); 

		System.out.println(minhasContas[0].getSaldo());
		
		minhasContas[1] = new Conta();
		minhasContas[1].setSaldo(200);
		
		System.out.println(minhasContas[1].getSaldo());
		System.out.println(minhasContas[2].getSaldo());
		
	
		
	}
	
}
