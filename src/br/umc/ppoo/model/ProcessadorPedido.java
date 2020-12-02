/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.umc.ppoo.model;
import br.umc.ppoo.model.PedidoFactory;
import br.umc.ppoo.model.command.PedidoCommand;

/**
 *
 * @author guilherme
 */
public class ProcessadorPedido {
    
    public void processar() {
        LeitorArquivo leitorArquivo = new LeitorArquivo();
        PedidoFactory pedidoFactory = new PedidoFactory();
        
        
        for (Pedido pedido : leitorArquivo.ler()) {
            PedidoCommand command = null;
            
            switch (pedido.getStatus()) {
                case Pendente:
                    command = pedidoFactory.create(Status.Pendente);
                    break;
                case Confirmado:
                    command = pedidoFactory.create(Status.Confirmado);
                    break;
                case Cancelado:
                    command = pedidoFactory.create(Status.Cancelado);
                    break;
                
            }
            command.executar(pedido);
        }
        
    }
}
