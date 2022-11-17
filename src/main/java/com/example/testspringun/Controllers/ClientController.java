package com.example.testspringun.Controllers;

import com.example.testspringun.Entity.Client;
import com.example.testspringun.Services.IClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/Client")
public class ClientController {
    @Autowired
    IClient iClient;

    @GetMapping("/getall")
    public List<Client> retrieveAllClients() {
        return iClient.retrieveAllClients();
    }


    @PostMapping("/add")
    public Client addClient(@RequestBody Client c) {
        return iClient.addClient(c);
    }



    @DeleteMapping("/delete/{IdClient}")
    public void deleteClient(@PathVariable Long IdClient){
        iClient.deleteClient(IdClient);}
}
