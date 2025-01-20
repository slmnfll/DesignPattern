package org.example.sprng.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.sprng.data.interfaces.NamedEntity;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Client implements NamedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, unique = true, nullable = false)
    private Long phoneNumber;
    @Column(length = 100)
    private String name;
    @Column(length = 100)
    private String country;
    @Column(length = 100)
    private String street;
    @Getter
    @OneToMany(mappedBy = "client")
    private List<Order> orders;

    public Client(String name, Long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
