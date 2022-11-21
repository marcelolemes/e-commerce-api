package org.proitec.legacy.rest;

import org.proitec.legacy.model.Cliente;
import org.proitec.legacy.model.Comercio;
import org.proitec.legacy.model.Transacao;
import org.proitec.legacy.service.TransacaoService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/transacao")
public class TransacaoController implements ControllerInterface {

    @Inject
    TransacaoService service;

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        return Response.ok(service.listAll()).build();
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPorCliente(Cliente cliente) {
        return Response.ok(service.buscarPorCliente(cliente)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(@Valid Transacao transacao) {
        return Response.ok(service.adicionarTransacao(transacao)).build();
    }

    @Override
    public Response getPorParametro(String parametro) {
        return null;
    }
}
