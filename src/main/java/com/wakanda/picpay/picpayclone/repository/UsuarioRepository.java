package com.wakanda.picpay.picpayclone.repository;

import com.wakanda.picpay.picpayclone.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByLogin(String login);
}
