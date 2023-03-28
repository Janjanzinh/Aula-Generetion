package ExcPoo;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endereço;
	private String telefone;
	private int idade;
	public Cliente(String nome, String cpf, String endereço, String telefone, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereço = endereço;
		this.telefone = telefone;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void visualizar() {
		System.out.println("\nO nome do cliente é " +nome+" cpf: "+cpf+" endereço "+endereço+" telefone "+telefone+ " idade "+idade);
		
	}
    
}