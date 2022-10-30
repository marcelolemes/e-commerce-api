package org.proitec.legacy.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.proitec.legacy.model.Comercio;

import javax.inject.Inject;

@QuarkusTest
public class ComercioServiceTest {
    @Inject
    ComercioService comercioService;

    @Test
    @Order(1)
    void testaInsert() {
        Comercio comercio = new Comercio("TESTE1");
        Assertions.assertDoesNotThrow(() -> comercioService.adicionarComercio(comercio));
    }

    @Test
    @Order(2)
    void testaListar() {
        Assertions.assertNotNull(comercioService.listAll());
    }
}
