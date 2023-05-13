package br.edu.ifba.inf011.modelo.exercicio;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.modelo.Equipamento;
import br.edu.ifba.inf011.modelo.GrupoMuscular;
import br.edu.ifba.inf011.modelo.TipoExercicio;

public class ExercicioBuilder implements ExercicioFactory{

	private String descricao;	
	private List<TipoExercicio> tipos;
	private List<GrupoMuscular> gruposMusculares;
	private List<Equipamento> equipamentos;	
	
	
	public static ExercicioBuilder getFactory() {
		return new ExercicioBuilder();
	}
	
	@Override
	public ExercicioFactory clear() {
		this.descricao = null;
		this.tipos = new ArrayList<TipoExercicio>();
		this.gruposMusculares = new ArrayList<GrupoMuscular>();
		this.equipamentos = new ArrayList<Equipamento>();
		return this;
	}

	@Override
	public ExercicioFactory descricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	@Override
	public ExercicioFactory withTipo(TipoExercicio tipo) {
		this.tipos.add(tipo);
		return this;
	}

	@Override
	public ExercicioFactory withGrupoMuscular(GrupoMuscular grupo) {
		this.gruposMusculares.add(grupo);
		return this;
	}

	@Override
	public ExercicioFactory withEquipamento(Equipamento equipamento) {
		this.equipamentos.add(equipamento);
		return this;
	}

	@Override
	public Exercicio build(String id) {
		return new Exercicio(id, this.descricao, tipos, gruposMusculares, equipamentos);
	}

}
