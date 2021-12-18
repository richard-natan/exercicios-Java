package byteBankHerdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario richard = new Gerente();
		
		richard.setNome("Richard Natan");
		richard.setCpf("222.222.222-22");
		richard.setSalario(1500);
		
		System.out.println(richard.getNome());
		System.out.println(richard.getBonificacao());
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Paulo");
		g1.setCpf("665.665.665-55");
		g1.setSalario(5000);
		g1.setSenha(12345);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.autentica(12345));
		System.out.println(g1.getBonificacao());
	}
}
