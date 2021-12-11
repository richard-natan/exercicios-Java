
public class TestaGetSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(10,10);
		Cliente richard = new Cliente();
		
		conta.setNumero(1977);
		System.out.println("Numero da Conta: " + conta.getNumero());
		conta.setAgencia(10);
		System.out.println("Numero da agencia: " + conta.getAgencia());

		richard.setNome("Richard Natan");
		conta.setTitular(richard);
		conta.getTitular().setCpf("222.222.222-12");
		System.out.println(conta.getTitular().getCpf());
	}
}
