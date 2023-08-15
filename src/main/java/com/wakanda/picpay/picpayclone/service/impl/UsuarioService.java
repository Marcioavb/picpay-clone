package com.wakanda.picpay.picpayclone.service.impl;

import com.wakanda.picpay.picpayclone.domain.Transacao;
import com.wakanda.picpay.picpayclone.domain.Usuario;
import com.wakanda.picpay.picpayclone.exception.NegocioException;
import com.wakanda.picpay.picpayclone.repository.UsuarioRepository;
import com.wakanda.picpay.picpayclone.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

//    @Autowired
//    private UsuarioConversor usuarioConversor;


    @Override
    public Usuario consultarEntidade(String login) {
        return usuarioRepository.findByLogin(login);

    }
    @Override
    public void validar(Usuario...usuarios) {
        Arrays.asList(usuarios).stream()
                .forEach(usuario -> {
            if (usuario == null) {
                throw new NegocioException("O usuario informado nao existe");
            }
        });
    }
    @Override
    public void atualizarSaldo(Transacao transacao, Boolean isCartaoCredito) {

    }
}
