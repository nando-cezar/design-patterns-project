package br.edu.ifba.inf011;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

import br.edu.ifba.inf011.exception.TipoIncompativelException;
import br.edu.ifba.inf011.modelo.Equipamento;
import br.edu.ifba.inf011.modelo.GrupoMuscular;
import br.edu.ifba.inf011.modelo.TipoExercicio;
import br.edu.ifba.inf011.modelo.exercicio.Exercicio;
import br.edu.ifba.inf011.modelo.exercicio.ExercicioBuilder;
import br.edu.ifba.inf011.modelo.programa.Programa;
import br.edu.ifba.inf011.modelo.programa.ProgramaBuilder;
import br.edu.ifba.inf011.modelo.programa.Serie;
import br.edu.ifba.inf011.observer.FimProgramaEvento;
import br.edu.ifba.inf011.observer.FimProgramaSubscriber;
import br.edu.ifba.inf011.singleton.CatalogoEquipamentos;
import br.edu.ifba.inf011.strategy.TipoPrograma;
import br.edu.ifba.inf011.strategy.ABCD;
import br.edu.ifba.inf011.strategy.Cardio;
import br.edu.ifba.inf011.strategy.FullWorkout;

public class Aval2 implements FimProgramaSubscriber{
	
	private  CatalogoEquipamentos ce;
	
	public Aval2(String fileName) throws FileNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, IOException {
		this.ce = CatalogoEquipamentos.getCatalogo(fileName);
	}
	
	public Programa createPrograma01() throws TipoIncompativelException {
		
		Equipamento barra = this.ce.newInstance("Acessorio", "Barra", 1);
		Equipamento peso = this.ce.newInstance("Halteres", "20Kg", 2);
		Equipamento esteira = this.ce.newInstance("Maquina", "Esteira", 1);
		Equipamento cadeira = this.ce.newInstance("Maquina", "Cadeira Extensora", 1);
		Equipamento mesa = this.ce.newInstance("Maquina", "Mesa Flexora", 1);
		
		Exercicio supino = ExercicioBuilder.getFactory()
				  .clear().descricao("Supino")
				  .withEquipamento(barra)
				  .withEquipamento(peso)
				  .withGrupoMuscular(GrupoMuscular.Peito)
				  .withGrupoMuscular(GrupoMuscular.Triceps)
				  .withTipo(TipoExercicio.Resistido).build("SUP01");

		Exercicio barraFixa = ExercicioBuilder.getFactory()
				  .clear().descricao("Barra")
				  .withEquipamento(barra)
				  .withGrupoMuscular(GrupoMuscular.Costa)
				  .withGrupoMuscular(GrupoMuscular.Biceps)
				  .withTipo(TipoExercicio.Resistido).build("BAR01");

		Exercicio corrida12K = ExercicioBuilder.getFactory()
				  .clear().descricao("Corrida em Esteira 12Km")
				  .withEquipamento(esteira)
				  .withTipo(TipoExercicio.Cardiovascular).build("ESTEIRA12");

		Exercicio quadCadeira = ExercicioBuilder.getFactory()
				  .clear().descricao("Quadriceps na Cadeira")
				  .withEquipamento(cadeira)
				  .withGrupoMuscular(GrupoMuscular.Inferiores)
				  .withTipo(TipoExercicio.Resistido).build("QUAD01");

		Exercicio postMesa = ExercicioBuilder.getFactory()
				  .clear().descricao("Posteriores na Mesa")
				  .withEquipamento(mesa)
				  .withGrupoMuscular(GrupoMuscular.Inferiores)
				  .withTipo(TipoExercicio.Resistido).build("POS01");
		
		Programa programa = ProgramaBuilder.getFactory().clear()
							.withSerie(supino, 4, 15)
							.withSerie(barraFixa, 4, 10)
							.withSerie(corrida12K, 1, 1)
							.withSerie(quadCadeira, 4, 12)
							.withSerie(postMesa, 4, 12)
							.build();
		
		return programa;
	}
	
	public void questao() throws TipoIncompativelException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		Programa programa = this.createPrograma01();
		programa.addFimProgramaSubscriber(this);
		programa.setProgramaStrategy(TipoPrograma.FullWorkout);
		programa.init(LocalDate.of(2022, 7, 8));
		while(programa.temProximo()) {
			Serie serie = programa.proximo();
			serie.executar();
		}
		
	}
	
	@Override
	public void fimDePrograma(FimProgramaEvento evento) {
		System.out.println(evento);
	}	
	
	public static void main(String[] args) throws FileNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, TipoIncompativelException, IOException {
		(new Aval2(args[0])).questao();
	}



}
