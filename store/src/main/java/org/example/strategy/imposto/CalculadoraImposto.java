package org.example.strategy.imposto;

import org.example.model.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto imposto){
        return imposto.calcularImposto(orcamento);
    }
}
