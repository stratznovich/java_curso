package Dio_java;

public class Usuario{
	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		System.out.println("A tv esta ligada ? " + smartTv.ligado);
		
		smartTv.ligar();
		System.out.println("Qual canal atual ? " + smartTv.canal);
		
		smartTv.mudarCanal(13);
		
		System.out.println("A tv esta ligada ? " + smartTv.ligado);
		System.out.println("Qual canal atual ? " + smartTv.canal);
		
	}
}



