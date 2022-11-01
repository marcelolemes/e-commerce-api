package org.proitec.legacy.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.proitec.legacy.model.Cliente;

import javax.inject.Inject;
import java.util.List;

@QuarkusTest
class ClienteServiceTest {

    @Inject
    ClienteService clienteService;

    @Test
    @Order(1)
    void testaInsert() {
        Cliente cliente = new Cliente("TESTE1", "123456789");
        Assertions.assertDoesNotThrow(() -> clienteService.adicionarCliente(cliente));
    }


    @Test
    @Order(2)
    void testaListar() {
        Assertions.assertNotNull(clienteService.listAll());
    }


    @Test
    @Order(3)
    void testaConsultaPorCpf() {
        List<?> comercios = clienteService.buscarPorCpf("123456789");
        Assertions.assertNotNull(comercios);
    }

    @Test
    @Order(4)
    void testaConsultaPorNome() {
        List<?> comercios = clienteService.buscarPorNome("TESTE1");
        Assertions.assertNotNull(comercios);
    }

}