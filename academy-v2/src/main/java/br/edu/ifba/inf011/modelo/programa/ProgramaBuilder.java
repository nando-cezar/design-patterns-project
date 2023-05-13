package br.edu.ifba.inf011.modelo.programa;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifba.inf011.modelo.exercicio.Exercicio;

public class ProgramaBuilder implements ProgramaFactory{

	private List<Serie> series;
	
	
	public static ProgramaBuilder getFactory() {
		return new ProgramaBuilder();
	}
	
	@Override
	public ProgramaBuilder clear() {
		this.series = new ArrayList<Serie>();
		return this;
	}

	@Override
	public ProgramaBuilder withSerie(Exercicio exercicio, int numRepeticoes, int qtde) {
		this.series.add(new Serie(exercicio, numRepeticoes, qtde));
		return this;
	}
	
	@Override
	public ProgramaFactory withSerie(Serie serie) {
		this.series.add(serie);
		return null;
	}	
	
	@Override
	public ProgramaBuilder withTipoPrograma(String tipo) {
		return this;
	}

	@Override
	public Programa build() {
		return new Programa(this.series);
	}



}
