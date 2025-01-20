package org.example.sprng.web.dto.responses;

import lombok.Data;
import org.example.sprng.data.entities.Article;

@Data
public class ResponseOneArticle {
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    private ResponseAllCategory categoryName;

    public ResponseOneArticle(Article article) {
        this.id = article.getId();
        this.name = article.getName();
        this.price = article.getPrice();
        this.quantity = article.getQuantity();
        this.categoryName = new ResponseAllCategory(article.getCategory());
    }
}
