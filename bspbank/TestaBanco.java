package bspbank;
// classe que utiliza os dados modelados em outras classes
public class TestaBanco {
	public static void main(String[] args) {
				
//		Pessoa pessoaNova = new Pessoa(); //instância a classe Pessoa
//		pessoaNova.setNome("José das Couves");
//		pessoaNova.setProfissao("Agricultor");
//		pessoaNova.setCpf("973.525.106-05");
//		System.out.println("Nome: " + pessoaNova.getNome());
		
//		Pessoa pessoaComConstrutor = new Pessoa("Maria dos Tomates", "973.525.106-05", "12345678");
//		System.out.println("Nome: " + pessoaComConstrutor.getNome());
//		System.out.println("CPF: " + pessoaComConstrutor.getCpf());
//		System.out.println("RG: " + pessoaComConstrutor.getRg());	
		
		Conta conta1 = new Conta(); // instância (= cópia) a classe Conta 
		conta1.setAgencia(1234);
		conta1.setNumeroConta(5678);
		conta1.setTitular("Bárbara Pimenta");
		
		conta1.depositar(1000);
		
		System.out.println("Agência: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getNumeroConta());
		System.out.println("Títular: " + conta1.getTitular());
		System.out.printf("Saldo: R$%.2f\n",  conta1.getSaldo());
		
		
		if (conta1.sacar(20)) {
			System.out.println("\nSaque efetuado com sucesso.");
		} else {
			System.out.println("\nSaldo insuficiente para realizar o saque.");
		}
		
		System.out.printf("Saldo: R$%.2f\n", conta1.getSaldo());
		
		Conta conta2 = new Conta(4321, 8765, "José das Couves"); //conta criada utilizando o construtor sobrecarregado
		
		if (conta1.tranferir(500, conta2)) {
			System.out.println("\nTranferência realizada com sucesso.");
		} else {
			System.out.println("\nSaldo insuficiente para realizar a transferência.");
		}
		
		System.out.printf("Saldo Bárbara Pimenta: R$%.2f\n", conta1.getSaldo());
		System.out.printf("Saldo José das Couves: R$%.2f\n", conta2.getSaldo());
		
	}		
}
