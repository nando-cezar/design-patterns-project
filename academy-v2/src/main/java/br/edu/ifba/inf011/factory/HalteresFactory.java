package br.edu.ifba.inf011.factory;

import br.edu.ifba.inf011.modelo.Equipamento;
import br.edu.ifba.inf011.modelo.Halteres;

public class HalteresFactory extends EquipamentoFactory{

	@Override
	protected Equipamento createEquipamento() {
		return new Halteres();
	}

}
