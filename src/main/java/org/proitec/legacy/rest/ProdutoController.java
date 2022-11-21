package org.proitec.legacy.rest;

import org.proitec.legacy.model.Produto;
import org.proitec.legacy.service.ProdutoService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/produto")
public class ProdutoController implements ControllerInterface {

    @Inject
    ProdutoService service;

    @Override
    @GET
    public Response get() {
        return Response.ok(service.listAll()).build();
    }

    @Override
    @GET
    public Response getPorParametro(String descricao) {
        return Response.ok(service.buscarPorDescricao(descricao)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insert(@Valid Produto produto) {
        return Response.ok(service.adicionarProduto(produto)).build();
    }

}
