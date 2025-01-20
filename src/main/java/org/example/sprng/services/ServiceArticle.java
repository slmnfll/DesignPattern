package org.example.sprng.services;

import org.example.sprng.core.ImplService;
import org.example.sprng.data.entities.Article;
import org.example.sprng.data.repositories.RepositoryArticle;
import org.springframework.stereotype.Service;

@Service
public class ServiceArticle extends ImplService<Article, RepositoryArticle> {
    public ServiceArticle(RepositoryArticle repositories) {
        super(repositories);
    }
}
