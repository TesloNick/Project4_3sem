import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpTest {

    @Test
    void getResult() {
        Exp Function = new Exp(1, 0, 0, 2);
        assertEquals(Math.exp(1), Function.getResult(1));
        //System.out.println(Function.getResult(1));
    }
}