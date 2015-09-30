package teste;

public class ThreadNaoSincronizada {

	public static void main (String[] args){
		
		new ImprimeStringsThread("Voce", " aqui?");
		new ImprimeStringsThread("Muito bem", " Obrigado!");
		new ImprimeStringsThread("Como você", " está?");
		
	}
	
}
