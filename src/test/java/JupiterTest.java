import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class JupiterTest {
    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        if (calc.add(1, 5) != 6) {
            fail("Not yet implemented");
        }
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        if (calc.subtract(7, 5) != 2) {
            fail("Not yet implemented");
        }
    }

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        if (calc.multiply(5, 5) != 25) {
            fail("Not yet implemented");
        }
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        if (calc.divide(10, 5) != 2) {
            fail("Not yet implemented");
        }
    }
}
