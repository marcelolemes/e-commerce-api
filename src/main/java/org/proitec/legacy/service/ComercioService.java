package org.proitec.legacy.service;

import org.proitec.legacy.model.Comercio;
import org.proitec.legacy.repository.ComercioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;


@ApplicationScoped
public class ComercioService {
    Logger log = LoggerFactory.getLogger(ComercioService.class);
    @Inject
    ComercioRepository comercioRepository;

    @Transactional
    public boolean adicionarComercio(Comercio comercio) {
        comercioRepository.persist(comercio);
        return true;
    }

    public List<?> buscarPorDescricao(String descricao) {
        return comercioRepository.findByDescricao(descricao);
    }

    public List<?> listAll() {
        return comercioRepository.listAll();
    }
}
