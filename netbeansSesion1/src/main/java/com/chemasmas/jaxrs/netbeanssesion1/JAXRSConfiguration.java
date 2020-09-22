package com.chemasmas.jaxrs.netbeanssesion1;

import com.chemasmas.jaxrs.netbeanssesion1.resources.JavaEE8Resource;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configures JAX-RS for the application.
 * @author Juneau
 */
@ApplicationPath("resources")
public class JAXRSConfiguration extends Application {
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> h = new HashSet<>();
        h.add( JavaEE8Resource.class );
//        h.add(NuevoServicio.class);
        //h.add(Clase2.class);
        return h;
    }
}
