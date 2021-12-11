package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data dataAtual = new Data(13,13,2013);
		
		Data dataDeNascimento = new Data(16,06,2003);
		
		
		
		System.out.printf(dataAtual.obterData() + "\n");
		System.out.printf(dataDeNascimento.obterData());
		
	}
}
