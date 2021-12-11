package classe.desafioDoModulo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		Comida c1 = new Comida("Arroz", 0.3);
		Comida c2 = new Comida("Carne", 2);
		
		
		System.out.println(p.dados());
		p.Comer(c1);
		
		System.out.println(p.dados());
		p.Comer(c2);
		
		System.out.println(p.dados());
	}
}
