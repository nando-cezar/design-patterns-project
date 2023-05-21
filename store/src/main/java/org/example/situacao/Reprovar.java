package org.example.situacao;

import org.example.orcamento.Orcamento;

public class Reprovar extends SituacaoOrcamento {

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
