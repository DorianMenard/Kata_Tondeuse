package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TondeusePositionTest {

    @Test
    void gauche() {
        TondeusePosition tondeusePosition = new TondeusePosition(1, 1, Direction.N);
        tondeusePosition.gauche();
        assertEquals(Direction.W, tondeusePosition.getDirection());
    }

    @Test
    void droite() {
        TondeusePosition tondeusePosition = new TondeusePosition(1, 1, Direction.N);
        tondeusePosition.droite();
        assertEquals(Direction.E, tondeusePosition.getDirection());
    }

    @Test
    void testAvancerNord() {
        TondeusePosition tondeusePosition = new TondeusePosition(1, 1, Direction.N);
        tondeusePosition.avancer();
        assertEquals(1, tondeusePosition.getX());
        assertEquals(2, tondeusePosition.getY());
    }

    @Test
    void testAvancerEst() {
        TondeusePosition tondeusePosition = new TondeusePosition(1, 1, Direction.E);
        tondeusePosition.avancer();
        assertEquals(2, tondeusePosition.getX());
        assertEquals(1, tondeusePosition.getY());
    }

    @Test
    void testAvancerOuest() {
        TondeusePosition tondeusePosition = new TondeusePosition(2, 2, Direction.W);
        tondeusePosition.avancer();
        assertEquals(1, tondeusePosition.getX());
        assertEquals(2, tondeusePosition.getY());
    }

    @Test
    void testAvancerSud() {
        TondeusePosition tondeusePosition = new TondeusePosition(2, 2, Direction.S);
        tondeusePosition.avancer();
        assertEquals(2, tondeusePosition.getX());
        assertEquals(1, tondeusePosition.getY());
    }
}