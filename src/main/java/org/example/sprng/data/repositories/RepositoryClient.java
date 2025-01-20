package org.example.sprng.data.repositories;

import org.example.sprng.data.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryClient extends JpaRepository<Client, Long> {
}
