package org.proitec.legacy.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.proitec.legacy.model.Cliente;
import org.proitec.legacy.model.Comercio;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ClienteRepository implements PanacheRepository<Cliente> {
    private static final String CAMPO = "nome";
    private static final String CPF = "cpf";

    public List<Cliente> findByNome(String nome) {
        return list(CAMPO, nome);
    }

    public List<Cliente> findByCpf(String cpf) {
        return list(CPF, cpf);
    }

}
