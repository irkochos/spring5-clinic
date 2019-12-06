package irkoch.spring.petclinic.services;

import irkoch.spring.petclinic.model.Owner;

import java.util.Set;

public interface CrudService<T, ID> {
    T findById(ID id);

    T save(T obj);

    Set<T> findAll();


    void delete(T obj);

    void deleteById(ID id);
}
