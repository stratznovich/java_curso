package desafios;

import java.util.Scanner;

public class Area_triangulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.print("Insira o valor da altura: ");
		double altura = entrada.nextDouble();
		
		double resultado = (base * altura) / 2; 
		
		System.out.printf("A area do triangulo e %.0fcm", resultado);
		
		entrada.close();
	}

}
