/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.umc.ppoo.model;

import br.umc.ppoo.model.template.RelatorioTemplate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilherme
 */
public class RelatorioFactory {

    public RelatorioTemplate create(Status status) {

        try {

            String nomeClasse = "br.umc.ppoo.model.template.RelatorioPedidos" + status.toString();
            RelatorioTemplate relatorio = (RelatorioTemplate) Class.forName(nomeClasse).newInstance();
            return relatorio;

        } catch (Exception ex) {
            Logger.getLogger(PedidoFactory.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
