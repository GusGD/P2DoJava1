/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.umc.ppoo.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class LeitorArquivo {

    public List<Pedido> ler() {
        List<Pedido> listaPedido = new ArrayList<Pedido>();
        Scanner sc = null;
        try {
            
            String path = "arquivo/pedidos.csv";

            sc = new Scanner(new File(path));

            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] campos = line.split(";");

                listaPedido.add(new Pedido(Long.parseLong(campos[0]), campos[1], Double.parseDouble(campos[2]), Status.valueOf(campos[3])));
            }

            return listaPedido;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (sc != null) {
                sc.close();
            }

        }
        
        return listaPedido;
    }
}
