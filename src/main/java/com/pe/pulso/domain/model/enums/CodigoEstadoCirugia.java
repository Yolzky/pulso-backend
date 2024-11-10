package com.pe.pulso.domain.model.enums;

public enum CodigoEstadoCirugia {
    PENDIENTE("01"),
    REALIZADA("02"),
    ;
    private final String codigo;
    private CodigoEstadoCirugia(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }
}
