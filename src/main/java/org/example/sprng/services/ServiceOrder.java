package org.example.sprng.services;

import org.example.sprng.core.ImplService;
import org.example.sprng.data.entities.Order;
import org.example.sprng.data.repositories.RepositoryOrder;
import org.springframework.stereotype.Service;

@Service
public class ServiceOrder extends ImplService<Order, RepositoryOrder> {
    public ServiceOrder(RepositoryOrder repositories) {
        super(repositories);
    }
}
