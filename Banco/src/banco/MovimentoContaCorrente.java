package banco;

public class MovimentoContaCorrente {

	public static void main(String[] args) {

		// Cria uma instância de ContaService onde está presente as operações para Objeto Conta
		ContaService operacoesConta = new ContaService();
		
		Cliente cliente1 = new Cliente("Aluno");
		Cliente cliente2 = new Cliente("Aluna");

		Conta correntista1 = new Conta(cliente1, 1001);
		Conta correntista2 = new Conta(cliente2, 21);

		// faz deposito
		operacoesConta.depositar(correntista1, 100);

		// faz Transferencia proibida
		try {
			operacoesConta.transferir(correntista1, 600, correntista2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// faz Transferencia autorizada
		try {
			operacoesConta.transferir(correntista1, 99.00, correntista2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		ExtratoTXT movimento = new ExtratoTXT(correntista1);
		System.out.println(movimento.formatar());
	}

}
