package br.edu.ifba.inf011.factory;

import br.edu.ifba.inf011.modelo.Equipamento;
import br.edu.ifba.inf011.modelo.Maquina;

public class MaquinaFactory extends EquipamentoFactory{

	@Override
	protected Equipamento createEquipamento() {
		return new Maquina();
	}

}
