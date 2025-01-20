package org.example.sprng.web.dto.requests;

import org.example.sprng.data.entities.Article;
import org.example.sprng.data.entities.Category;

public class RequestCreateArticle {
    private String name;
    private Double price;
    private Integer quantity;
    private Long categoryId;

    public Article toEntity() {
        var category = new Category(categoryId);
        return new Article(name, price, quantity, category);
    }
}
