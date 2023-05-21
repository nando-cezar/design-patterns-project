package org.example;

import org.example.desconto.CalculadoraDeDescontos;
import org.example.imposto.CalculadoraImposto;
import org.example.imposto.INSS;
import org.example.imposto.ISS;
import org.example.imposto.TipoImposto;
import org.example.orcamento.Orcamento;
import org.example.pedido.GeraPedido;
import org.example.pedido.GerarPedidoHandler;
import org.example.pedido.acao.EnviarEmailPedido;
import org.example.pedido.acao.SalvarPedidoNoBancoDeDados;
import org.example.situacao.Aprovar;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        imposto();
        desconto();
        situacao();
        pedidos();
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

    private static void pedidos(){
        System.out.println("Initializer...");
        GeraPedido gerador = new GeraPedido("Cliente XPTO", new BigDecimal("200"), 6);
        GerarPedidoHandler handler = new GerarPedidoHandler();
        handler.addAcao(new SalvarPedidoNoBancoDeDados());
        handler.addAcao(new EnviarEmailPedido());
        handler.executa(gerador);
        System.out.println("Finish!");
    }
}