package org.proitec.legacy.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.proitec.legacy.model.Comercio;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComercioRepository implements PanacheRepository<Comercio> {

}
