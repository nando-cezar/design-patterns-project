package org.example.builder;

import org.example.model.Alimento;
import org.example.model.QuantidadeMacro;

import java.util.List;

public class PreparoDirector {

    public PreparoBuilder constructPreparo(PreparoBuilder builder){
        return builder
                .setNome("OVO FRITO")
                .setAlimentos(
                        List.of(
                                new Alimento("OVO", new QuantidadeMacro(1)),
                                new Alimento("SAL", new QuantidadeMacro(2)),
                                new Alimento("CHÁ DE MANTEIGA", new QuantidadeMacro(1))
                        )
                )
                .setLowCarb(true)
                .setSemGluten(true);
    }
}
