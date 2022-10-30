package org.proitec.legacy.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.proitec.legacy.model.Comercio;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ComercioRepository implements PanacheRepository<Comercio> {


    public List<Comercio> findByDescricao(String descricao) {
        return list("descricao", descricao);
    }

}
