
public class TestaReferencias {
	public static void main (String [] args){
		Conta c1;
		c1 = new Conta();
		c1.deposita(100);
		
		Conta c2 = c1;
		c2.deposita(300);
		
		System.out.println("Saldo c1: "+c1.getSaldo());
		System.out.println("Saldo c2: "+c2.getSaldo());
	}
}
