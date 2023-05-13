package br.edu.ifba.inf011.strategy;

import java.time.LocalDate;
import java.util.List;


import br.edu.ifba.inf011.modelo.programa.Serie;

public interface ProgramaStrategy {
	
	public boolean temProximo();
	public Serie proximo();
	public void reset(List<Serie> series, LocalDate today);
	public String getDescricao();
	

}
