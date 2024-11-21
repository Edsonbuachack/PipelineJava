package br.pipeline;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinhaClasseTest {

    @Test
    public void testSoma() {
        MinhaClasse minhaClasse = new MinhaClasse();
        assertEquals(5, minhaClasse.soma(2, 3));
    }

    @Test
    public void testSubtrai() {
        MinhaClasse minhaClasse = new MinhaClasse();
        assertEquals(1, minhaClasse.subtrai(3, 2));
    }

    @Test
    public void testMultiplica() {
        MinhaClasse minhaClasse = new MinhaClasse();
        assertEquals(6, minhaClasse.multiplica(2, 3));
    }

    @Test
    public void testDivide() {
        MinhaClasse minhaClasse = new MinhaClasse();
        assertThrows(ArithmeticException.class, () -> minhaClasse.divide(4, 0));
        assertEquals(2.0, minhaClasse.divide(4, 2));
    }
}
