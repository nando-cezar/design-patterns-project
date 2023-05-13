package br.edu.ifba.inf011.modelo.exercicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.edu.ifba.inf011.modelo.Equipamento;
import br.edu.ifba.inf011.modelo.GrupoMuscular;
import br.edu.ifba.inf011.modelo.TipoExercicio;

public class Exercicio {

	private String id;
	private String descricao;	
	private List<TipoExercicio> tipos;
	private List<GrupoMuscular> gruposMusculares;
	private List<Equipamento> equipamentos;
	
	
	protected Exercicio(String id, String descricao, List<TipoExercicio> tipos,
					 List<GrupoMuscular> gruposMusculares, 
					 List<Equipamento> equipamentos) {
		this.id = id;
		this.descricao = descricao;
		this.tipos = new ArrayList<TipoExercicio>(tipos);
		this.gruposMusculares = new ArrayList<GrupoMuscular>(gruposMusculares);
		this.equipamentos = new ArrayList<Equipamento>(equipamentos);
	}
	
	public String toString() {
		String desc = this.id + "\t" + this.descricao;
		desc += "\n\t";		
		for(TipoExercicio tipo : this.tipos)
			desc += (tipo + "\n\t");
		if(this.tipos.size() == 0)
			desc += "\n\t";
		for(GrupoMuscular grupo : this.gruposMusculares)
			desc += (grupo + "\n\t");
		if(this.gruposMusculares.size() == 0)
			desc += "\n\t";
		for(Equipamento equipamento : this.equipamentos)
			desc += (equipamento + "\n\t");
		if(this.gruposMusculares.size() == 0)
			desc += "\n\t";
		return desc;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public boolean isTipo(TipoExercicio tipo) {
		return this.tipos.contains(tipo);
	}
	
	public boolean isTipo(Collection<TipoExercicio> tipos) {
		for(TipoExercicio tipo : tipos)
			if(this.tipos.contains(tipo))
				return true;
		return false;
	}	
	
	public boolean isGrupo(GrupoMuscular grupo) {
		return this.gruposMusculares.contains(grupo);
	}
	
	public boolean isGrupo(Collection<GrupoMuscular> grupos) {
		for(GrupoMuscular grupo : grupos)
			if(this.gruposMusculares.contains(grupo))
				return true;
		return false;
	}	
	
	
}
