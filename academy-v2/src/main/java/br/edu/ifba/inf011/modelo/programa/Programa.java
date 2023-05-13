package br.edu.ifba.inf011.modelo.programa;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.modelo.exercicio.Exercicio;
import br.edu.ifba.inf011.observer.FimProgramaEvento;
import br.edu.ifba.inf011.observer.FimProgramaSubscriber;
import br.edu.ifba.inf011.strategy.FullWorkout;
import br.edu.ifba.inf011.strategy.ProgramaStrategy;
import br.edu.ifba.inf011.strategy.TipoPrograma;

public class Programa {

	private List<Serie> series;
	private ProgramaStrategy strategy;
	private List<FimProgramaSubscriber> subscribers;
	
	
	public Programa(List<Serie> series) {
		this.series = new ArrayList<Serie>(series);
		this.subscribers = new ArrayList<FimProgramaSubscriber>();
		this.setProgramaStrategy(new FullWorkout());
	}

	public void addSerie(Serie serie) {
		this.series.add(serie);
	}
	
	public void addSerie(Exercicio exercicio,
			int numRepeticoes,
			int qtde) {
		this.addSerie(new Serie(exercicio, numRepeticoes, qtde));
	}
	
	public void setProgramaStrategy(ProgramaStrategy strategy) {
		this.strategy = strategy;
		this.init();
	}
	
	public void setProgramaStrategy(TipoPrograma tipo) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		this.strategy = tipo.getInstance();
		this.init();
	}	
	
	public void init(LocalDate date) {
		this.strategy.reset(this.series, date);
	}
		
	
	public void init() {
		this.init(LocalDate.now());
	}
	
	public boolean temProximo() {
		boolean bTemProximo = this.strategy.temProximo();
		if(!bTemProximo)
			this.notifyFimPrograma();
		return bTemProximo;
	};
	
	public Serie proximo() {
		return this.strategy.proximo();
	};	
	
	public void addFimProgramaSubscriber(FimProgramaSubscriber subscriber) {
		this.subscribers.add(subscriber);
	};

	public void removeFimProgramaSubscriber(FimProgramaSubscriber subscriber) {
		this.subscribers.remove(subscriber);
	};
	
	public void notifyFimPrograma() {
		for(FimProgramaSubscriber subscriber : this.subscribers)
			subscriber.fimDePrograma(new FimProgramaEvento(LocalDateTime.now(), this.strategy.getDescricao()));
	}
	
}
