package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.printf("%f e %f\n",a,b);
		
		Data d1 = new Data();
		
		Data d2 = d1;
	
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
	}
}
