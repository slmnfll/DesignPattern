package org.example.sprng.web.dto.responses;

import lombok.Data;
import org.example.sprng.data.entities.Category;

@Data
public class ResponseAllCategory {
    private Long id;
    private String name;

    public ResponseAllCategory(Category category) {
        this.id = category.getId();
        this.name = category.getName();
    }
}
