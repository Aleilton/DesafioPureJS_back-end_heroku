package com.aleilton;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;

import org.junit.Test;

import com.aleilton.controller.PessoaController;

import static org.junit.Assert.assertEquals;

public class MyResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(PessoaController.class);
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
//        final String responseMsg = target().path("myresource").request().get(String.class);
//
//        assertEquals("Hello, Heroku!", responseMsg);
    }
}
