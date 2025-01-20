package org.example.sprng.services.interfaces;

import org.example.sprng.core.interfaces.IServices;
import org.example.sprng.data.entities.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IServiceClient extends IServices<Client> {
    Page<Client> findAll(Pageable pageable);
}
