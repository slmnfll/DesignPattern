package org.example.sprng.web.controllers.interfaces;

import org.example.sprng.web.dto.responses.ResponseAllArticle;
import org.example.sprng.web.dto.responses.ResponseAllOrders;
import org.example.sprng.web.dto.responses.ResponseOneArticle;
import org.example.sprng.web.dto.responses.ResponseOneClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/Test")
public interface IController {
    @GetMapping("/Lister")
    ResponseEntity<List<ResponseAllOrders>> read();

    @GetMapping("/{id}/orders")
    ResponseEntity<ResponseOneClient> readById(@PathVariable() Long id);
}
