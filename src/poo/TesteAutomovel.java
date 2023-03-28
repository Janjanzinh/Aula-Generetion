package poo;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Instanciando um objeto da classe automovel
		
		Automovel auto1 = new Automovel("Janilson","monza","EOM5555",1998);
		
		auto1.imprimirInfo();
		
		System.out.println("\nTransferencia de proprietário");
		
		auto1.setNomeProprietario("José");
		auto1.imprimirInfo();
		
		System.out.println("\nMudança de placa");
		
		auto1.setPlaca("abcd111");
		auto1.imprimirInfo();

	}

}
