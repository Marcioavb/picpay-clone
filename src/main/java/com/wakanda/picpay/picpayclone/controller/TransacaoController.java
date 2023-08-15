package com.wakanda.picpay.picpayclone.controller;


import com.wakanda.picpay.picpayclone.dto.TransacaoDTO;
import com.wakanda.picpay.picpayclone.service.ITransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController extends ControllerBase<TransacaoDTO> {

    @Autowired
    private ITransacaoService transacaoService;

    @PostMapping
    public ResponseEntity<TransacaoDTO> salvar(@RequestBody @Valid TransacaoDTO transacaoDTO,
                                               UriComponentsBuilder uriBuilder){
        TransacaoDTO transacaoRetornoDTO = transacaoService.processar(transacaoDTO);
        String path = "/transacoes/{codigo}";
        return responderItemCriadoComURI(transacaoRetornoDTO, uriBuilder, path, transacaoRetornoDTO.getCodigo());
    }
}
