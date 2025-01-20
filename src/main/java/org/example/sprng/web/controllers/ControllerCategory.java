package org.example.sprng.web.controllers;

import lombok.AllArgsConstructor;
import org.example.sprng.data.entities.Category;
import org.example.sprng.services.ServiceCategory;
import org.example.sprng.web.controllers.interfaces.IControllerCategory;
import org.example.sprng.web.dto.responses.ResponseAllCategory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@AllArgsConstructor
@RestController
public class ControllerCategory implements IControllerCategory {
    private final ServiceCategory serviceCategory;

    @Override
    public ResponseEntity<List<ResponseAllCategory>> read() {
        var data = serviceCategory.read().stream().map(ResponseAllCategory::new).toList();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Category> readById(Long id) {
        var data = serviceCategory.readById(id);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Category> create(Category category) {
        var data = serviceCategory.create(category);
        return new ResponseEntity<>(data, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Category> update(Long id, Category category) {
        serviceCategory.update(id, category);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<Category> delete(Long id) {
        serviceCategory.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
