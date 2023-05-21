package org.example.imposto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements TipoImposto {
    @Override
    public BigDecimal calcularImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
