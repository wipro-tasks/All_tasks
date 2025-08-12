package com.example.clientapp.service;

import com.example.clientapp.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClients();
    Client getClientById(Long id);
    void saveClient(Client client);
    void deleteClientById(Long id);
}
