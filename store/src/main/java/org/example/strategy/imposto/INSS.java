package org.example.strategy.imposto;

import org.example.model.Orcamento;

import java.math.BigDecimal;

public class INSS implements TipoImposto{
    @Override
    public BigDecimal calcularImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.5"));
    }
}
