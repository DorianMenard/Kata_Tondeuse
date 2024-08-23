package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurfaceTest {

    @Test
    void testInSurface() {
        Surface surface = new Surface(5, 5);
        TondeusePosition tondeusePosition = new TondeusePosition(2, 3, Direction.N);
        assertTrue(surface.inSurface(tondeusePosition));
    }

    @Test
    void testHorsSurface() {
        Surface surface = new Surface(5, 5);
        TondeusePosition tondeusePosition = new TondeusePosition(6, 7, Direction.N);
        assertFalse(surface.inSurface(tondeusePosition));
    }

    @Test
    void testBordureSurface() {
        Surface surface = new Surface(5, 5);
        TondeusePosition tondeusePosition = new TondeusePosition(5, 5, Direction.N);
        assertTrue(surface.inSurface(tondeusePosition));
    }
}