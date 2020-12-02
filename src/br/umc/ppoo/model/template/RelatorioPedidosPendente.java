/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.umc.ppoo.model.template;

import br.umc.ppoo.model.Pedido;
import java.util.ArrayList;

/**
 *
 * @author guilherme
 */
public class RelatorioPedidosPendente extends RelatorioTemplate {

    @Override
    public void montarCabecalho() {
        super.montarCabecalho();
    }

    @Override
    public void montarConteudo(ArrayList<Pedido> listaPedidos) {
        super.montarConteudo(listaPedidos);
    }

    @Override
    public void montarRodape() {
        super.montarRodape();
    }
}
