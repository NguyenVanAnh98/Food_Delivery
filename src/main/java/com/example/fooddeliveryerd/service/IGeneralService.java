package com.example.fooddeliveryerd.service;

public interface IGeneralService<T> {
    Iterable<T> listAll();

    T getById(long id);

    T save(T t);

    void delete(long id);
}
