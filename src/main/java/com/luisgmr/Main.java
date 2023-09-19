package com.luisgmr;

import com.luisgmr.entities.Produto;

public class Main {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Mouse Gamer", "não entendi o que seria isso", 10, 15.0);
        Produto produto2 = new Produto("Teclado Gamer", "não entendi o que seria isso", 5, 20.0);

        produto1.atualizarSubtotal();
        produto2.atualizarSubtotal();

        System.out.println("Informações do Produto 1:");
        produto1.exibirInformacoes();
        System.out.println();

        System.out.println("Informações do Produto 2:");
        produto2.exibirInformacoes();
    }

}
