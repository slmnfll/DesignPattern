package org.example.sprng.core.interfaces;

import java.util.List;

public interface IServices<T> {
    T create(T request);

    List<T> read();

    void update(Long id, T request);

    void delete(Long id);

    T readById(Long id);
}
