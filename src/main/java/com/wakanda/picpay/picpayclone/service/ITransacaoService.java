package com.wakanda.picpay.picpayclone.service;

import com.wakanda.picpay.picpayclone.dto.TransacaoDTO;

public interface ITransacaoService {
    TransacaoDTO processar(TransacaoDTO transacaoDTO);
}
