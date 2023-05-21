package org.example.pedido.acao;

import org.example.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    @Override
    public void executar(Pedido pedido){
        System.out.println("Enviando pedido para e-mail.");
    }
}
