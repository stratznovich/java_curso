package desafios;

import java.util.Scanner;

public class OperacaoBasica {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("1 > Insira um valor: ");
		
		Integer nota = entrada.nextInt();
		
		var resultado = nota >= 5 ? "aprovado!!" : "reprovado!!";
		System.out.println(resultado);
		
		entrada.close();
	}

}
