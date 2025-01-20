package org.example.sprng.web.controllers.interfaces;

import org.example.sprng.data.entities.Article;
import org.example.sprng.web.dto.requests.RequestCreateArticle;
import org.example.sprng.web.dto.responses.ResponseAllArticle;
import org.example.sprng.web.dto.responses.ResponseOneArticle;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Article")
public interface IControllerArticle {
    @GetMapping("/List")
    ResponseEntity<List<ResponseAllArticle>> read();

    @GetMapping("/One/{id}")
    ResponseEntity<ResponseOneArticle> readById(@PathVariable() Long id);

    @PostMapping("/Create")
    ResponseEntity<ResponseOneArticle> create(@RequestBody() RequestCreateArticle article);

    @PutMapping("/Update/{id}")
    ResponseEntity<Article> update(@PathVariable() Long id, @RequestBody() Article article);

    @DeleteMapping("/Delete/{id}")
    ResponseEntity<Article> delete(@PathVariable() Long id);
}
