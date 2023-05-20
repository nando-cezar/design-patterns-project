package org.example.cr_tm.desconto;

import org.example.model.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    protected BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento))
            return efetuarCalculo(orcamento);

        return proximo.calcular(orcamento);
    }
    public abstract boolean deveAplicar(Orcamento orcamento);
    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);
}
