package com.wakanda.picpay.picpayclone.service;

import com.wakanda.picpay.picpayclone.domain.CartaoCredito;
import com.wakanda.picpay.picpayclone.dto.CartaoCreditoDTO;

public interface ICartaoCreditoService {
    CartaoCredito salva(CartaoCreditoDTO cartaoCredito);
}
