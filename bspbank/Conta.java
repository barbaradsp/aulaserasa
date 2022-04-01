package bspbank;

public class Conta {
	//atributos
	private int agencia;
	private int numeroConta;
	protected double saldo;
	private PessoaHeranca titular;
	
	//construtores
	public Conta() { //padrão
	}
	
	public Conta(int agencia, int numeroConta, PessoaHeranca titular) { //sobrecarregado
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0; // ao criar uma conta nova seu saldo é igual a 0
	}

	//métodos
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}

	public boolean sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean tranferir(double valor, Conta destinatario) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			destinatario.depositar(valor);
			return true;
		}
		
		return false;
	}
	
	//encapsulamentos
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() { // não existe método set associado ao Saldo pois não se deve alterar diretamente essa informação, ela deve ser somente exibida
		return saldo;
	}
	
	public PessoaHeranca getTitular() {
		return titular;
	}
	public void setTitular(PessoaHeranca titular) {
		this.titular = titular;
	}

}
