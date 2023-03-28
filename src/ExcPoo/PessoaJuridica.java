package ExcPoo;

public class PessoaJuridica extends Cliente {

	private String cnpj;

	public PessoaJuridica(String nome, String cpf, String endereço, String telefone, int idade, String cnpj) {
		super(nome, cpf, endereço, telefone, idade);
		this.cnpj = cnpj;

	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void visualizar() {
		System.out.println("\nO nome do cliente é " +getNome()+" cpf: "+getCpf()+" endereço "+getEndereço()+" telefone"
				+ " "+getTelefone()+ " idade "+getIdade()+"cnpj:" +getCnpj());
	}

}
