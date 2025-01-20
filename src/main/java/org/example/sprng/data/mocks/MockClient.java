package org.example.sprng.data.mocks;

import lombok.AllArgsConstructor;
import org.example.sprng.data.entities.Client;
import org.example.sprng.data.repositories.RepositoryClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// @Component
@AllArgsConstructor
public class MockClient implements CommandLineRunner {
    private final RepositoryClient repositoryClient;

    @Override
    public void run(String... args) throws Exception {
        List<Client> clients = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            clients.add((new Client("Name" + i, Integer.toUnsignedLong(i))));
        }
        repositoryClient.saveAllAndFlush(clients);
    }
}
