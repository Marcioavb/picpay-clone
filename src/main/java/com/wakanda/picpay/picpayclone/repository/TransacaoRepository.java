package com.wakanda.picpay.picpayclone.repository;

import com.wakanda.picpay.picpayclone.domain.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
