package banco;

import java.util.Collection;
import java.util.HashSet;

public class Agencia extends EntidadeBanco {
	
	private Long identificador;
	private String nome;
	private Banco banco;
	
	private Collection<Conta> contas;
	
	public Agencia(String nome){
		this.nome = nome;
		contas = new HashSet<Conta>();
	}
	
	public Agencia(String nome, Banco banco){
		this (nome);
		this.banco = banco;
	}

	public Long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Collection<Conta> getContas() {
		return contas;
	}

	public void setContas(Collection<Conta> contas) {
		this.contas = contas;
	}
	
	@Override
	public String toString(){
		return getNome();
	}
	
	@Override
	public int hashCode(){
		return getNome().hashCode();
	}
	
	
	@Override
	public boolean equals(Object objeto){
		boolean resultado = false;
		if((objeto != null) && (objeto instanceof Agencia)){
			Agencia a = (Agencia) objeto;
			if(getNome().equals(a.getNome())){
				resultado = true;
			}
		}
		return resultado;
	}
	
	
	
}
