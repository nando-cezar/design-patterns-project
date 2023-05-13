package br.edu.ifba.inf011.strategy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import br.edu.ifba.inf011.modelo.programa.Serie;

public abstract class AbstractProgramaStrategy implements ProgramaStrategy{
	
	protected int atual;
	protected List<Serie> selectedSeries;
	
	public AbstractProgramaStrategy() {
		this.atual = 0;
	}
	
	public void reset(List<Serie> programa, LocalDate today) {
		this.atual = 0;
		if(eDiaDeDescanso(today))
			this.selectedSeries = new ArrayList<Serie>();
		else
			this.selectedSeries = this.filtrarSeries(programa, today);
	};

	public boolean eDiaDeDescanso(LocalDate today) {
		return this.restDay().contains(today.getDayOfWeek());
	}
	
	protected abstract List<Serie> filtrarSeries(List<Serie> series, LocalDate today);
	protected abstract List<DayOfWeek> restDay();
	
	@Override
	public boolean temProximo() {
		return (this.atual < this.selectedSeries.size());
	}

	@Override
	public Serie proximo() {
		Serie proximo = this.selectedSeries.get(this.atual);
		this.atual++;
		return proximo;
	}	
	
}
