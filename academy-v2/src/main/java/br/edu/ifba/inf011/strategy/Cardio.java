package br.edu.ifba.inf011.strategy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.edu.ifba.inf011.modelo.TipoExercicio;
import br.edu.ifba.inf011.modelo.programa.Serie;

public class Cardio  extends AbstractProgramaStrategy implements ProgramaStrategy {
	
	@Override
	public String getDescricao() {
		return "Cardio";
	}

	@Override
	protected List<DayOfWeek> restDay() {
		return Arrays.asList(DayOfWeek.SUNDAY, 
							 DayOfWeek.TUESDAY,
							 DayOfWeek.THURSDAY,
							 DayOfWeek.SATURDAY);
	}	
	
	@Override
	protected List<Serie> filtrarSeries(List<Serie> series, LocalDate today) {
		return series
			  .stream()
			  .filter(s -> s.isTipo(TipoExercicio.Cardiovascular))
			  .collect(Collectors.toList());
	}

}
