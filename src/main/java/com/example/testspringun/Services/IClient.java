package com.example.testspringun.Services;

import com.example.testspringun.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IClient {
    public List<Client> retrieveAllClients();

    public Client addClient(Client c);

    public void deleteClient(Long id);

    public Client updateClient(Client c);

    public Client retrieveClient(Long id);
}
