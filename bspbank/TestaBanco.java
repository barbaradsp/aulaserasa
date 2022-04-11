package bspbank;

import java.time.LocalDate;
import java.util.Locale;

// classe que utiliza os dados modelados em outras classes
public class TestaBanco {
	public static void main(String[] args) {
				
//		PessoaFisica pfBarbara = new PessoaFisica();
//		pfBarbara.setNome("Bárbara Pimenta"); //da classe mãe
//		pfBarbara.setEmail("abc@gmail.com");
//		pfBarbara.setTelefone("3198765432");  
//		pfBarbara.setCpf("577.288.842-04");   //da classe filha
//		pfBarbara.setProfissao("Programadora");
//		pfBarbara.setRg("4578472-3");
//
//		Conta conta1 = new Conta(); //instancia (= cópia) a classe Conta 
//		conta1.setAgencia(1234);
//		conta1.setNumeroConta(5678);
//		conta1.setTitular(pfBarbara); //referência da pessoa física
//		
//		conta1.depositar(1000);
//		
//		System.out.println("Agência: " + conta1.getAgencia());
//		System.out.println("Conta: " + conta1.getNumeroConta());
//		System.out.println("Títular: " + conta1.getTitular().getNome());
//		System.out.printf("Saldo: R$%.2f\n",  conta1.getSaldo());
//		
//		if (conta1.sacar(20)) {
//			System.out.println("\nSaque efetuado com sucesso.");
//		} else {
//			System.out.println("\nSaldo insuficiente para realizar o saque.");
//		}
//		System.out.printf("Saldo: R$%.2f\n", conta1.getSaldo());
//		
//		Conta conta2 = new Conta();
//		conta2.setAgencia(5582);
//		conta2.setNumeroConta(2234);
//		
//		if (conta1.tranferir(500, conta2)) {
//			System.out.println("\nTranferência realizada com sucesso.");
//		} else {
//			System.out.println("\nSaldo insuficiente para realizar a transferência.");
//		}
//		System.out.printf("Saldo Bárbara Pimenta: R$%.2f\n", conta1.getSaldo());
//		System.out.printf("Saldo José das Couves: R$%.2f\n", conta2.getSaldo());
//		
//		ContaCorrente cc1 = new ContaCorrente();
//		System.out.println("\nSaldo: R$" + cc1.getSaldo());
//		System.out.println("Limite: R$" + cc1.getLimite());
//		System.out.println("Saldo com limite: R$" + cc1.getSaldoComLimite());
//		
//		cc1.depositar(1000);
//		System.out.println("\nSaldo: R$" + cc1.getSaldo());
//		System.out.println("Limite: R$" + cc1.getLimite());
//		System.out.println("Saldo com limite: R$" + cc1.getSaldoComLimite());
//		
//		cc1.sacar(1400);
//		System.out.println("\nSaldo: R$" + cc1.getSaldo());
//		System.out.println("Limite: R$" + cc1.getLimite());
//		System.out.println("Saldo com limite: R$" + cc1.getSaldoComLimite());
		
		Locale.setDefault(new Locale("pt", "BR"));
		Gerente funcionario = new Gerente("Bárbara Pimenta", "123.456.789-00", "87759", 10000.0, LocalDate.now());
		
		System.out.println(funcionario.toString());
		System.out.println("Bônus: " + funcionario.getBonus());
		
		boolean resposta = funcionario.autenticarSistema("usuariopadrao", "senha123");
		if (resposta)
			System.out.println("\nBem-vinde " + funcionario.getNome());
		else
			System.out.println("\nUsuário ou senha inválida.");
		
		boolean respostaUm = funcionario.mudarSenha("senhapadrao", "senha123");
		if (respostaUm)
			System.out.println("\nSenha alterada com sucesso.");
		else
			System.out.println("\nSenha inválida.");

	}		
}
