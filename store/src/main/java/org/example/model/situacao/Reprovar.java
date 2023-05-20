package org.example.model.situacao;

import org.example.model.Orcamento;
import org.example.model.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Reprovar extends SituacaoOrcamento {

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
