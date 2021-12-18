package byteBankHerdado;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		ControleBonificacao controle = new ControleBonificacao();
		g1.setSalario(5000);
		System.out.println(g1.getBonificacao());
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(3000);
		System.out.println(ev.getBonificacao());
		
		controle.registra(g1);
		controle.registra(ev);
		
		
		System.out.println(controle.getSoma());
		
		
		
		
	}
}
