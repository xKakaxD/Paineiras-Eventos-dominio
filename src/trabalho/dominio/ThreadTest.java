package trabalho.dominio;

public class ThreadTest extends Thread{
	
	//Sobrescrevemos o método run da classe thread
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Número: " + i);
				//Faz a thread "dormir" por 500 ms
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			//Se a thread for interrompida exibe uma msg
			System.out.println("A thread foi interrompida");
			}
		
		}
		
		public static void main(String[] args){
			//Cria uma instância da thread
			ThreadTest minhaThread = new ThreadTest();
			//Inicia a Thread
			minhaThread.start();
			//Código inicial ao método main para demonstrar paralelamente que está rodando a thread
			System.out.println("A Thread foi iniciada e o método main continua...!");
		}
	
}
