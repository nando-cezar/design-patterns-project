package br.edu.ifba.inf011.modelo.programa;

import br.edu.ifba.inf011.modelo.exercicio.Exercicio;

public interface ProgramaFactory {
	public ProgramaFactory clear();
	public ProgramaFactory withSerie(Serie serie);
	public ProgramaFactory withSerie(Exercicio exercicio, int numRepeticoes, int qtde);
	public ProgramaFactory withTipoPrograma(String tipo);
	public Programa build();
}
