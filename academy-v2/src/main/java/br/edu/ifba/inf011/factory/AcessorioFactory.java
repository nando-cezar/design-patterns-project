package br.edu.ifba.inf011.factory;

import br.edu.ifba.inf011.modelo.Acessorio;
import br.edu.ifba.inf011.modelo.Equipamento;

public class AcessorioFactory extends EquipamentoFactory{

	@Override
	protected Equipamento createEquipamento() {
		return new Acessorio();
	}

}
