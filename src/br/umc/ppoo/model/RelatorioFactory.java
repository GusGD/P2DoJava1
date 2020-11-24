/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.umc.ppoo.model;

/**
 *
 * @author guilherme
 */
public class RelatorioFactory {
    public RelatorioTemplate create (Status status){
        RelatorioTemplate relatorioTemplate = new RelatorioPedidosConfirmados();
        
        return relatorioTemplate;
        
        //arrumar e criar um factory de verdade q funcione!
    }
}
