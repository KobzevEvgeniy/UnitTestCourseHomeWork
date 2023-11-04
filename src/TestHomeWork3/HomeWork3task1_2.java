import org.example.HomeWork3.HomeWork3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeWork3task1_2 {
    @Test

    public void testIfTrueEven0ddNumber(){
        assertTrue( HomeWork3.evenOddNumber(2));
    }

    @Test
    public void testIfFalseEven0ddNumber(){
        assertFalse(HomeWork3.evenOddNumber(5));
    }


    @Test
    public void testIfTrueInterval(){
        assertTrue( HomeWork3.numberInInterval(99));
    }

    @Test
    public void testIfFalseInterval(){
        assertFalse(HomeWork3.numberInInterval(5));
    }
}
