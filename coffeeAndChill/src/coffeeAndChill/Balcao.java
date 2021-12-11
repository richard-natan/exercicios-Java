package coffeeAndChill;

public class Balcao {

	public static void main(String[] args) {
		//Bebidas
		Bebida cafe = new Bebida();
		Bebida capuccino = new Bebida("Capuccino", 5);
		Bebida cocaCola = new Bebida("CocaCola", 2);
		
		//Clientes
		Cliente cliente1 = new Cliente("Richard", 300);
		Cliente cliente2 = new Cliente("Paulo", 3290);
		Cliente cliente3 = new Cliente("Rodrigo", 1500);
		
		
		//Pedidos
		cliente1.comprarBebida(cafe, 2);
		cliente2.comprarBebida(capuccino, 5);
		cliente3.comprarBebida(cocaCola, 5);
	}
}
