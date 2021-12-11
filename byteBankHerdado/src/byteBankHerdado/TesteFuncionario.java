package byteBankHerdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario richard = new Funcionario();
		
		richard.setNome("Richard Natan");
		richard.setCpf("222.222.222-22");
		richard.setSalario(1500);
		
		System.out.println(richard.getNome());
		System.out.println(richard.getBonificacao());
		
	}
}
