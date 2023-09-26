package org.sad22.adapter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MallardDuckTest {

    private Duck mallard;

    @BeforeEach
    void setUp() {
        mallard = new MallardDuck();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void quack() {
        assertEquals("Quack", mallard.quack());
    }

    @Test
    void fly() {
        assertEquals("I'm flying", mallard.fly());
    }
}