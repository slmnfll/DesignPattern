package org.example.sprng.data.mocks;

import lombok.AllArgsConstructor;
import org.example.sprng.data.entities.Article;
import org.example.sprng.data.entities.Category;
import org.example.sprng.data.repositories.RepositoryArticle;
import org.example.sprng.data.repositories.RepositoryCategory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// @Component
@AllArgsConstructor
public class MockArticle implements CommandLineRunner {
    private final RepositoryCategory repositoryCategory;
    private final RepositoryArticle repositoryArticle;

    @Override
    public void run(String... args) throws Exception {
        var categories = repositoryCategory.findAll();
        List<Article> articles = new ArrayList<>();
        for (Category category : categories) {
            for (int i = 0; i < 5; i++) {
                Article article = new Article();
                article.setName(category.getName() + i);
                article.setPrice(1000.0 * i);
                article.setQuantity(15 * i);

                article.setCategory(category);
                articles.add(article);
            }
        }
        repositoryArticle.saveAllAndFlush(articles);
    }
}
