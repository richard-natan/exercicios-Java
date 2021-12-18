
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(10, 20);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(100, 200);
		cp.deposita(100);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		cc.transfere(10, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}
}
