package org.example.sprng.data.repositories;

import org.example.sprng.data.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCategory extends JpaRepository<Category, Long> {
}
