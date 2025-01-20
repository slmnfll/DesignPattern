package org.example.sprng.services;

import org.example.sprng.core.ImplService;
import org.example.sprng.data.entities.Category;
import org.example.sprng.data.repositories.RepositoryCategory;
import org.springframework.stereotype.Service;

@Service
public class ServiceCategory extends ImplService<Category, RepositoryCategory> {
    public ServiceCategory(RepositoryCategory repositories) {
        super(repositories);
    }
}
