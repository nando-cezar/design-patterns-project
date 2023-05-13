package br.edu.ifba.inf011.strategy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import br.edu.ifba.inf011.modelo.GrupoMuscular;
import br.edu.ifba.inf011.modelo.programa.Serie;

public class ABCD extends AbstractProgramaStrategy implements ProgramaStrategy {
	
	@Override
	protected List<DayOfWeek> restDay() {
		return Arrays.asList(DayOfWeek.SUNDAY, 
							 DayOfWeek.FRIDAY,
							 DayOfWeek.SATURDAY);
	}	
	
	@Override
	protected List<Serie> filtrarSeries(List<Serie> series, LocalDate today) {
		return series
			   .stream()
			   .filter(s -> s.isGrupo(this.getGrupos(today)))
			   .collect(Collectors.toList());		
	}	

	/*A – Segunda – Ombros / Abdominal; B – Terça - Membros Inferiores; C- Quarta -
	Peitoral / Tríceps; D – Quinta – Costa / Bíceps, e nenhum de Sexta a Domingo*/
	
	public Collection<GrupoMuscular> getGrupos(LocalDate today) {
		switch(today.getDayOfWeek()) {
			case MONDAY :
				return Arrays.asList(GrupoMuscular.Ombros, GrupoMuscular.Abdominal); 
			case TUESDAY:
				return Arrays.asList(GrupoMuscular.Inferiores);
			case WEDNESDAY:
				return Arrays.asList(GrupoMuscular.Peito, GrupoMuscular.Triceps);
			case THURSDAY:
				return Arrays.asList(GrupoMuscular.Costa, GrupoMuscular.Biceps);
			default:
				return new ArrayList<GrupoMuscular>(); 
		}
	}

	@Override
	public String getDescricao() {
		return "ABCD";
	}

}
