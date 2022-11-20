package org.proitec.legacy.rest;

import javax.ws.rs.core.Response;

public interface ControllerInterface {
    public Response get();
    public Response getPorParametro(String parametro);
}
