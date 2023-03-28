package ExcPoo;

public class PessoaFisica extends Cliente {

	private String RG;

	public PessoaFisica(String nome, String cpf, String endereço, String telefone, int idade, String rG) {
		super(nome, cpf, endereço, telefone, idade);
		RG = rG;

	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public void visualizar() {
		System.out.println("\nO nome do cliente é " +getNome()+" cpf: "+getCpf()+" endereço "+getEndereço()+" telefone"
				+ " "+getTelefone()+ " idade "+getIdade()+"rg:" +getRG());

	}
}