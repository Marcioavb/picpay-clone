package com.wakanda.picpay.picpayclone.enuns;

public enum BandeiraCartao {

    VISA("Visa"), MASTERCARD("Master Card"), ELO("Elo");

    private String descricao;

    BandeiraCartao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
