package org.proitec.legacy.rest;

import javax.ws.rs.GET;
import javax.ws.rs.core.Response;

public interface ControllerInterface {
    @GET
    public Response get();

    @GET
    public Response getPorParametro(String parametro);
}
