package org.example.sprng.web.controllers.interfaces;

import org.example.sprng.data.entities.Category;
import org.example.sprng.web.dto.responses.ResponseAllCategory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Category")
public interface IControllerCategory {
    @GetMapping("/List")
    ResponseEntity<List<ResponseAllCategory>> read();

    @GetMapping("/One/{id}")
    ResponseEntity<Category> readById(@PathVariable() Long id);

    @PostMapping("/Create")
    ResponseEntity<Category> create(@RequestBody() Category category);

    @PutMapping("/Update/{id}")
    ResponseEntity<Category> update(@PathVariable() Long id, @RequestBody() Category category);

    @DeleteMapping("/Delete/{id}")
    ResponseEntity<Category> delete(@PathVariable() Long id);
}
