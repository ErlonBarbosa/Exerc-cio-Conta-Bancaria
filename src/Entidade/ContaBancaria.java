package Entidade;

public class ContaBancaria {
	
	private String nome;
	private int conta;
	private double valor;
	
	
	public ContaBancaria(int conta, String nome, double valor) {
		
		this.nome = nome;
		this.conta = conta;
		this.valor = valor;
	}
	

	public ContaBancaria(int conta, String nome) {
		
		this.nome = nome;
		this.conta = conta;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getConta() {
		return conta;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public double getValor() {
		return valor;
	}

	
	public double addValor(double valor) {
		return this.valor += valor;
	}
	
	public double removerValor(double valor) {
		return this.valor -= valor + 5;
	}
	
	public String toString() {
		return "Conta: "
		+ conta
		+", Nome: "
		+ nome
		+ ", Saldo em conta: "
		+ valor;
	}

}
