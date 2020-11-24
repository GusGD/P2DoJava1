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
public class PedidoFactory {
     public PedidoCommand create (Status status){
        PedidoCommand pedidoCommand = new PedidoConfirmado();
        
        return pedidoCommand;
        
        //arrumar e criar um factory de verdade q funcione!
    }
}
