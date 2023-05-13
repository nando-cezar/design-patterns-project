package br.edu.ifba.inf011.modelo.programa;

import java.util.Collection;

import br.edu.ifba.inf011.modelo.GrupoMuscular;
import br.edu.ifba.inf011.modelo.TipoExercicio;
import br.edu.ifba.inf011.modelo.exercicio.Exercicio;

public class Serie {
	
	private Exercicio exercicio;
	private int numRepeticoes;
	private int qtde;
	
	public Serie(Exercicio exercicio,
				int numRepeticoes,
				int qtde) {
		this.exercicio = exercicio;
		this.numRepeticoes = numRepeticoes;
		this.qtde = qtde;
	};
	
	public String toString() {
		return this.exercicio.getDescricao() + " " +
			   this.qtde + " x " + this.numRepeticoes; 
	}

	public void executar() {
		System.out.println(this);
	};
	
	public boolean isTipo(TipoExercicio tipo) {
		return this.exercicio.isTipo(tipo);
	}
	
	public boolean isTipo(Collection<TipoExercicio> tipos) {
		return this.exercicio.isTipo(tipos);
	}	
	
	public boolean isGrupo(GrupoMuscular grupo) {
		return this.exercicio.isGrupo(grupo);
	}
	
	public boolean isGrupo(Collection<GrupoMuscular> grupos) {
		return this.exercicio.isGrupo(grupos);
	}	

}
