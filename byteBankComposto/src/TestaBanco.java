
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente richard = new Cliente();
		richard.nome = "Richard Natan";
		richard.cpf = "222.222.222-22";
		richard.profissao = "estudante";
		
		Conta contaDoRichard = new Conta();
		contaDoRichard.deposita(100);
		
		contaDoRichard.titular = richard;
		
		System.out.println(contaDoRichard.titular.nome);
		System.out.println(contaDoRichard.getSaldo());
	}
}
