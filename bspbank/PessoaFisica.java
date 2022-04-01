package bspbank;
//classe filha
//é uma extensão da classe PessoaHeranca

public class PessoaFisica extends PessoaHeranca{
	
	private String cpf;
	private String rg;
	private String profissao;
	
	//utilizar ctrl+3 e pesquisar gcfs (generate constructor from superclass)
	public PessoaFisica() {
		super(); //busca as informações da classe mãe
	}
	
	//gcuf (generate constructor using fields)
	public PessoaFisica(String cpf, String rg, String profissao) {
		super(); 
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
	}
	
	//ggas (generate getters and setters)
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
}
