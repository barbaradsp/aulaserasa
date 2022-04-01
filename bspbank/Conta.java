package bspbank;

public class Conta {
	//atributos
	private int agencia;
	private int numeroConta;
	private double saldo;
	private String titular;
	
	//construtores
	public Conta() { //padr�o
	}
	
	public Conta(int agencia, int numeroConta, String titular) { //sobrecarregado
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0; // ao criar uma conta nova seu saldo � igual a 0
	}

	//m�todos
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
	
	public double getSaldo() { // n�o existe m�todo set associado ao Saldo pois n�o se deve alterar diretamente essa informa��o, ela deve ser somente exibida
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}

}
