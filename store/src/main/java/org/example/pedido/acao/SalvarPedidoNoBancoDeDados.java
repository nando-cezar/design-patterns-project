package org.example.pedido.acao;

import org.example.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{

    @Override
    public void executar(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados.");
    }
}

