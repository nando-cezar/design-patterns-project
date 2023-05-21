package org.example.desconto;


import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhetos(
                        new SemDesconto()
                )
        );

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
