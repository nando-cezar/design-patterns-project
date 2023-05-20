package org.example.model.situacao;

import org.example.model.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovar());
    }

    public void reprovar(Orcamento orcamento){
        orcamento.setSituacao(new Reprovar());
    }
}
