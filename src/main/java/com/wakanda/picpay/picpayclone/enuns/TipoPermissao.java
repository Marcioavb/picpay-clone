package com.wakanda.picpay.picpayclone.enuns;

public enum TipoPermissao {

    USUARIO("ROLE_USER"), ADMINISTRADOR("ROLE_ADMIN");

    private String codigo;

    private TipoPermissao(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}

