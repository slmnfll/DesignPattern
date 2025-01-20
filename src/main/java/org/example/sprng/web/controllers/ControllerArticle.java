package org.example.sprng.web.controllers;

import lombok.AllArgsConstructor;
import org.example.sprng.data.entities.Article;
import org.example.sprng.services.ServiceArticle;
import org.example.sprng.web.controllers.interfaces.IControllerArticle;
import org.example.sprng.web.dto.requests.RequestCreateArticle;
import org.example.sprng.web.dto.responses.ResponseAllArticle;
import org.example.sprng.web.dto.responses.ResponseOneArticle;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class ControllerArticle implements IControllerArticle {
    private final ServiceArticle serviceArticle;

    @Override
    public ResponseEntity<List<ResponseAllArticle>> read() {
        var data = serviceArticle.read().stream().map(ResponseAllArticle::new).toList();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseOneArticle> readById(Long id) {
        var data = new ResponseOneArticle(serviceArticle.readById(id));
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseOneArticle> create(RequestCreateArticle article) {
        var data = new ResponseOneArticle(serviceArticle.create(article.toEntity()));
        return new ResponseEntity<>(data, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Article> update(Long id, Article article) {
        serviceArticle.update(id, article);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<Article> delete(Long id) {
        serviceArticle.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
