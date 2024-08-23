package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TondeuseTest {

    @Test
    void testInstruction() {
        Surface surface = new Surface(5, 5);
        TondeusePosition tondeusePosition = new TondeusePosition(1, 2, Direction.N);
        Tondeuse tondeuse = new Tondeuse(tondeusePosition, surface);

        tondeuse.instructions("GAGAGAGAA");
        assertEquals("1 3 N", tondeuse.getPosition().toString());
    }

}