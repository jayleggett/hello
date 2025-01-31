package com.me;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloTest {


    @Test
    void testName(){
        Hello h = new Hello("name",1);
        Assertions.assertEquals("name",h.name);
    }

    @Test
    void testId(){
        Hello h = new Hello("name",1);
        Assertions.assertEquals(1,h.id);
    }
}
