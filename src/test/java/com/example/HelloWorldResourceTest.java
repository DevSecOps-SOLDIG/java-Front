package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldResourceTest {

    @Test
    public void testSayHello() {
        HelloWorldResource resource = new HelloWorldResource();
        String response = resource.sayHello();
        assertEquals("Hello, World!", response);
    }
}
