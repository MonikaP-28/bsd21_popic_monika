package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {

    private Calculator c;

    @BeforeEach
    public void setup() {
        c = new Calculator();
    }

    double result;

    @Test
    public void cAdd1() {
        Assertions.assertEquals(7, result = 4 + 3);
    }

    @Test
    public void cAdd2() {
        Assertions.assertEquals(4 + 3, c.add(4, 3));
    }

    @Test
    public void cMinus1() {
        Assertions.assertEquals(1, result = 3 - 2);
    }

    @Test
    public void cMinus2() {
        Assertions.assertEquals(3 - 2, c.minus(3, 2));
    }

    @Test
    public void cMultiply1() {
        Assertions.assertEquals(12, result = 4 * 3);
    }

    @Test
    public void cMultiply2() {
        Assertions.assertEquals(4 * 3, c.multiply(4, 3));
    }

    @Test
    public void cDivision1() {
        Assertions.assertEquals(3, result = 6 / 2);
    }

    @Test
    public void cDivision2() {
        Assertions.assertEquals(6 / 2, c.divide(6, 2));
    }

    @Test
    void exceptionTest(){
        Assertions.assertThrows(ArithmeticException.class,()-> c.divide(5,0));
    }

    @Test
    public void faculty1(){
        Assertions.assertEquals(120,c.faculty(5));
    }

    @Test
    public  void faculty2() {
        Assertions.assertEquals(0,c.faculty(-5));
    }

    @Test
    public void faculty3() {
        Assertions.assertEquals(720,c.faculty(6));
    }


}
