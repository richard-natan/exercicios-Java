package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.preco = 1000;

		
		System.out.println(p1.precoComDesconto());
	}
}
