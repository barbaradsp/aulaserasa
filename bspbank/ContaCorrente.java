package bspbank;

public class ContaCorrente extends Conta {
	
	private double limite;
	private double saldoComLimite;
	
	public ContaCorrente() {
		this.limite = 500.0;
	}
	
	@Override
	public boolean sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			return true;
		} else if (valor <= saldoComLimite) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
//	@Override
//	public boolean tranferir(double valor, Conta destinatario) {
//		double saldoTotal = saldo + limite;
//		if (valor > 0 && valor <= saldoTotal) {
//			saldoTotal -= valor;
//			destinatario.depositar(valor);
//			return true;
//		}
//		
//		return false;
//	}
	
	public double getLimite() {
		return this.limite;
	}
	
	public double getSaldoComLimite() {
		this.saldoComLimite = this.limite + super.saldo;
		return this.saldoComLimite;
	}
}
