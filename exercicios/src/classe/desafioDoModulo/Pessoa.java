package classe.desafioDoModulo;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(){
		nome = "fulano";
		peso = 20;
	}
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void Comer(Comida alimento) {
		if (alimento != null) {
			System.out.printf("Comendo %s...\n\n", alimento.nome);
			this.peso += alimento.caloria;
		}
	}
	
	String dados() {
		return String.format("Peso atual: %.2f", this.peso);
	}
}
