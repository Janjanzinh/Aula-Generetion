package ExcPoo;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cli = new Cliente (" ery","40028922123","Rua do do cuscuz","1197894561",23);
		Cliente cli1 = new Cliente("jan","456789123","Rua do queijo","123456789",25);
		PessoaFisica cli2 = new PessoaFisica("jan","456789123","Rua do queijo","123456789",25,"2847245665");
		PessoaJuridica cli3 =  new PessoaJuridica("janil","4789513","ruazinha","1852845",25,"123587545");
		
		cli.visualizar();
		cli1.visualizar();
		cli2.visualizar();
		cli3.visualizar();
		
	}
    
}
