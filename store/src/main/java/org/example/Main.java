package org.example;

import org.example.cr_tm.desconto.CalculadoraDeDescontos;
import org.example.model.situacao.Aprovar;
import org.example.strategy.imposto.CalculadoraImposto;
import org.example.strategy.imposto.INSS;
import org.example.strategy.imposto.ISS;
import org.example.strategy.imposto.TipoImposto;
import org.example.model.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        imposto();
        desconto();
        situacao();
    }

    private static void imposto(){
        System.out.println("Initializer...");
        TipoImposto tipo = new INSS();
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);

        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        System.out.println(calculadoraImposto.calcular(orcamento, tipo));
        tipo = new ISS();
        System.out.println(calculadoraImposto.calcular(orcamento, tipo));
        System.out.println("Finish!");
    }

    private static void desconto(){
        System.out.println("Initializer...");
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadoraDesconto = new CalculadoraDeDescontos();
        System.out.println(calculadoraDesconto.calcular(orcamento1));
        System.out.println(calculadoraDesconto.calcular(orcamento2));
        System.out.println("Finish!");
    }

    private static void situacao(){
        System.out.println("Initializer...");
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        orcamento.aplicarDescontoExtra();
        System.out.println(orcamento.getValor());
        Aprovar aprovar = new Aprovar();
        orcamento.setSituacao(aprovar);
        orcamento.aplicarDescontoExtra();
        System.out.println(orcamento.getValor());
        orcamento.finalizar();
        System.out.println("Finish!");
    }
}