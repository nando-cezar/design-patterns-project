package br.edu.ifba.inf011.strategy;

import java.lang.reflect.InvocationTargetException;

public enum TipoPrograma {
	
	ABCD("br.edu.ifba.inf011.strategy.ABCD"),
	Cardio("br.edu.ifba.inf011.strategy.Cardio"),
	FullWorkout("br.edu.ifba.inf011.strategy.FullWorkout"); 
	
	public String className;
	
	TipoPrograma(String className) {
		this.className = className;
	}
	
	public ProgramaStrategy getInstance() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		return (ProgramaStrategy) Class.forName(className).getConstructor().newInstance();
	}

}
