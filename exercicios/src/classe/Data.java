package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		this(01,01,1970);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterData(){
		String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	};
}
