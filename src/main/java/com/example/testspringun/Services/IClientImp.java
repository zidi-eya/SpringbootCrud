package com.example.testspringun.Services;

import com.example.testspringun.Entity.Client;
import com.example.testspringun.Reposetory.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IClientImp implements IClient{
    @Autowired
    ClientRepo clientRepo;
    @Override
    public List<Client> retrieveAllClients() {
        return clientRepo.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clientRepo.save(c);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepo.deleteById(id);


    }

    @Override
    public Client updateClient(Client c) {
        return clientRepo.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        return clientRepo.findById(id).orElse(null);
    }
}
