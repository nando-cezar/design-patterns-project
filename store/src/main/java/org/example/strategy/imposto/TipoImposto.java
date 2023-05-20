package org.example.strategy.imposto;

import org.example.model.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {
    BigDecimal calcularImposto(Orcamento orcamento);
}
