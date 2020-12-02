/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.umc.ppoo.model;
import br.umc.ppoo.model.command.*;
/**
 *
 * @author guilherme
 */
public class AppProcessarPedido {
    //MAIN
     public static void main(String[] args) {
     ProcessadorPedido processadorPedido = new ProcessadorPedido();
     processadorPedido.processar();
    }
}
