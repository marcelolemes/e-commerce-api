package org.proitec.legacy.service;

import org.proitec.legacy.model.Cliente;
import org.proitec.legacy.model.Transacao;
import org.proitec.legacy.repository.TransacaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;


@ApplicationScoped
public class TransacaoService {
    Logger log = LoggerFactory.getLogger(TransacaoService.class);
    @Inject
    TransacaoRepository transacaoRepository;


    @Transactional
    public boolean adicionarComercio(Transacao transacao) {
        transacaoRepository.persist(transacao);
        return true;
    }

    public List<?> buscarPorCliente(Cliente cliente) {
        return transacaoRepository.findByCliente(cliente);
    }

    public List<?> listAll() {
        return transacaoRepository.listAll();
    }
}
