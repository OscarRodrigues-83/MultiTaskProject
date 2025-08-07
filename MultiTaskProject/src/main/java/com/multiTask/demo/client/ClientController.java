package com.multiTask.demo.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "api/v1/client")
@RestController

public class ClientController {
    private final ClientService client;

    @Autowired
    public ClientController(ClientService client) {
        this.client = client;
    }

    @GetMapping
    public List<Client> getClient() {
        return client.getClient();
    }

}
