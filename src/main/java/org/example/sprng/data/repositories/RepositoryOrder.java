package org.example.sprng.data.repositories;

import org.example.sprng.data.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryOrder extends JpaRepository<Order, Long> {
}
