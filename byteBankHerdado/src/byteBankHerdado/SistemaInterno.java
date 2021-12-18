package byteBankHerdado;

public class SistemaInterno {

	private int senha = 2222;
	
	public void autenticou(FuncionarioAutenticavel fa) {
		if (fa.autentica(this.senha)) {
			System.out.println("Entrou");
		} else {
			System.out.println("Não Entrou");
		}
	}
}
