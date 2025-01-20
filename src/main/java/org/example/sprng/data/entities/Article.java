package org.example.sprng.data.entities;

import jakarta.persistence.*;
import lombok.*;
import org.example.sprng.data.interfaces.NamedEntity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Article implements NamedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, unique = true, nullable = false)
    private String name;
    private Double price;
    private Integer quantity;
    @ManyToOne
    Category category;

    public Article(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Article(String name, Double price, Integer quantity, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
}
