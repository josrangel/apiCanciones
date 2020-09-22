package com.chemasmas.jaxrs.netbeanssesion1.resources;

import com.chemasmas.jaxrs.netbeanssesion1.ServiceSesion1;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author 
 */

public class JavaEE8Resource implements ServiceSesion1 {
  
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
}
