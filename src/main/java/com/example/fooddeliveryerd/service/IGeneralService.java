package com.example.fooddeliveryerd.service;

public interface IGeneralService<T, Q, S> {
    Iterable<S> listAll();

    S getById(long id);

    S save(Q q);

    void delete(long id);
}
