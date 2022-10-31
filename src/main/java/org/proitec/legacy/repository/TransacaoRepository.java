package org.proitec.legacy.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.proitec.legacy.model.Cliente;
import org.proitec.legacy.model.Transacao;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class TransacaoRepository implements PanacheRepository<Transacao> {
    private static final String CAMPO = "cliente";

    public List<Transacao> findByCliente(Cliente cliente) {
        return list(CAMPO, cliente);
    }

}
