package org.example.sprng.web.dto.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.sprng.data.entities.Client;
import org.example.sprng.data.entities.Order;
import org.example.sprng.data.enums.Status;

import java.time.LocalDate;

@Data
public class ResponseAllOrders {
    private Long id;
    private LocalDate date;
    private Double amount;
    private String name;
    private String country;
    private String street;
    private Status status;
    private Client client;
    public ResponseAllOrders(Order order) {
        this.id = order.getId();
        this.date = order.getDate();
        this.amount = order.getAmount();
        this.name = order.getName();
        this.country = order.getCountry();
        this.street = order.getStreet();
        this.status = order.getStatus();
        this.client = order.getClient();
    }
}
