package teste;

public class ImprimeStringsThread implements Runnable {

	Thread thread;
	String str1, str2;
	DuasStrings ds = new DuasStrings();

	ImprimeStringsThread(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		synchronized (ds) {

			ds.print(str1, str2);
		}
	}

}
