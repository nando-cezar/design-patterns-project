package org.example.pedido;

import org.example.orcamento.Orcamento;
import org.example.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GerarPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GerarPedidoHandler() {
        this.acoes = new ArrayList<>();
    }

    public void addAcao(AcaoAposGerarPedido acao) {
        this.acoes.add(acao);
    }

    public void executa(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        acoes.forEach(a -> a.executar(pedido));
    }
}
