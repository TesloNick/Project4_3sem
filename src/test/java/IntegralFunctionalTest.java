import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegralFunctionalTest {

    @Test
    void calc() {
        Sum func = new Sum(1, 1, -2, 5);
        IntegralFunctional<Sum> example = new IntegralFunctional<>(1, 3);
        assertEquals(6.0, example.calc(func));
    }

    @Test
    void calc2() {
        SumAndDivision func = new SumAndDivision(1, 1, 1, 1, -2, 5);
        IntegralFunctional<SumAndDivision> example = new IntegralFunctional<>(1, 3);
        assertEquals(2.0, example.calc(func));
    }
}