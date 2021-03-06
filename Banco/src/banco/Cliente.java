package banco;

public class Cliente extends Pessoa implements Comparable<Cliente> {

	private String cpf;

	private String rg;

	public Cliente() {

	}
	
	public Cliente(String nome){
		super(nome);
	}

	public Cliente( String nome, String cpf ) {

		super(nome);

		this.cpf = cpf;
	}

	public String getCpf() {

		return cpf;
	}

	public void setCpf(String cpf) {

		this.cpf = cpf;
	}

	public String getRg() {

		return rg;
	}

	public void setRg(String rg) {

		this.rg = rg;
	}

	@Override
	public final void ImprimeNome() {

		System.out.println("Nome do cliente é : " + getNome() + " Nº CPF: " + cpf + " Seu endereco :" + getEndereco());

	}
	
	@Override
	public String toString(){
		return getNome();
	}
	
	public int compareTo(Cliente o){
		return getNome().compareTo(o.getNome());
	}

}
