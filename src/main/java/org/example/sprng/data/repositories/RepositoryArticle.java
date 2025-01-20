package org.example.sprng.data.repositories;

import org.example.sprng.data.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryArticle extends JpaRepository<Article, Long> {
}
