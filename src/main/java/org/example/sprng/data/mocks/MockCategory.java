package org.example.sprng.data.mocks;

import lombok.AllArgsConstructor;
import org.example.sprng.data.entities.Category;
import org.example.sprng.data.repositories.RepositoryCategory;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.List;

// @Component
@AllArgsConstructor
public class MockCategory implements CommandLineRunner {
    private final RepositoryCategory repositoryCategory;

    @Override
    public void run(String... args) throws Exception {
        List<Category> categories = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            categories.add((new Category("Name" + i)));
        }
        repositoryCategory.saveAllAndFlush(categories);
    }
}
