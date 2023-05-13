package br.edu.ifba.inf011.strategy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.edu.ifba.inf011.modelo.programa.Serie;

public class FullWorkout extends AbstractProgramaStrategy{
	
	@Override
	public List<Serie> filtrarSeries(List<Serie> programa, LocalDate today) {
		return programa;
	}
	
	@Override
	protected List<DayOfWeek> restDay() {
		return Arrays.asList(DayOfWeek.SUNDAY, 
					 		 DayOfWeek.TUESDAY,
							 DayOfWeek.THURSDAY,
							 DayOfWeek.SATURDAY);
	}	
	
	@Override
	public String getDescricao() {
		return "Full Workout";
	}


	

}
