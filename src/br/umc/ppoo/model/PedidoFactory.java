/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.umc.ppoo.model;


import br.umc.ppoo.model.command.*;
import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilherme
 */
public class PedidoFactory {
     public PedidoCommand create (Status status){
         
         try {
            
             String nomeClasse = "br.umc.ppoo.model.command.Pedido"+status.toString();
             PedidoCommand comando = (PedidoCommand) Class.forName(nomeClasse).newInstance();
             System.out.println(comando.toString());
             return comando;
            
             
             //FUNCIONOU YAAAAY
         } catch (Exception ex) {
             Logger.getLogger(PedidoFactory.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         } 
          
    }
}
