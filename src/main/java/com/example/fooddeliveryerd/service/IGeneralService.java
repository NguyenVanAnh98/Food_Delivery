package com.example.fooddeliveryerd.service;

public interface IGeneralService<T, S> {
    Iterable<T> listAll();

    T getById(long id);

    T save(S s);

    void delete(long id);
}
