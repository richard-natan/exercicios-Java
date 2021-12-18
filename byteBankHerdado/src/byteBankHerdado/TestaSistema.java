package byteBankHerdado;

public class TestaSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autenticou(g);
		si.autenticou(adm);
	}
}
