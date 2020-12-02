/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.umc.ppoo.model;


import br.umc.ppoo.model.command.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilherme
 */
public class PedidoFactory {
     public PedidoCommand create (Status status){
         
         try {
             String mensagem = "Não funciona assim ;-;";
             String nomeClasse = "Pedido"+status;
             Class classCommand = Class.forName(nomeClasse);
             PedidoCommand comando = (PedidoCommand) classCommand.newInstance();
             System.out.println(comando.toString());
             return comando;
            
             
             //não queria fazer com if mas óssivelmente só vai rolar com ele ;-;
         } catch (Exception ex) {
             Logger.getLogger(PedidoFactory.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         } 
          
    }
}
