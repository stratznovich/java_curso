package Dio_java;

public class SmartTv {
	
		boolean ligado = false;
		int canal = 10;
		int vol = 25;
		
		public void mudarCanal(int novoCanal) {
			canal = novoCanal;	
		}
		
		public void ligar() {
			ligado = true;
		}
			
		public void desligar() {
			ligado = false;
		}
		
		public void aumentarCanal() {
			canal++;	
		}
		
		public void diminuirCanal() {
			canal--;
		}
		
		
}
