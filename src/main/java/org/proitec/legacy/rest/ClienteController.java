package org.proitec.legacy.rest;


import org.proitec.legacy.model.Cliente;
import org.proitec.legacy.service.ClienteService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/comercio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteController implements ControllerInterface {
    @Inject
    ClienteService service;

    @GET
    public Response get() {
        return Response.ok(service.listAll()).build();
    }

    @Override
    public Response getPorParametro(String nome) {
        return Response.ok(service.buscarPorNome(nome)).build();
    }

    @POST
    public Response insert(@Valid Cliente cliente) {
        return Response.ok(service.adicionarCliente(cliente)).build();
    }

}
