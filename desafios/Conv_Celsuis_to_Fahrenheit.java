package desafios;

import java.util.Scanner;

public class Conv_Celsuis_to_Fahrenheit {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("insira uma temperatura em Celsuis: ");
		
		Integer f = entrada.nextInt();
		
		final double c = (f * 9/5) + 32;
		System.out.printf("Resultado: %.0f Graus Fahrenheit", c);
	
		
		entrada.close();
		
		
		
		
		
	}

}
