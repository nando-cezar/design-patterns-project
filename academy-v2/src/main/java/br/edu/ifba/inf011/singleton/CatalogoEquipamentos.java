package br.edu.ifba.inf011.singleton;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import br.edu.ifba.inf011.exception.TipoIncompativelException;
import br.edu.ifba.inf011.factory.EquipamentoFactory;
import br.edu.ifba.inf011.modelo.Equipamento;

public class CatalogoEquipamentos {
	
	private Map<String, Equipamento> equipamentos;
	private Map<String, EquipamentoFactory> factories;
	
	private static CatalogoEquipamentos catalogo = null;
	
	
	private CatalogoEquipamentos(String fileName) throws FileNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, IOException {
		this.equipamentos = new HashMap<String, Equipamento>();
		this.factories = this.loadFactoryClasses(fileName);
	}
	
	public Equipamento newInstance(String tipo, String id, 
								   int quantidade) throws TipoIncompativelException {
		EquipamentoFactory factory = this.factories.get(tipo);
		Equipamento equipamento = this.equipamentos.get(id);
		if(equipamento == null) {
			equipamento = factory.getEquipamento(id, quantidade);
		}else {
			equipamento.aumentarQuantidade(quantidade);
		}
		String tipoEquipamento = equipamento.getClass().getSimpleName();
		if(!tipo.equalsIgnoreCase(tipoEquipamento))
			throw new TipoIncompativelException(id, tipo, tipoEquipamento);
		this.equipamentos.put(equipamento.getIdentificador(), equipamento);
		return equipamento;
	}
	
	public Map<String, EquipamentoFactory> loadFactoryClasses(String fileName) throws FileNotFoundException, 
											 IOException, 
											 InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, 
											 SecurityException, ClassNotFoundException {
		HashMap<String, EquipamentoFactory> factories = new HashMap<String, EquipamentoFactory>();		
		Properties props = new Properties();
		props.load(new FileReader(fileName));
		for(Object key : props.keySet()) {
			String classeName = (String) key;
			String factoryName = props.getProperty(classeName);
			factories.put(classeName, this.createFactory(factoryName));
		}
		return factories;
	}
	
	private EquipamentoFactory createFactory(String className) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		return (EquipamentoFactory) Class.forName(className).getConstructor().newInstance();
	}

	public static CatalogoEquipamentos getCatalogo(String fileName) throws FileNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, IOException {
		if(CatalogoEquipamentos.catalogo == null)
			CatalogoEquipamentos.catalogo = new CatalogoEquipamentos(fileName);
		return CatalogoEquipamentos.catalogo;
	}
	
}
