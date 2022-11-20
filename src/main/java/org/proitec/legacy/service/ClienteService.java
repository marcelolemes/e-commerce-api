package org.proitec.legacy.service;

import org.proitec.legacy.model.Cliente;
import org.proitec.legacy.repository.ClienteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;


@ApplicationScoped
public class ClienteService {
    Logger log = LoggerFactory.getLogger(ClienteService.class);
    @Inject
    ClienteRepository clienteRepository;


    @Transactional
    public boolean adicionarCliente(Cliente cliente) {
        clienteRepository.persist(cliente);
        return true;
    }

    public List<?> buscarPorNome(String nome) {
        return clienteRepository.findByNome(nome);
    }

    public List<?> buscarPorCpf(String cpf) {
        return clienteRepository.findByCpf(cpf);
    }

    public List<?> listAll() {
        return clienteRepository.listAll();
    }
}
