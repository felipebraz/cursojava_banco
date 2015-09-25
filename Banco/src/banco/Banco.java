package banco;

import java.util.Collection;

public class Banco extends EntidadeBanco {
	
	private Long identificador;
	private int numero;
	private String nome;
	
	private Collection<Agencia> agencias;

	public Long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(Collection<Agencia> agencias) {
		this.agencias = agencias;
	}

	@Override
	public int hashCode() {
		return getNome().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		return getNome();
	}

}
