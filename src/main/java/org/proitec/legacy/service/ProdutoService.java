package org.proitec.legacy.service;

import org.proitec.legacy.model.Produto;
import org.proitec.legacy.repository.ProdutoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;


@ApplicationScoped
public class ProdutoService {
    Logger log = LoggerFactory.getLogger(ProdutoService.class);

    @Transactional
    public boolean adicionarComercio(Produto produto) {
        produtoRepository.persist(produto);
        return true;
    }

    @Inject
    ProdutoRepository produtoRepository;

    public List<?> buscarPorDescricao(String descricao) {
        return produtoRepository.findByDescricao(descricao);
    }

    public List<?> listAll() {
        return produtoRepository.listAll();
    }
}
