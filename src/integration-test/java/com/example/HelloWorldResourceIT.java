package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldResourceIT {

    private static Client client;
    private static WebTarget target;

    @BeforeAll
    public static void setUp() {
        client = ClientBuilder.newClient();
        target = client.target("http://localhost:8080/api/hello");  // Asegúrate de que la URL coincide con tu despliegue
    }

    @Test
    public void testHelloEndpoint() {
        Response response = target.request().get();
        assertEquals(200, response.getStatus());
        assertEquals("Hello, World!", response.readEntity(String.class));
    }

    @AfterAll
    public static void tearDown() {
        client.close();
    }
}
