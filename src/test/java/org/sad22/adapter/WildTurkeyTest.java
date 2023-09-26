package org.sad22.adapter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WildTurkeyTest {

    Turkey wildTurkey;

    @BeforeEach
    void setUp() {
        wildTurkey = new WildTurkey();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void gobble() {
        assertEquals("Gobble gobble", wildTurkey.gobble());
    }

    @Test
    void fly() {
        assertEquals("I'm flying a short distance", wildTurkey.fly());
    }
}