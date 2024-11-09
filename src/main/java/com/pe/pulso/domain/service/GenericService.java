package com.pe.pulso.domain.service;

import java.util.List;

public interface  GenericService<D, E, K> {
    D create(E dto);
    D update(D dto);
    void delete(K id);
    D findById(K id);
    List<D> findAll();
}
