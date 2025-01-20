package org.example.sprng.services;

import org.example.sprng.core.ImplService;
import org.example.sprng.data.entities.Client;
import org.example.sprng.data.repositories.RepositoryClient;
import org.springframework.stereotype.Service;

@Service
public class ServiceClient extends ImplService<Client, RepositoryClient> {
    public ServiceClient(RepositoryClient repositories) {
        super(repositories);
    }
}
