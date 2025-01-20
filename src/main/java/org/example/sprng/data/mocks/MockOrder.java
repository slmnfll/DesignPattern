package org.example.sprng.data.mocks;

import lombok.AllArgsConstructor;
import org.example.sprng.data.entities.Client;
import org.example.sprng.data.entities.Order;
import org.example.sprng.data.repositories.RepositoryClient;
import org.example.sprng.data.repositories.RepositoryOrder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// @Component
@AllArgsConstructor
public class MockOrder implements CommandLineRunner {
    private final RepositoryOrder repositoryOrder;
    private final RepositoryClient repositoryClient;

    @Override
    public void run(String... args) throws Exception {
        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            orders.add((new Order(repositoryClient.findById(Integer.toUnsignedLong(2)).orElse(null), "Order" + i, 10.0 + i, "Dakar", "Rue 1")));
        }
        repositoryOrder.saveAllAndFlush(orders);
    }
}
