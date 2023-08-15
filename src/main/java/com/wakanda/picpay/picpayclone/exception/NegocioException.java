package com.wakanda.picpay.picpayclone.exception;

public class NegocioException extends RuntimeException {

    private static final long serialVersionUID = 1l;

    public NegocioException(String mensagem) {
        super(mensagem);
    }

    public NegocioException(String mensagem, Exception exception) {
        super(mensagem, exception);
    }

}
