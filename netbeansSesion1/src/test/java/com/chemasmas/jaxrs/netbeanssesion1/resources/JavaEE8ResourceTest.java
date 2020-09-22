/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemasmas.jaxrs.netbeanssesion1.resources;

import javax.ws.rs.core.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author eva_0
 */
public class JavaEE8ResourceTest {
    
    @org.junit.jupiter.api.Test
    public void testPing() {
        System.out.println("ping");
        JavaEE8Resource instance = new JavaEE8Resource();
        Response expResult = null;
        Response result = instance.ping();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
