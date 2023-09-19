package com.luisgmr.entities;

public class Produto {//
    private String descricao;
    private String unidade;
    private int saldo;
    private double valorUnitario;
    private double subtotal;

    public Produto(String descricao, String unidade, int saldo, double valorUnitario) {
        this.descricao = descricao;
        this.unidade = unidade;
        this.saldo = saldo;
        this.valorUnitario = valorUnitario;
        this.subtotal = 0.0;
    }

    public void exibirInformacoes() {
        System.out.println("Informações sobre o produto");
        System.out.println("Descrição: " + descricao);
        System.out.println("Unidade: " + unidade);
        System.out.println("Saldo: " + saldo);
        System.out.println("Valor Unitário: R$" + valorUnitario);
        System.out.println("Subtotal: R$" + subtotal);
    }

    public void atualizarSubtotal() {
        subtotal = saldo * valorUnitario;
    }

}
