package org.example.sprng.data.entities;

import jakarta.persistence.*;
import lombok.*;
import org.example.sprng.data.interfaces.NamedEntity;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Category implements NamedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, unique = true, nullable = false)
    private String name;
    @OneToMany(mappedBy = "category")
    List<Article> articles;

    public Category(String name) {
        this.name = name;
    }

    public Category(Long categoryId) {
        this.id = categoryId;
    }
}
