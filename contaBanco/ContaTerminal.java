package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		System.out.println("<>>>>>>>>>>>>>>>>>>>>>> Ola, seja bem vindo! <<<<<<<<<<<<<<<<<<<<<<>  ");
		System.out.println("Para comcluir nosso cadastro preencha os campos abaixo corretamente! ");
		System.out.print("NUMERO: ");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("NOME: ");
		String nomeCliente = scanner.nextLine();
		
		System.out.print("AGENCIA: ");
		String agencia = scanner.nextLine();
		
		System.out.print("NUMERO: ");
		int numeroConta = scanner.nextInt();
		
		System.out.print("SALDO: ");
		double saldo = scanner.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque",nomeCliente,agencia,numeroConta,saldo);
		
		
		
		
		scanner.close();
	}
	

}
