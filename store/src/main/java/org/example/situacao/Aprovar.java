package org.example.situacao;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovar extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
