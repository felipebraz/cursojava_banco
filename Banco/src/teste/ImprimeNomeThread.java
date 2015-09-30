package teste;

public class ImprimeNomeThread extends Thread {
	
	public ImprimeNomeThread (String nome){
		super(nome);
		start();
	}
	
	public void run(){
		System.out.println("metodo run() da Thread " + this.getName() + " é chamado");
		for (int i = 0; i < 10; i++) {
			try{
				sleep(1000);
				System.out.println(i + ": " + this.getName());
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main (String[] args){
		
		System.out.println("Criando uma instânia");
		
		ImprimeNomeThread minhaThread1 = new ImprimeNomeThread("A");
		ImprimeNomeThread minhaThread2 = new ImprimeNomeThread("B");
		ImprimeNomeThread minhaThread3 = new ImprimeNomeThread("C");
		
		System.out.println("Chamando o método start" + minhaThread1.getName());
		System.out.println("Chamando o método start" + minhaThread2.getName());
		System.out.println("Chamando o método start" + minhaThread3.getName());
		
//		minhaThread1.start();
//		minhaThread2.start();
//		minhaThread3.start();
		
	}

}
