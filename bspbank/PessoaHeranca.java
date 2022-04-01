package bspbank;
//classe m�e

public class PessoaHeranca {
	//atributos
	private String nome;
	private String email;
	private String telefone;
	
	//construtores
	public PessoaHeranca() {
	}
	
	public PessoaHeranca(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	//encapsulamentos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
