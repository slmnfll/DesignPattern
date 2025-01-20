package org.example.sprng.core;

import lombok.AllArgsConstructor;
import org.example.sprng.core.interfaces.IServices;
import org.example.sprng.data.interfaces.NamedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@AllArgsConstructor
public abstract class ImplService<T extends NamedEntity, R extends JpaRepository<T, Long>> implements IServices<T> {
    private final R repositories;

    @Override
    public T create(T request) {
        return repositories.save(request);
    }

    @Override
    public List<T> read() {
        return repositories.findAll();
    }

    @Override
    public void update(Long id, T request) {
        T item = repositories.findById(id).orElse(null);
        if (item != null) {
            item.setName(request.getName());
            repositories.save(item);
        }
    }

    @Override
    public void delete(Long id) {
        repositories.findById(id).ifPresent(repositories::delete);
    }

    @Override
    public T readById(Long id) {
        return repositories.findById(id).orElse(null);
    }
}
