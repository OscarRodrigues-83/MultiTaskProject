package com.multiTask.demo.client;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ClientService {
    public List<Client> getClient() {
        return List.of(new Client(1, "Oscar", "ukbosca@gmail.com", 20, "03/05/2005"));

    }
}
