package irkoch.spring.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    Set<T> fidAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(ID id, T obj) {
        map.put(id, obj);
        return obj;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T obj) {
        map.entrySet().removeIf(entry -> entry.getValue().equals((obj)));
    }
 }

