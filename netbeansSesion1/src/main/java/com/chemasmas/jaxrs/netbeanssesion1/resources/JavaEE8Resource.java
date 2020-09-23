package com.chemasmas.jaxrs.netbeanssesion1.resources;

import com.chemasmas.jaxrs.netbeanssesion1.ServiceSesion1;
import javax.ws.rs.core.Response;

/**
 *
 * @author 
 */

public class JavaEE8Resource implements ServiceSesion1 {
  
    @Override
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
}
