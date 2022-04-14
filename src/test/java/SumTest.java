import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void getResult() {
        Sum Function = new Sum(-2, 2, 1, 5);
        assertEquals(-2, Function.getResult(2));
    }

    @Test
    void getResult2() {
        Sum Function = new Sum(-2, 2, 1, 5);
        assertEquals(-2, Function.getResult(20));
    }
}