package com.wakanda.picpay.picpayclone.conversor;

import java.util.ArrayList;
import java.util.List;

public abstract class ConversorBase<Entidade, Dto> {

    public abstract Dto converterEntidadeParaDto(Entidade entidade);

    public abstract Entidade converterDtoParaEntidade(Dto dto);

    public List<Dto> converterEntidadesParaDtos(List<Entidade> entidades) {
        List<Dto> dtos = new ArrayList<>();
        entidades.stream()
                .forEach(entidade -> dtos.add(converterEntidadeParaDto(entidade)));
        return dtos;
    }

    public List<Entidade> converterDtosParaEntidades(List<Dto> dtos) {
        List<Entidade> entidades = new ArrayList<>();
        dtos.stream()
                .forEach(dto -> entidades.add(converterDtoParaEntidade(dto)));
        return entidades;
    }
}
