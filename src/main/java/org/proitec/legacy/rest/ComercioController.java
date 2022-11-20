package org.proitec.legacy.rest;


import org.proitec.legacy.model.Comercio;
import org.proitec.legacy.service.ComercioService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/comercio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ComercioController implements ControllerInterface {
    @Inject
    ComercioService comercioService;

    @Override
    @GET
    public Response get() {
        return Response.ok(comercioService.listAll()).build();
    }

    @Override
    @GET
    @Path("{descricao}")
    public Response getPorParametro(@PathParam("descricao") String descricao) {
        return Response.ok(comercioService.buscarPorDescricao(descricao)).build();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insert(@Valid Comercio comercio) {
        return Response.ok(comercioService.adicionarComercio(comercio)).build();
    }

}
