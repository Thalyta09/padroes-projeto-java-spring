package com.tconrado.gof.padroesprojetojavaspring.service.impl;

import com.tconrado.gof.padroesprojetojavaspring.exception.ClienteNotFoundException;
import com.tconrado.gof.padroesprojetojavaspring.model.Cliente;
import com.tconrado.gof.padroesprojetojavaspring.model.Endereco;
import com.tconrado.gof.padroesprojetojavaspring.repository.ClienteRepository;
import com.tconrado.gof.padroesprojetojavaspring.repository.EnderecoRepository;
import com.tconrado.gof.padroesprojetojavaspring.service.ClienteService;
import com.tconrado.gof.padroesprojetojavaspring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente getById(Long id) throws ClienteNotFoundException {
        Cliente cliente = verificaSeExiste(id);
        return cliente;
    }

    @Override
    public void create(Cliente cliente) {
        verificaCliente(cliente);

    }

    @Override
    public void update(Long id, Cliente cliente) throws ClienteNotFoundException {
        verificaSeExiste(id);
        verificaCliente(cliente);
    }

    @Override
    public void delete(Long id) throws ClienteNotFoundException {
        verificaSeExiste(id);
        clienteRepository.deleteById(id);
    }

    private void verificaCliente(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.getCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

    private Cliente verificaSeExiste (Long id) throws ClienteNotFoundException {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new ClienteNotFoundException(id));
    }

}
