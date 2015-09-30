package teste;

public class ImprimeNomeRunnable implements Runnable {

	String nome;

	public ImprimeNomeRunnable(String nome) {
		this.nome = nome;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + nome);

		}
	}
	
	public static void main(String[] args){
		ImprimeNomeRunnable pntr1 = new ImprimeNomeRunnable("RA");
		Thread t1 = new Thread(pntr1);
		t1.start();
		
		ImprimeNomeRunnable pntr2 = new ImprimeNomeRunnable("RB");
		Thread t2 = new Thread(pntr2);
		t2.start();
		
		ImprimeNomeRunnable pntr3 = new ImprimeNomeRunnable("RC");
		Thread t3 = new Thread(pntr3);
		t3.start();
	}
}
