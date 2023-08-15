package com.wakanda.picpay.picpayclone.service;

import com.wakanda.picpay.picpayclone.domain.Transacao;
import com.wakanda.picpay.picpayclone.domain.Usuario;

public interface IUsuarioService {
    Usuario consultarEntidade(String login);

    void validar(Usuario...usuarios);

    void atualizarSaldo(Transacao transacao, Boolean isCartaoCredito);
}
