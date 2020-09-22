/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemasmas.jaxrs.netbeanssesion1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author eva_0
 */
@Path("javaee8")
public interface ServiceSesion1 {
 
    @GET
    public Response ping();
}
