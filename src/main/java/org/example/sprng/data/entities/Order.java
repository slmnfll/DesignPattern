package org.example.sprng.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.sprng.data.enums.Status;
import org.example.sprng.data.interfaces.NamedEntity;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "orders")
public class Order implements NamedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private Double amount;
    @Column(length = 100)
    private String name;
    @Column(length = 100, nullable = false)
    private String country;
    @Column(length = 100, nullable = false)
    private String street;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne()
    private Client client;

    public Order(Client client, String name, Double amount, String country, String street) {
        this.client = client;
        this.name = name;
        this.amount = amount;
        this.country = country;
        this.street = street;
    }
}
