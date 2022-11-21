package org.proitec.legacy.transacional;

import org.proitec.legacy.model.Cliente;
import org.proitec.legacy.model.Produto;
import org.proitec.legacy.model.Transacao;
import org.proitec.legacy.service.TransacaoService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

public class Transacional {
    @Inject
    TransacaoService service;

    @Transactional
    public void iniciarTransacao(Cliente cliente, List<Produto> produtos) {
        Transacao transacao;
        transacao = new Transacao();
        transacao.setCliente(cliente);
        transacao.setProdutos(produtos);
        service.adicionarTransacao(transacao);
    }
}
