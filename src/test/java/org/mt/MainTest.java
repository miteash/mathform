package org.mt;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        assertEquals(10, Main.add(5, 5));
    }

    @Test
    void mult() {
        assertEquals(25, Main.mult(5, 5));
    }
}