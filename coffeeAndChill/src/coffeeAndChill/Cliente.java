package coffeeAndChill;

public class Cliente {

	private double dinheiro;
	private String nome;
	
	public Cliente(String nome, double dinheiro) {
		this.nome = nome;
		this.dinheiro = dinheiro;
	}
	
	void comprarBebida(Bebida pedido, int quantidade){
		if (this.dinheiro >= pedido.getPreco()) {
			if (quantidade > 0) {
				this.dinheiro -= (pedido.getPreco() * quantidade);
				System.out.printf(" --> Obrigado pelo pedido! saindo %d %s(s)\n", quantidade, pedido.getNome());
			} else {
				System.out.println(" --> Insira uma quantidade valida");
			}
			
			System.out.printf("(dinheiro atual do cliente %s: R$%.2f)\n\n", getNome(), getDinheiro());
		} else {
			System.out.printf("Sinto muito, você não tem dinheiro suficiente para comprar o %s, ele custa R$%.2f\n\n", pedido.getNome(), pedido.getPreco());
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getDinheiro() {
		return dinheiro;
	}
	
	
}
