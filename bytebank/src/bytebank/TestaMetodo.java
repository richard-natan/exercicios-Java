package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		Conta contaDoPedro = new Conta();
		
		contaDoPedro.saldo = 5000;
		conta.deposita(0);
		
		System.out.println(conta.saldo);
		System.out.println(contaDoPedro.saldo);
		
		contaDoPedro.transfere(2500, conta);
		
		System.out.println(contaDoPedro.saldo);
		System.out.println(conta.saldo);
		
		conta.titular = "Richard";
		System.out.println(conta.titular);
	}
}
