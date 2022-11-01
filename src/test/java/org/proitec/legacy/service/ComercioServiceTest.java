package org.proitec.legacy.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.proitec.legacy.model.Comercio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;

@QuarkusTest
public class ComercioServiceTest {
    Logger log = LoggerFactory.getLogger(ComercioServiceTest.class);
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


    @Test
    @Order(3)
    void testaConsulta() {
        List<?> comercios = comercioService.buscarPorDescricao("TESTE1");
        Assertions.assertNotNull(comercios);
    }


}
