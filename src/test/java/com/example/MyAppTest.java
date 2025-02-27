package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

public class MyAppTest {

    @Test
    public void testGetClasses() {
        MyApp app = new MyApp();
        Set<Class<?>> classes = app.getClasses();
        assertTrue(classes.contains(HelloWorldResource.class));
    }
}
