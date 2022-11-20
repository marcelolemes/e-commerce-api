package org.proitec.legacy.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.proitec.legacy.model.Cliente;
import org.proitec.legacy.model.Produto;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ProdutoRepository implements PanacheRepository<Produto> {
    private static final String CAMPO = "descricao";

    public List<Produto> findByDescricao(String descricao) {
        return list(CAMPO, descricao);
    }

}
