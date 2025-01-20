package org.example.sprng.web.controllers;

import lombok.AllArgsConstructor;
import org.example.sprng.services.ServiceClient;
import org.example.sprng.services.ServiceOrder;
import org.example.sprng.web.controllers.interfaces.IController;
import org.example.sprng.web.dto.responses.ResponseAllArticle;
import org.example.sprng.web.dto.responses.ResponseAllOrders;
import org.example.sprng.web.dto.responses.ResponseOneArticle;
import org.example.sprng.web.dto.responses.ResponseOneClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class Controller implements IController {
    private final ServiceOrder serviceOrder;
    private final ServiceClient serviceClient;

    @Override
    public ResponseEntity<List<ResponseAllOrders>> read() {
        var data = serviceOrder.read().stream().map(ResponseAllOrders::new).toList();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseOneClient> readById(Long id) {
        var data = new ResponseOneClient(serviceClient.readById(id));
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
