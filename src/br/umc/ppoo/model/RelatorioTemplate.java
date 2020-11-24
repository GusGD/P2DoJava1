/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.umc.ppoo.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme
 */
public abstract class RelatorioTemplate {

    List<Pedido> pedidos = new ArrayList<Pedido>();

    public void gerar() {

        montarCabecalho();
        montarConteudo();
        montarRodape();

    }

    public void montarCabecalho() {

        //SOUT
    }

    public void montarConteudo() {
        //SOUT
    }

    public void montarRodape() {
        //SOUT
    }
}
