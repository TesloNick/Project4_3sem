import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumAndDivisionTest {

    @Test
    void getResult() {
        SumAndDivision Function = new SumAndDivision(1, 2, 2, 2, 0, 10);
        assertEquals(0.75, Function.getResult(1));
    }

    @Test
    void getResult2() {
        SumAndDivision Function = new SumAndDivision(1, 5, 1, 0, 0, 10);
        Function.getResult(15);
    }
}