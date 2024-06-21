package desafios;

import java.util.Scanner;

public class Conv_Farheintheit_to_Celsuis {
	
	public static void main(String[] args) {
		System.out.print("Insira uma temperatura em Fahrenheit: ");
		Scanner entrada = new Scanner(System.in);
		
		Integer f = entrada.nextInt();
		
		
		final Integer c = (f - 32) * 5/9;
		System.out.printf("resultado: %d Graus Celsuis", c);
		
	
	}

}
