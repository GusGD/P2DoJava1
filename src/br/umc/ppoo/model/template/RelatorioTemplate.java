/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.umc.ppoo.model.template;

import br.umc.ppoo.model.Pedido;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme
 */
public abstract class RelatorioTemplate {

    List<Pedido> pedidos;

    public void gerar(ArrayList<Pedido> listaPedidos) {
        System.out.println("Relatório gerado com sucesso!");
        this.montarCabecalho();
        this.montarConteudo(listaPedidos);
        this.montarRodape();

    }

    public void montarCabecalho() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    public void montarConteudo(ArrayList<Pedido> listaPedidos) {
        for (Pedido pedido : listaPedidos) {
            System.out.println(pedido);
        }
    }

    public void montarRodape() {
        System.out.println("Rodapé com certeza \n");
    }
}
