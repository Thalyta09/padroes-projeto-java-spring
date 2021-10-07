package com.tconrado.gof.padroesprojetojavaspring.service;

import com.tconrado.gof.padroesprojetojavaspring.exception.ClienteNotFoundException;
import com.tconrado.gof.padroesprojetojavaspring.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> getAll();

    Cliente getById(Long id) throws ClienteNotFoundException;

    void create(Cliente cliente);

    void update(Long id, Cliente cliente) throws ClienteNotFoundException;

    void delete(Long id) throws ClienteNotFoundException;
}
