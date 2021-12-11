package coffeeAndChill;

public class Bebida {

	private String nome;
	private double preco;
	
	public Bebida() {
		this.nome = "Café";
		this.preco = 2.00;
	}
	
	public Bebida(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
}
