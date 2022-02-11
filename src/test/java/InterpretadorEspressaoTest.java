import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterpretadorEspressaoTest {

    InterpretadorExpressao ie = null;

    @BeforeEach
    void setUp() {
        ie = new InterpretadorExpressao(new InterpretadorOperacoes());
    }

    @Test
    void testSomar() {
        System.out.println("Running: testAdd");

        assertEquals(ie.interpretar("ADD 12 and 13"), 25);
    }

    @Test
    void testSubtrair() {
        System.out.println("Running: testSubtract");

        assertEquals(ie.interpretar("SUBTRACT 76 from 621"), 545);
    }
}
