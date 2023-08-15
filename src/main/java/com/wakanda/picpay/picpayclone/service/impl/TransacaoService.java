package com.wakanda.picpay.picpayclone.service.impl;

import com.wakanda.picpay.picpayclone.conversor.TransacaoConversor;
import com.wakanda.picpay.picpayclone.domain.Transacao;
import com.wakanda.picpay.picpayclone.dto.TransacaoDTO;
import com.wakanda.picpay.picpayclone.repository.TransacaoRepository;
import com.wakanda.picpay.picpayclone.service.ICartaoCreditoService;
import com.wakanda.picpay.picpayclone.service.ITransacaoService;
import com.wakanda.picpay.picpayclone.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService implements ITransacaoService {

    @Autowired
    private TransacaoConversor transacaoConversor;
    @Autowired
    private TransacaoRepository transacaoRepository;
    @Autowired
    private ICartaoCreditoService cartaoCreditoService;
    @Autowired
    private IUsuarioService usuarioService;

    @Override
    public TransacaoDTO processar(TransacaoDTO transacaoDTO) {
        Transacao transacao = salvar(transacaoDTO);
        cartaoCreditoService.salva(transacaoDTO.getCartaoCredito());
        usuarioService.atualizarSaldo(transacao, transacaoDTO.getIsCartaoCredito());
        return transacaoConversor.converterEntidadeParaDto(transacao);
    }

    private Transacao salvar(TransacaoDTO transacaoDTO) {
        Transacao transacao = transacaoConversor.converterDtoParaEntidade(transacaoDTO);
        usuarioService.validar(transacao.getDestino(), transacao.getOrigem());
        return transacaoRepository.save(transacao);
    }
}
