package br.edu.ifba.inf011;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import br.edu.ifba.inf011.exception.TipoIncompativelException;
import br.edu.ifba.inf011.modelo.Equipamento;
import br.edu.ifba.inf011.modelo.GrupoMuscular;
import br.edu.ifba.inf011.modelo.TipoExercicio;
import br.edu.ifba.inf011.modelo.exercicio.Exercicio;
import br.edu.ifba.inf011.modelo.exercicio.ExercicioBuilder;
import br.edu.ifba.inf011.singleton.CatalogoEquipamentos;

public class Aval1 {
	
	
	private void questao01(String fileName) throws FileNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, IOException {
		CatalogoEquipamentos ce = CatalogoEquipamentos.getCatalogo(fileName);
		Equipamento eq;
		try {
			eq = ce.newInstance("Maquina", "MAQ01", 5);
			System.out.println(eq);
		}catch (TipoIncompativelException e) {
			System.out.print("Erro na criação do Equipamento...");
			System.out.print("Solicitado " + e.getTipoEsperado() + ", ");
			System.out.print("contudo já existia um equipamento com o mesmo id (" + e.getId() + ") ");
			System.out.println("do tipo " + e.getTipoEncontrado() + ".");
		}
		try {
			eq = ce.newInstance("Acessorio", "AC01", 2);
			System.out.println(eq);
		}catch (TipoIncompativelException e) {
			System.out.print("Erro na criação do Equipamento...");
			System.out.print("Solicitado " + e.getTipoEsperado() + ", ");
			System.out.print("contudo já existia um equipamento com o mesmo id (" + e.getId() + ") ");
			System.out.println("do tipo " + e.getTipoEncontrado() + ".");
		}
		try {
			eq = ce.newInstance("Maquina", "MAQ01", 5);
			System.out.println(eq);
		}catch (TipoIncompativelException e) {
			System.out.print("Erro na criação do Equipamento...");
			System.out.print("Solicitado " + e.getTipoEsperado() + ", ");
			System.out.print("contudo já existia um equipamento com o mesmo id (" + e.getId() + ") ");
			System.out.println("do tipo " + e.getTipoEncontrado() + ".");
		}
		try {
			eq = ce.newInstance("Halteres", "HALTQ01", 3);
			System.out.println(eq);
		}catch (TipoIncompativelException e) {
			System.out.print("Erro na criação do Equipamento...");
			System.out.print("Solicitado " + e.getTipoEsperado() + ", ");
			System.out.print("contudo já existia um equipamento com o mesmo id (" + e.getId() + ") ");
			System.out.println("do tipo " + e.getTipoEncontrado() + ".");
		}
		try {
			eq = ce.newInstance("Halteres", "MAQ01", 3);
			System.out.println(eq);
		}catch (TipoIncompativelException e) {
			System.out.print("Erro na criação do Equipamento...");
			System.out.print("Solicitado " + e.getTipoEsperado() + ", ");
			System.out.print("contudo já existia um equipamento com o mesmo id (" + e.getId() + ") ");
			System.out.println("do tipo " + e.getTipoEncontrado() + ".");
		}	
	}
	
	private void questao02(String fileName) throws FileNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, IOException {
		CatalogoEquipamentos ce = CatalogoEquipamentos.getCatalogo(fileName);
		try {
			Equipamento barra = ce.newInstance("Acessorio", "BARRA", 1);
			Equipamento peso = ce.newInstance("Halteres", "20Kg", 2);
			Exercicio exercicio = ExercicioBuilder.getFactory()
					  .clear().descricao("Supino")
					  .withEquipamento(barra)
					  .withEquipamento(peso)
					  .withGrupoMuscular(GrupoMuscular.Peito)
					  .withGrupoMuscular(GrupoMuscular.Triceps)
					  .withTipo(TipoExercicio.Resistido).build("SUP01");
			System.out.println(exercicio);			
			
			Exercicio exercicio02 = ExercicioBuilder.getFactory()
					  .clear().descricao("Apoio")
					  .withGrupoMuscular(GrupoMuscular.Peito)
					  .withGrupoMuscular(GrupoMuscular.Triceps)
					  .withTipo(TipoExercicio.Resistido)
					  .withTipo(TipoExercicio.Funcional)
					  .build("APO01");
			System.out.println(exercicio02);			
			
		} catch (TipoIncompativelException e) {
			e.printStackTrace();
		}
	}
	
	private void run(String fileName) throws FileNotFoundException, InstantiationException, 
							  IllegalAccessException, IllegalArgumentException, 
							  InvocationTargetException, NoSuchMethodException, 
							  SecurityException, ClassNotFoundException, IOException{
		
		this.questao01(fileName);
		this.questao02(fileName);
		
	}
	
	public static void main(String[] args) throws Exception {
		(new Aval1()).run("src/main/resources/factories.props");
	}

}
