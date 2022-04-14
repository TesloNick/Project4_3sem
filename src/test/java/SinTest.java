import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinTest {

    @Test
    void getResult() {
        Sin Function = new Sin(1, 1, 0, 1);
        assertEquals(Math.sin(0.1), Function.getResult(0.1));
        //System.out.println(Function.getResult(0.1));
    }

}