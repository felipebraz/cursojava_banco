package banco;

public class ExtratoContaCorrente {

	public static void main(String[] args) throws SaldoInsuficienteException {

		// Cria uma instância de ContaService onde está presente as operações para Objeto Conta
		ContaService operacoesConta = new ContaService();

		Cliente cliente1 = new Cliente("Aluno");
		Cliente cliente2 = new Cliente("Aluna");

		Conta correntista1 = new Conta(cliente1, 1001);
		Conta correntista2 = new Conta(cliente2, 21);

		// faz deposito
		operacoesConta.depositar(correntista1, 1000);

		// faz transferencia de correntista1 para correntista2 e salva em memoria a transação
		operacoesConta.transferir(correntista1, 450.00, correntista2);

		// faz transferencia de correntista1 para correntista2 e salva em memoria a transação
		operacoesConta.transferir(correntista2, 50.00, correntista1);

		IExtrato movimento = new ExtratoTXT(correntista1);
		System.out.println(movimento.formatar());

		IExtrato movimento1 = new ExtratoHTML(correntista1);
		System.out.println(movimento1.formatar());
	}

}
