package br.edu.ifba.inf011.modelo.exercicio;

import br.edu.ifba.inf011.modelo.Equipamento;
import br.edu.ifba.inf011.modelo.GrupoMuscular;
import br.edu.ifba.inf011.modelo.TipoExercicio;

public interface ExercicioFactory {
	public ExercicioFactory clear();
	public ExercicioFactory descricao(String descricao);
	public ExercicioFactory withTipo(TipoExercicio tipo);
	public ExercicioFactory withGrupoMuscular(GrupoMuscular grupo);
	public ExercicioFactory withEquipamento(Equipamento equipamento);	
	public Exercicio build(String id);
}
