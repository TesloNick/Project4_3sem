import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumFunctionalTest {

    @Test
    void calc() {
        Sum func = new Sum(1, 1, 0, 4);
        SumFunctional<Sum> example = new SumFunctional<>(0, 6);
        assertEquals(9.0, example.calc(func));
    }

    @Test
    void calc2() {
        SumAndDivision func = new SumAndDivision(1, 1, 1, 1, 0, 4);
        SumFunctional<SumAndDivision> example = new SumFunctional<>(0, 6);
        assertEquals(3.0, example.calc(func));
    }
}