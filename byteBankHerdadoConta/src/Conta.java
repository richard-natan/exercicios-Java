public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	
	public Conta(int numero, int agencia) {
		Conta.total++;
		//System.out.println("Criando uma conta...");
		this.agencia = agencia;
		this.numero = numero;
		//System.out.printf("Conta criada, total de contas: %d\n\n", Conta.total);
	}
	
	
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor){
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	void setNumero(int numero){
		if (numero <= 0) {
			System.out.println("Somente valores positivos");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Somente valores positivos");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
