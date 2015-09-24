package banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Conta extends EntidadeBanco {

	private Long identificador;

	private int numero;

	private Cliente titular;

	private Date dataAbertura;

	private double saldo;
	
	private Agencia agencia;

	private ArrayList movimento;
	
	private Collection<Transacao> transacoes;
	

	// construtor padrão da classe Conta que define a data de criação da conta e inicializa o array de transacao
	public Conta() {

		dataAbertura = UtilData.data();
		movimento = new ArrayList();
	}

	// construtor com dois parametros
	public Conta(Cliente nome, int nconta ) {

		this();
		numero = nconta;
		titular = nome;
		saldo = 0.0; // Conta em reais e zerada
	}

	@Override
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

	public Cliente getTitular() {

		return titular;
	}

	public void setTitular(Cliente titular) {

		this.titular = titular;
	}

	public Date getDataAbertura() {

		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {

		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {

		return saldo;
	}

	public void setSaldo(double saldo) {

		this.saldo = saldo;
	}

	public ArrayList getMovimento() {

		return movimento;
	}

	public void setMovimento(ArrayList movimento) {

		this.movimento = movimento;
	}
	
	@Override 
	public boolean equals(Object objeto){
		boolean resultado = false;
		if((objeto != null) && (objeto instanceof Conta)){
			Conta c = (Conta) objeto;
			if (getNumero() == c.getNumero()){
				resultado = true;
			}
		}
		return resultado;
	}
	
	@Override
	public int hashCode(){
		return getNumero();
	}
	
	@Override
	public String toString(){
		return getNumero() + " " + getTitular().getNome();
	}

}
