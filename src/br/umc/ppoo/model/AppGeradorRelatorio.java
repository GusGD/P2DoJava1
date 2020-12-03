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
public class AppGeradorRelatorio {
    //main
    public static void main(String[] args) {
        GeradorDeRelatorio geradorDeRelatorio = new GeradorDeRelatorio();
        
        geradorDeRelatorio.gerar(Status.Pendente);
    }
}
