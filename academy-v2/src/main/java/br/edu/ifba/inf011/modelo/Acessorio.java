package br.edu.ifba.inf011.modelo;

public class Acessorio extends Equipamento{
	
	private String descricao;
	
	public Acessorio(String identificador, int quantidade, String descricao) {
		super(identificador, quantidade);
		this.descricao = descricao;
	}
	
	
	public Acessorio(String identificador, int quantidade) {
		this(identificador, quantidade, null);
	}
	
	public Acessorio() {
		super();
	}

	public String getDescricao() {
		return this.descricao;
	}	
	
	public String toString() {
		return "Acessório - " + super.toString() + " - " 
				+ this.getIdentificador();
	}

}
