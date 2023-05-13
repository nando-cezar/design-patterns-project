package br.edu.ifba.inf011.factory;

import br.edu.ifba.inf011.modelo.Equipamento;

public abstract class EquipamentoFactory {
	
	public Equipamento getEquipamento(String id, int quantidade) {
		Equipamento equipamento = this.createEquipamento();
		equipamento.setIdentificador(id);
		equipamento.setQuantidade(quantidade);
		return equipamento;
	}

	protected abstract Equipamento createEquipamento();

}
