import static org.junit.Assert.*;

import org.junit.Test;

public class NumbersUtilTest {

    @Test
    public void testIsOdd() {
        int[] oddNumbers = {1,3,99,201,203,1001};
        int[] evenNumbers = {2,4,100,500,1000};
        for (int oddNumber : oddNumbers) {
            assertTrue(NumbersUtil.isOdd(oddNumber));
        }
        for (int evenNumber : evenNumbers) {
            assertFalse(NumbersUtil.isOdd(evenNumber));
        }
    }

}
