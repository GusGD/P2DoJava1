/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.umc.ppoo.model;

import br.umc.ppoo.model.template.RelatorioTemplate;
import java.util.ArrayList;

/**
 *
 * @author guilherme
 */
public class GeradorDeRelatorio {
    public void gerar (Status status){
        LeitorArquivo leitorArquivo = new LeitorArquivo();
        RelatorioFactory relatorioFactory = new RelatorioFactory();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        for (Pedido pedido : leitorArquivo.ler()){
            if(pedido.getStatus() == status){
                pedidos.add(pedido);
            }
        }
        
        RelatorioTemplate relatorioTemplate = relatorioFactory.create(status);
        relatorioTemplate.gerar(pedidos);
    }
}
